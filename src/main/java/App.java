import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld bean2 = (HelloWorld) applicationContext.getBean("helloword");

        ApplicationContext applicationContextCat = new AnnotationConfigApplicationContext(Cat.class);

        Cat beanCat = (Cat) applicationContext.getBean("Cat");
        Cat beanCat2 = (Cat) applicationContext.getBean("Cat");

        System.out.println(bean.equals(bean2));
        System.out.println(beanCat.equals(beanCat2));
    }
}
