package com.example.java_ifortex_test_task.repository;

import com.example.java_ifortex_test_task.entity.DeviceType;
import com.example.java_ifortex_test_task.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    @Query(value = """
            SELECT u.*
            FROM users u
            JOIN (
                SELECT DISTINCT s.user_id
                FROM sessions s
                WHERE s.device_type = ?1
            ) AS t ON u.id = t.user_id
            """, nativeQuery = true)
    List<User> getUsersWithAtLeastOneSessionWithType(DeviceType deviceType);

    @Query(
            value = """
                SELECT u.* FROM users u
                JOIN (
                    SELECT user_id, COUNT(*) AS cnt
                    FROM sessions
                    GROUP BY user_id
                    ORDER BY cnt DESC
                    LIMIT 1
                ) top_user ON u.id = top_user.user_id;
      """,
            nativeQuery = true
    )
    User getUserWithMostSessions();
}
