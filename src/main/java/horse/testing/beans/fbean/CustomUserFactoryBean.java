package horse.testing.beans.fbean;

import horse.testing.beans.service.UserService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * 通过实现FactoryBean自定义注册Bean
 */
public class CustomUserFactoryBean implements FactoryBean<UserService>, InitializingBean, BeanFactoryPostProcessor, DisposableBean {


    private String name;

    public CustomUserFactoryBean() {
        System.out.println("初始化构找函数CustomUserFactoryBean");
    }


    /**
     * 自定义初始化方法 需要@Bean(initMethod = "init")指定
     * 顺序再afterPropertiesSet()之后执行
     */
    public void init() {
        System.out.println("init-method is called");
        System.out.println("******************************");
    }


    @Override
    public void afterPropertiesSet() throws Exception {
        name = "afterPropertiesSet修改为";
    }

    @Override
    public UserService getObject() throws Exception {
        return new UserService() {
            @Override
            public Map getUser() {
                Map<Object, Object> map = new HashMap<>();
                map.put("name", name);
                return map;
            }
        };
    }

    @Override
    public Class<?> getObjectType() {
        return UserService.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("CustomUserFactoryBean postProcessBeanFactory");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("在销毁bean时执行某些操作:如关闭文件、数据库连接等");
    }
}
