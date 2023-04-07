package horse.testing.beans.lifecycles;

import org.springframework.context.Lifecycle;
import org.springframework.stereotype.Component;

/**
 * Lifecycle是Spring中最基础的生命周期接口，该接口定义了容器启动和停止的方法。
 * 方便开发者扩展自己的特定逻辑，比如启动和停止某些后台进程。
 *
 * @author li.hongming
 * @date 2022/3/17
 */
@Component
public class HelloLifeCycle implements Lifecycle {

    private volatile boolean running = false;

    public HelloLifeCycle() {
        System.out.println("HelloLifeCycle构造方法!!!");
    }

    @Override
    public void start() {
        System.out.println("lifycycle start");
        running = true;
    }

    @Override
    public void stop() {
        System.out.println("lifycycle stop");
        running = false;
    }

    @Override
    public boolean isRunning() {
        return running;
    }


}
