# To complete the test task you need:

0) ### Prerequisites
Ensure you have the following software installed:

- <a href ="https://docs.docker.com/desktop/setup/install/windows-install/">Docker</a>
- <a href ="https://git-scm.com/downloads">Git</a>
- <a href ="https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html">Java 17</a>

<br><br>

1) ### Create a **fork** of this repository to work with
<div style="margin-left: 10%">
    <div>
        <img src="https://github.com/user-attachments/assets/b590d40a-d522-425a-ab50-afa658198e3e" width="80%" alt="Select Fork">
    </div>
    <div>
        <img src="https://github.com/user-attachments/assets/eb444a95-956c-47b8-ad48-388b7f103947" width="80%" alt="Fill in the Name and proceed">
    </div>
</div>
<br><br>

2) ### Create Postgres Docker Container  
   - Open console ( cmd or else)
   - Navigate to Java IfortexTest Task folder
   - run command "docker-compose up"
<br><br>
3) ### Implement methods to meet the requirements.
    - Write Sql in @Query(value = "", nativeQuery = true) in SessionRepository.getFirstDesktopSession() so it returns **the first(earliest)** **desktop** Session
    - Implement SessionService.getFirstDesktopSession()  using SessionRepository.getFirstDesktopSession() so it returns **the first(earliest)** **desktop** Session
    - -----
    - Write Sql in @Query(value = "", nativeQuery = true) in SessionRepository.getSessionsFromActiveUsersEndedBefore2025() so it returns only Sessions from **Active** users that were **ended before 2025 sort by startedAtUtc in descending order**
    - Implement SessionService.getSessionsFromActiveUsersEndedBefore2025()  using SessionRepository.getSessionsFromActiveUsersEndedBefore2025() so it returns only Sessions from **Active** users that were **ended before 2025 sort by startedAtUtc in descending order**
    - -----
    - Write Sql in @Query(value = "", nativeQuery = true) in UserRepository.getUserWithMostSessions() so it returns a User with **the biggest amount** of sessions
    - Implement UserService.getUserWithMostSessions() method of UserService using UserRepository.getUserWithMostSessions() so it returns a User with **the biggest amount** of sessions
    - -----
    - Write Sql in @Query(value = "", nativeQuery = true) in UserRepository.getUsersWithAtLeastOneMobileSession() so it returns Users that have **at least 1 Mobile session sort by startedAtUtc in descending order**
    - Implement UserService.getUsersWithAtLeastOneMobileSession() method of UserService using UserRepository.getUsersWithAtLeastOneMobileSession()  so it returns Users that have **at least 1 Mobile session sort by startedAtUtc in descending order**
    
    **IMPORTANT**:  Do **NOT** change any files except of SessionService, UserService, SessionRepository, UserRepository
<br><br>
4) ### Check that all Api's returns response with 200 ok status and correct data
   - http://localhost:8080/api/sessions/active-users-ended-before-2025 ( returns only Sessions from **Active** users that were **ended before 2025 sort by startedAtUtc in descending order** )
   - http://localhost:8080/api/sessions/first-desktop ( returns **the first(earliest)** **desktop** Session )
   - http://localhost:8080/api/users/most-active ( returns a User with **the biggest amount** of sessions )
   - http://localhost:8080/api/users/with-mobile-sessions ( returns Users that has **at least 1 Mobile session sort by startedAtUtc in descending order** )

5) ### Commit and push your code
<br><br>

6) ### Provide us a **link** to your fork of the test-task repository
<div style="margin-left: 10%">
    <img src="https://github.com/user-attachments/assets/d0de99c3-5786-4306-a5f0-1d558c43744d" width="80%" alt="Check the commited code and provide the url">
</div>
<br><br>

7) ### **Do NOT** contribute against the original test-task repository
<div style="margin-left: 10%">
    <img src="https://github.com/user-attachments/assets/91433d67-6883-4fed-b7ad-bf6421fe6e8c" width="80%" alt="Do not contribute to the original repo">
</div>
