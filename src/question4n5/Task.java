package question4n5;

public class Task {
    private String description;
    private Employee assignedEmployee;

    public Task(String x) {
        description = x;
    }

    public String getDescription() {
        return description;
    }

    public void setAssignedEmployee(Employee e){
        assignedEmployee = e;
    }

    public Employee getAssignedEmployee() {
        return assignedEmployee;
    }
}
