package question4n5;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

public class DeadlineTracker {
    public void checkDeadlines(Project project) {
        System.out.println("Your project is due at " + project.getEndDate());
    }
}
