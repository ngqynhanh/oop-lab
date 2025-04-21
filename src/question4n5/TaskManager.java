package question4n5;

public class TaskManager {
    public void assignTask(Employee e, Task t) {
        t.setAssignedEmployee(e);
        e.addTask(t);
    }
}
