package horse.testing.beans.runListeners;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ConfigurableBootstrapContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringApplicationRunListener;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import java.time.Duration;

/**
 * 自定义SpringApplicationRunListener:
 * 我们可以通过实现自定义SpringApplicationRunListener来监听Spring Boot的启动流程，
 * 并在各个回调方法中处理自己的逻辑。
 */
@Slf4j
public class CustSpringApplicationRunListener implements SpringApplicationRunListener {

    public CustSpringApplicationRunListener(SpringApplication application, String[] args) {
    }

    @Override
    public void starting(ConfigurableBootstrapContext bootstrapContext) {
        log.info("自定义的SpringApplicationRunListener.starting开始了");
        System.out.println("在run()方法开始执行时，该方法就立即被调用，可用于在初始化最早期时做一些工作");
    }

    @Override
    public void environmentPrepared(ConfigurableBootstrapContext bootstrapContext, ConfigurableEnvironment environment) {
        log.info("environmentPrepared 当environment构建完成，ApplicationContext创建之前，该方法被调用");
    }


    @Override
    public void contextPrepared(ConfigurableApplicationContext context) {
        log.info("contextPrepared 当ApplicationContext构建完成时，该方法被调用");
    }

    @Override
    public void contextLoaded(ConfigurableApplicationContext context) {
        log.info("contextLoaded 在ApplicationContext完成加载，但没有被刷新前，该方法被调用");
    }

    @Override
    public void started(ConfigurableApplicationContext context, Duration timeTaken) {
        log.info("started");
    }
}
