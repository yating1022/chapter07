import com.itheima.Bean1;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeText {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationBean1.xml");
        Bean1 bean1 = (Bean1)classPathXmlApplicationContext.getBean("bean1");
        Bean1 bean1_1 = (Bean1)classPathXmlApplicationContext.getBean("bean1");
        System.out.println(bean1==bean1_1);


    }
}
