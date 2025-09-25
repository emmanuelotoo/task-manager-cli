public class Task {

    private final int id;
    private final String activity;
    private Status status;

    public Task(int id, String activity) {
        this.id = id;
        this.activity = activity;
        this.status = Status.PENDING; // so we'll keep every new task default at first
    }

    public int getId() {return id;}
    public String getActivity() {return activity;}
    public Status getStatus() {return status;}

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() { // since when we're returning objects we'd be returning their location in
        return "Task{" +       // memory so we'd need to convert that into string
                "id=" + id +
                ", activity='" + activity + '\'' +
                ", status=" + status +
                '}';
    }

}
