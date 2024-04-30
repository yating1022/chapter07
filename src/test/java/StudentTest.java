import com.itheima.Student;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationStudent.xml");
        Student bean = (Student)classPathXmlApplicationContext.getBean("student");
        System.out.println(bean);
        classPathXmlApplicationContext.registerShutdownHook();
    }
}
