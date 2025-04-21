package question4n5;

public class Report {
    public void reportGenerator(Project p) {
        System.out.println();
        System.out.println("Project ID: " + p.getProjectId());
        System.out.println("Project start date: " + p.getStartDate());
        System.out.println("Project end date: " + p.getEndDate());
        System.out.println("Project priority: " + p.getPriority());
        System.out.println("Project status: " + p.getIsCompleted());

        for (Task t: p.getListOfTasks()) {
            System.out.println("Task " + t.getDescription() + " assigned to: " + t.getAssignedEmployee());
        }
    }
}
