package question4n5;

import java.util.ArrayList;

public class Employee implements Comparable<Employee>{
    private String employeeId;
    private String employeeName;
    private int salaryPerHour;
    private int noOfLeavingDay;
    private int noOfTravelDay;
    private ArrayList<Project> ListOfProjects;
    private ArrayList<Task> listOfTasks;

    public Employee (String employeeId, String employeeName, int salaryPerHour, int noOfLeavingDay, int noOfTravelDay) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salaryPerHour = salaryPerHour;
        this.noOfLeavingDay = noOfLeavingDay;
        this.noOfTravelDay = noOfTravelDay;
        ListOfProjects = new ArrayList<>();
        listOfTasks = new ArrayList<>();
    }

    public int calculateWeeklySalary() {
        return salaryPerHour * 8*(5 - noOfLeavingDay + noOfTravelDay / 2);
    }

    @Override
    public int compareTo(Employee e) {
        if (this.noOfTravelDay != e.noOfTravelDay) {
            return Integer.compare(e.noOfTravelDay, this.noOfTravelDay);
        }
        return Integer.compare(this.noOfLeavingDay, e.noOfLeavingDay);
    }

    public String toString() {
        return "[Name:" + employeeName +" - Salary Per Hour:" + salaryPerHour + " - Weekly Salary:" + calculateWeeklySalary() + "]";
    }

    public int getSalaryPerHour() {
        return salaryPerHour;
    }

    public void addTask(Task task) {
        listOfTasks.add(task);
    }
}
