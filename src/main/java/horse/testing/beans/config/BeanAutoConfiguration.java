package horse.testing.beans.config;

import horse.testing.beans.fbean.CustomUserFactoryBean;
import horse.testing.beans.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * Spring篇-几种组件注册方式：
 * 1.配置文件注册 Xml配置文件包扫描方式
 * 2.配置类注册方式--配置类注解包扫描方式 @Bean
 * 3.条件注册方式 @Conditional
 * 4.手动注册方式 @Import @Import中可以写多个class
 * 5.快速注册方式
 * 6.批量注册方式  可以在@Import注解中添加一个ImportSelector类以实现批量注册的功能
 *
 *
 * https://zhuanlan.zhihu.com/p/59307885
 * @author li.hongming
 * @date 2022/3/15
 */
@Configuration
public class BeanAutoConfiguration {

    @Bean
    @Conditional(OsCondition.WindowCondition.class)
    public Desktop windowDesktop() {
        return new Desktop.WindowDesktop();
    }

    @Bean
    @Conditional(OsCondition.MacCondition.class)
    public Desktop macDesktop() {
        return new Desktop.MacDesktop();
    }


    /**
     * 自定义注册Bean
     * 可以指定初始化方法initMethod
     * @return
     */
    @Bean(initMethod = "init")
    public CustomUserFactoryBean customUserFactoryBean() {
        return new CustomUserFactoryBean();
    }

}
