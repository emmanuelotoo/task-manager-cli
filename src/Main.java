import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        TaskManager manager = new TaskManager();

        while(true) {

            System.out.println("My personal Task tracker");
            System.out.println("1. create a task");
            System.out.println("2. List all my tasks");
            System.out.println("3. Update the status of my task");
            System.out.println("4. Delete a task");
            System.out.println("5. Exit ");
            System.out.print("Pick an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter the name of your task");
                    String title = scanner.nextLine();
                    manager.addTask(title);
                    break;

                case 2:
                    manager.listTask();
                    break;

                case 3:
                    System.out.println("Enter the id of the task you want to update");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter the Status of the task you want to change to. 1. PENDING, 2. IN_PROGRESS 3. DONE");
                    int statusChoice = scanner.nextInt();
                    Status newStatus = switch (statusChoice) {
                        case 2 -> Status.IN_PROGRESS;
                        case 3 -> Status.DONE;
                        default -> Status.PENDING;
                    };
                    manager.updateStatus(id, newStatus);
                    break;

                case 4:
                    System.out.println("Enter the id of the task you want to delete");
                    int del = scanner.nextInt();
                    scanner.nextLine();
                    manager.deleteTask(del);
                    System.out.println("Your task has been deleted");
                    break;

                case 5:
                    System.out.println("I'll see you later");
                    return;

                default:
                    System.out.println("Your request is invalid");
            }
        }
    }
}
