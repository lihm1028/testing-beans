package horse.testing.beans;

import horse.testing.beans.config.Desktop;
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

    @GetMapping("/output")
    public String output() {
        Desktop bean = applicationContext.getBean(Desktop.class);
        String osName = applicationContext.getEnvironment().getProperty("os.name");
        return bean.output(osName);
    }
}
