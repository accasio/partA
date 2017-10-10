/**
 * Created by accas on 03/10/2017.
 */
import org.joda.time.*;

public class Course {
    private String courseName;
    private Module[] modules;
    private DateTime startDate;
    private DateTime endDate;

    public Course(String courseName, Module[] modules, DateTime startDate, DateTime endDate) {
        this.courseName = courseName;
        this.modules = modules;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Module[] getModules() {
        return modules;
    }

    public void setModules(Module[] modules) {
        this.modules = modules;
    }

    public DateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(DateTime startDate) {
        this.startDate = startDate;
    }

    public DateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(DateTime endDate) {
        this.endDate = endDate;
    }
}
