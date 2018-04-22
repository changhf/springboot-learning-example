package springboot.advance.feature;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class AdvanceFeatureApplication {

	public static void main(String[] args) {
//		SpringApplication.run(AdvanceFeatureApplication.class, args);
		new AnnotationConfigApplicationContext(TaskSchedulerConfig.class);
	}

}
