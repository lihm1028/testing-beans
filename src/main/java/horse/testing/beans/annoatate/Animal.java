package horse.testing.beans.annoatate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author li.hongming
 * @date 2023/4/12
 */
@Configuration(proxyBeanMethods = true)
public class Animal {
    @Bean
    public Animal smallAnimal(){
        return new Animal();
    }

}
