package horse.testing.beans.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import javax.naming.Context;

/**
 * @author li.hongming
 * @date 2022/3/17
 */
@Component
public class SpringContextRefreshedListener implements ApplicationListener<ContextRefreshedEvent> {

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        // ContextRefreshEvent是Spring容器加载完发送的一个事件
        if (event.getApplicationContext().getParent() == null) {
            System.out.println("ContextRefreshEvent是Spring容器加载完发送的一个事件,系统中会存在两个容器时注意会受到多次");

        }
    }
}
