package springboot.advance.feature;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author <a href="mailto:wb-chf309549@alibaba-inc.com">常华锋</a>
 * @version V1.0.0
 * @since 2018/4/22
 */
@Configuration
@ComponentScan("springboot.advance.feature.service")
@EnableScheduling
public class TaskSchedulerConfig {
}
