package horse.testing.beans.lifecycles;

import org.springframework.context.SmartLifecycle;
import org.springframework.stereotype.Component;

/**
 * SmartLifecycle是对Lifecycle的一个扩展接口
 * 自动智能的管理生命周期
 *
 * 需要根据Spring容器的生命周期，来做一些自己的逻辑时，
 * 一般都会选择自定义一个类，实现SmartLifecycle这个接口。
 *
 * @author li.hongming
 * @date 2022/3/17
 */
@Component
public class HelloSmartLifecyle implements SmartLifecycle {

    private volatile boolean running = false;

    public HelloSmartLifecyle() {
        System.out.println("HelloSmartLifecyle构造方法!!!");
    }

    @Override
    public void start() {
        System.out.println("SmartLifecycle start");
        running = true;
    }

    @Override
    public void stop() {
        System.out.println("SmartLifecycle stop,不会被Spring框架调用到!");
        running = false;
    }

    @Override
    public boolean isRunning() {
        System.out.println("SmartLifecycle isRunning() ==== " + running);
        return running;
    }

    @Override
    public boolean isAutoStartup() {
        //SmartLifecycle这个接口的isAutoStartup()方法，一定要返回true，
        // 容器启动时才会回调SmartLifecycle的start()方法。
        System.out.println("SmartLifecycle isAutoStartup()");
        return true;
    }


    @Override
    public void stop(Runnable callback) {
        System.out.println("SmartLifecycle stop(Runnable callback)");
        callback.run();
    }

    @Override
    public int getPhase() {
        return 1;
        //控制多个SmartLifecycle的回调顺序的，返回值越小越靠前执行start()方法，越靠后执行stop()方法
    }

}
