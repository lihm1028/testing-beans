package horse.testing.beans;

import horse.testing.beans.config.Desktop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

/**
 * @author li.hongming
 * @date 2022/3/15
 */
@SpringBootApplication
public class BeansApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(BeansApplication.class).run(args);

    }


}
