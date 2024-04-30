import com.itheima.controller.UserController;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserController bean = (UserController)classPathXmlApplicationContext.getBean("userController");
        bean.save();

    }
}
