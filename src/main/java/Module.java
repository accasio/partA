/**
 * Created by accas on 03/10/2017.
 */
public class Module {
    private String moduleName;
    private String id;
    private Student[] students;

    public Module(String moduleName, String id, Student[] students) {
        this.moduleName = moduleName;
        this.id = id;
        this.students = students;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }
}
