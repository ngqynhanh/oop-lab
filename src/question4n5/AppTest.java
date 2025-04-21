package question4n5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class AppTest {
    public static void main(String[] args) throws ParseException {
        TaskManager taskManager = new TaskManager();
        // initialize date formatter
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);

        // create project object
        Project project = new Project("1", sdf.parse("01/01/2023"), sdf.parse("01/31/2023"));
        project.setPriority("HIGH");

        Employee employee1 = new Employee("1", "John", 20, 2, 3);
        Employee employee2 = new Employee("2", "Jane", 25, 1, 4);
        Employee employee3 = new Employee("3", "Alice", 30, 0, 5);
        Employee employee4 = new Employee("4", "Bob", 15, 3, 2);

        // add employees to project
        project.addEmployee(employee1);
        project.addEmployee(employee2);
        project.addEmployee(employee3);
        project.addEmployee(employee4);

        project.estimateBudget();
        System.out.println("Estimated Budget: " + project.estimateBudget());
        // System.out.println("Employees sorted by travel days and leave days: \n" + project.toString());
        ProjectPrinter projectPrinter = new ProjectPrinter(project);
        projectPrinter.run();

        Task t1 = new Task("a");
        Task t2 = new Task("b");

        // Assign tasks and employees to project
        project.addTask(t1);
        project.addTask(t2);

        taskManager.assignTask(employee1, t1);
        taskManager.assignTask(employee2, t2);

        project.setIsCompleted("DONE");

        // Project Status Report System
        Report report = new Report();
        report.reportGenerator(project);

        // Deadline Tracking & Notifications
        DeadlineTracker deadlineTracker = new DeadlineTracker();
        deadlineTracker.checkDeadlines(project);
    }
}
