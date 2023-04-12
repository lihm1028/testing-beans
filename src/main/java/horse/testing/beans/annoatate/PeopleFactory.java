package horse.testing.beans.annoatate;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author li.hongming
 * @date 2023/4/12
 */
public class PeopleFactory implements FactoryBean<People> {
    @Override
    public People getObject() throws Exception {
        return new People();
    }

    @Override
    public Class<?> getObjectType() {
        return People.class;
    }

    @Override
    public boolean isSingleton() {
        return FactoryBean.super.isSingleton();
    }
}
