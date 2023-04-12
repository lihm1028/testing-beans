package horse.testing.beans;

import horse.testing.beans.annoatate.People;
import horse.testing.beans.annoatate.PeopleFactory;
import horse.testing.beans.config.Desktop;
import horse.testing.beans.imports.Cat;
import horse.testing.beans.imports.Dog;
import horse.testing.beans.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author li.hongming
 * @date 2022/3/15
 */
@RestController
public class HomeController {

    @Autowired
    ApplicationContext applicationContext;

    // 这里的user是通过FactoryBean自定义注入的
    @Autowired
    UserService userService;

    @Autowired
    People people;

    @Autowired
    Cat cat;

    @Autowired
    Dog dog;


    @GetMapping("/output")
    public String output() {
        Desktop bean = applicationContext.getBean(Desktop.class);
        String osName = applicationContext.getEnvironment().getProperty("os.name");
        return bean.output(osName);
    }

    @GetMapping("/user")
    public Object user(){
       return userService.getUser();
    }


    @GetMapping("/people")
    public void people(){
        System.out.println(people);
        System.out.println(people.peopleFactory());
    }

    @GetMapping("/catdog")
    public void catdog(){
        System.out.println(cat+" "+cat.name());
        System.out.println(dog+" "+dog.name());
    }
}
