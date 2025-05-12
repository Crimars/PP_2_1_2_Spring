import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println("bean: " + (bean == bean2));

        Cat cat1 = applicationContext.getBean("cat", Cat.class);
        Cat cat2 = applicationContext.getBean("cat", Cat.class);
        System.out.println("Cat: " + (cat1 == cat2));
    }
}