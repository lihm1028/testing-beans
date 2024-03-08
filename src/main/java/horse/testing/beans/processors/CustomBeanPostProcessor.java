package horse.testing.beans.processors;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;


@Slf4j
//@Component
public class CustomBeanPostProcessor implements BeanPostProcessor {


    public CustomBeanPostProcessor() {
        System.out.println("CustomBeanPostProcessor 实例化......");
    }

    /**
     * https://img-blog.csdnimg.cn/20200804152257590.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQzMTg1MjA2,size_16,color_FFFFFF,t_70
     * BeanPostProcessor 主要作用就是帮助我们在bean实例化之后，初始化前后做一些事情。
     * 进行bean实例属性的填充
     * 可以进行 bean 实例的代理封装
     *
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("对象" + beanName + "开始实例化前");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("对象" + beanName + "实例化完成后");
        return bean;
    }
}
