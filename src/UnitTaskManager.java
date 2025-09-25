public class UnitTaskManager {
public static void main(String[] args) {
    TaskManager manager1 = new TaskManager();

    manager1.addTask("watching football"); // testing the addTask method
    manager1.addTask("reviewing java");

    manager1.listTask();  // testing the list Tasks method

    manager1.updateStatus(1,Status.PENDING); // testing the updateStatus method
    manager1.updateStatus(2, Status.IN_PROGRESS);
    manager1.listTask();

    manager1.deleteTask(1); // testing the deleteTask method
    manager1.listTask();
}
}
