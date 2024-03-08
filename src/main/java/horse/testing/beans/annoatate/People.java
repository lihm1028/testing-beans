package horse.testing.beans.annoatate;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @author li.hongming
 * @date 2023/4/12
 */
@Component
public class People {

    @Bean
    public PeopleFactory peopleFactory() {
        return new PeopleFactory();
    }
}
