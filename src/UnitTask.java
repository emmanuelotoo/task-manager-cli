public class UnitTask {
    public static void main(String[] args) {
        Task task = new Task(1, "learning java");
        System.out.println(task);
        task.setStatus(Status.IN_PROGRESS);
        System.out.println(task);
    }
}

