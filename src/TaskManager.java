import java.util.ArrayList;
import java.util.List;

public class TaskManager {

    private final List<Task> tasks;
    private int nextId;
    public TaskManager() {  // so as we create a new TaskManager for every empty new 'tasks' and we assign an ID of 1 to it
        tasks = new ArrayList<>();
        nextId = 1;
    }

    public void addTask(String activity) { // creating a new activity now
        Task task = new Task(nextId++, activity);
        tasks.add(task);
        System.out.println("your activity has been added.");
    }

    public void listTask() {  // listing all the activities we have to do
        if (tasks.isEmpty()) {
            System.out.println("You don't have any activities as of now");
            return;
        }
        for (Task task : tasks) {
            System.out.println(task);
        }
    }

    public void updateStatus(int id, Status newStatus) {  // setting the status of the new task we have to do

//        tasks.forEach(task -> {
//            if (task.getId() == id) {
//                task.setStatus(newStatus);
//            }
//        });

        for (Task task : tasks) {
            if (task.getId() == id) {
                task.setStatus(newStatus);
                System.out.println("your activity status has been updated to " + newStatus);
                return;
            }
        }
        System.out.println("your activity has not been found");
    }

    public void deleteTask(int id) { // deleting a task by its id
        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).getId() == id) {
                tasks.remove(i);
                break;
            }
        }
    }
}
