package horse.testing.beans.runner;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class CustCommandLineRunner implements CommandLineRunner {

    /**
     * org.springframework.boot.context.embedded.AnnotationConfigEmbeddedWebApplicationContext@4f32a3ad
     */
    @Autowired
    protected ApplicationContext applicationContext;

    @Override
    public void run(String... args) throws Exception {
        log.info("我是自定义的CommandLineRunner:" + args);
    }
}

