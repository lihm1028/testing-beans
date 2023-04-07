package horse.testing.beans.listener;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * ApplicationReadyEvent----项目启动后做一些事情
 *
 * @author li.hongming
 * @date 2022/3/17
 */
@Component
public class SpringApplicationReadyEvent implements ApplicationListener<ApplicationReadyEvent> {


    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {
        System.out.println("ApplicationReadyEvent----项目启动后做一些事情");
    }
}
