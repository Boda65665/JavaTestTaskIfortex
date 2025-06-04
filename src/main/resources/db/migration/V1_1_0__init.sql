CREATE TABLE users (
                       id SERIAL PRIMARY KEY,
                       first_name VARCHAR(50) NOT NULL,
                       last_name VARCHAR(50) NOT NULL,
                       middle_name VARCHAR(50),
                       email VARCHAR(100) UNIQUE NOT NULL,
                       deleted BOOLEAN DEFAULT false
);

CREATE TABLE sessions (
                          id SERIAL PRIMARY KEY,
                          device_type integer NOT NULL CHECK (device_type IN (0, 1)),
                          ended_at_utc TIMESTAMP,
                          started_at_utc TIMESTAMP NOT NULL,
                          user_id INTEGER NOT NULL,
                          CONSTRAINT fk_user
                              FOREIGN KEY(user_id)
                                  REFERENCES users(id)
                                  ON DELETE CASCADE
);

CREATE INDEX idx_sessions_user_id ON sessions(user_id);

INSERT INTO users (first_name, last_name, middle_name, email, deleted)
VALUES
    ('John', 'Smith', 'Michael', 'john.smith@example.com', false),
    ('Emily', 'Johnson', 'Anne', 'emily.johnson@example.com', false),
    ('Michael', 'Williams', 'James', 'michael.williams@example.com', false),
    ('Sarah', 'Brown', 'Elizabeth', 'sarah.brown@example.com', false),
    ('David', 'Jones', 'Robert', 'david.jones@example.com', false),
    ('Jessica', 'Garcia', 'Marie', 'jessica.garcia@example.com', true),
    ('Robert', 'Miller', 'Thomas', 'robert.miller@example.com', false),
    ('Jennifer', 'Davis', 'Louise', 'jennifer.davis@example.com', true),
    ('William', 'Rodriguez', 'Joseph', 'william.rodriguez@example.com', false),
    ('Elizabeth', 'Martinez', 'Grace', 'elizabeth.martinez@example.com', false)
    ON CONFLICT (email) DO NOTHING;

INSERT INTO sessions (device_type, ended_at_utc, started_at_utc, user_id)
VALUES
    (0, '2023-06-15 14:30:00', '2023-06-15 12:00:00', 1),
    (1, '2023-06-15 15:45:00', '2023-06-15 14:35:00', 1),
    (0, '2023-06-16 10:20:00', '2023-06-16 09:00:00', 2),
    (1, '2023-06-16 18:00:00', '2023-06-16 17:30:00', 3),
    (0, '2023-06-17 11:15:00', '2023-06-17 10:00:00', 4),

    (1, NULL, '2023-06-17 15:00:00', 5),
    (0, NULL, '2023-06-18 12:00:00', 6),
    (1, NULL, '2023-06-18 18:00:00', 7),
    (0, NULL, '2023-06-19 08:30:00', 8),
    (1, NULL, '2023-06-19 13:00:00', 9),
    (0, NULL, '2023-06-20 11:00:00', 10),
    (1, NULL, '2023-06-20 16:00:00', 1),

    (0, '2023-06-21 10:45:00', '2023-06-21 09:30:00', 2),
    (1, '2023-06-21 15:15:00', '2023-06-21 14:00:00', 3),
    (0, '2023-06-22 11:30:00', '2023-06-22 10:00:00', 4),
    (1, '2023-06-23 14:30:00', '2023-06-23 13:00:00', 7),
    (0, '2023-06-23 18:45:00', '2023-06-23 17:30:00', 8);