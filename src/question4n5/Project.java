package question4n5;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

public class Project {
    private String projectId;
    private Date startDate;
    private Date endDate;
    private ArrayList<Employee> listOfEmployees;
    private ArrayList<Task> listOfTasks;
    private String priority;
    private String isCompleted = "Not completed";

    // initialize date formatter
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

    public Project(String projectId, Date startDate, Date endDate) {
        this.projectId = projectId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.listOfEmployees = new ArrayList<>();
        this.listOfTasks = new ArrayList<>();
    }

    public Project(String projectId, String priority, Date startDate, Date endDate) {
        this.projectId = projectId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.priority = priority;
        this.listOfEmployees = new ArrayList<>();
        this.listOfTasks = new ArrayList<>();
    }

    public String getProjectId() {
        return projectId;
    }

    public String getStartDate() {
        return formatter.format(startDate);
    }

    public String getEndDate() {
        return formatter.format(endDate);
    }

    public ArrayList<Employee> getListOfEmployees() {
        return listOfEmployees;
    }

    public ArrayList<Task> getListOfTasks() {
        return listOfTasks;
    }

    public void setPriority(String priority) {
        if (priority.equalsIgnoreCase("HIGH") || priority.equalsIgnoreCase("LOW") || priority.equalsIgnoreCase("MEDIUM"))
            this.priority = priority;
    }

    public void setIsCompleted(String isCompleted) {
        this.isCompleted = isCompleted;
    }

    public String getIsCompleted() {
        return isCompleted;
    }

    public String getPriority() {
        return priority;
    }

    public void addEmployee(Employee employee) {
        listOfEmployees.add(employee);
    }

    public Integer estimateBudget() {
        long estimate = 0;
        for (Employee e : listOfEmployees) {
            long durationInMillis = endDate.getTime() - startDate.getTime();
            long durationInDays = durationInMillis / (1000 * 60 * 60 * 24);
            estimate = e.getSalaryPerHour() * 24 * (int) durationInDays;
        }
        return Integer.parseInt(String.valueOf(estimate));
    }

    @Override
    public String toString() {
        String employeeString = "";

        Collections.sort(listOfEmployees);

        for (Employee e : listOfEmployees) {
            employeeString += (e.toString()) + "\n";
        }

        return employeeString;
    }

    public void addTask(Task task) {
        listOfTasks.add(task);
    }


}
