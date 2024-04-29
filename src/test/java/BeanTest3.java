import com.itheima.Bean3;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanTest3 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationBean3.xml");
        Bean3 bean3 = (Bean3)classPathXmlApplicationContext.getBean("bean3");
        System.out.println(bean3);
    }
}
