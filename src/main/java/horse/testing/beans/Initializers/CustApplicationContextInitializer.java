package horse.testing.beans.Initializers;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

public class CustApplicationContextInitializer implements ApplicationContextInitializer<ConfigurableApplicationContext> {


    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        System.out.println("我是自定义的 应用上下文初始化器 Initializer:");

        ConfigurableEnvironment environment = applicationContext.getEnvironment();

        environment.setActiveProfiles("default,local");

        System.out.println("可以通过初始化器修改环境变量，activeProfiles=");
        String headless = environment.getProperty("java.awt.headless");
        System.out.println("headless:" + headless);


        //读取bean信息
        String[] definitionNames = applicationContext.getBeanFactory().getBeanDefinitionNames();
        for (String definitionName : definitionNames) {
            System.out.println(definitionName);
        }

    }
}
