import org.junit.*;

/**
 * Created by accas on 03/10/2017.
 */
public class StudentTest {
    @Test
    public void studentNameTest() {
        Student s = new Student();
        s.setAge(22);
        s.setDOB("10/06/1995");
        s.setName("John Joe");
        s.setId(14267485);

        Assert.assertEquals(s.getUsername(), s.getName() + s.getAge());
    }

}
