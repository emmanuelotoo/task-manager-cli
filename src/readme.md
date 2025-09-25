# Task CLI

A simple command-line task tracker to create, list, update, and delete personal tasks. Strengthened my use of OOP
concepts building this.

## How to run

- Requirements:
    - Java 21
- Steps:
    1. Compile:
        - On Linux/macOS:
            - javac -d out src/*.java
        - On Windows (PowerShell/CMD):
            - javac -d out src\*.java
    2. Run:
        - On Linux/macOS:
            - java -cp out Main
        - On Windows:
            - java -cp out Main

## How to use

- Follow the menu:
    - 1: Create a task (enter a title)
    - 2: List all tasks
    - 3: Update a task’s status (enter task ID, then choose status)
    - 4: Delete a task (enter task ID)
    - 5: Exit
- Input numbers when prompted; press Enter to confirm.