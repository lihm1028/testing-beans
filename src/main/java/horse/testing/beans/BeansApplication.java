package horse.testing.beans;

import horse.testing.beans.annoatate.Animal;
import horse.testing.beans.config.Desktop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author li.hongming
 * @date 2022/3/15
 */
@SpringBootApplication
public class BeansApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = new SpringApplicationBuilder(BeansApplication.class).run(args);


        //测试@Configuration注入的bean是不是同一个对象
        Animal animal = run.getBean("animal", Animal.class);
        System.out.println(animal);

        Animal animal1 = animal.smallAnimal();
        Animal animal2 = animal.smallAnimal();
        System.out.println(animal1);
        System.out.println(animal2);
        System.out.println(animal1.smallAnimal());

    }


}
