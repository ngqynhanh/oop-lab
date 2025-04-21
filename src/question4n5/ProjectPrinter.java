package question4n5;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;

public class ProjectPrinter implements Runnable{
    private Project project;

    public ProjectPrinter (Project p) {
        this.project = p;
    }
    @Override
    public void run() {
        ArrayList<Employee> listOfEmployees = project.getListOfEmployees();

        // get formatted dates
        String projectStr = "[Project Id: " + project.getProjectId() + " - " + "Project Duration::" + project.getStartDate() + " to "
                + project.getEndDate() + "]";
        System.out.println(projectStr);

        Collections.sort(listOfEmployees);

        for (Employee e : listOfEmployees) {
            System.out.println(e.toString());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                throw new RuntimeException(ex);
            }
        }
    }
}
