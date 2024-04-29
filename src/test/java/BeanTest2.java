import com.itheima.Bean2;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanTest2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationBean2.xml");
        Bean2 bean2 = (Bean2)classPathXmlApplicationContext.getBean("bean2");
        System.out.println(bean2);
    }
}
