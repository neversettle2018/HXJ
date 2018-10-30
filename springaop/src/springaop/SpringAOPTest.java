package springaop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class SpringAOPTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean1.xml");
        PersonServer bean = (PersonServerBean) applicationContext.getBean("personServerBean");
        bean.update("test",1);
    }
}
