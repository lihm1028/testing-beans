package horse.testing.beans.imports;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * 通过注解@Import注入bean
 *
 * @author li.hongming
 * @date 2023/4/12
 */
@Configuration
//@Import(value = {Cat.class,Dog.class})
@Import({MyImportSelector.class})
public class SpringImportTest {

}
