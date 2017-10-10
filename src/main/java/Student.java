/**
 * Created by accas on 03/10/2017.
 */
public class Student {
    private String name;
    private String DOB;
    private int age;
    private String username;
    private int id;

    public String getName() {
        return name;
    }

    public String getDOB() {
        return DOB;
    }

    public int getAge() {
        return age;
    }

    public String getUsername() {
        this.username = name + age;
        return username;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setId(int id) {
        this.id = id;
    }
}

