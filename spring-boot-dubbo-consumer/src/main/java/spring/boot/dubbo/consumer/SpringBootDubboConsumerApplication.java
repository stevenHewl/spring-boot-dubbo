package spring.boot.dubbo.consumer;

import org.apache.dubbo.config.annotation.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import spring.boot.dubbo.service.UserService;

@SpringBootApplication
public class SpringBootDubboConsumerApplication {
	private final Logger logger = LoggerFactory.getLogger(getClass());

	//@Reference(version = "${demo.service.version}")
	//private UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDubboConsumerApplication.class, args);
	}

	/*
	@Bean
	public ApplicationRunner runner() {
		return args -> {
			logger.info(userService.sayHello(" hewenliang"));
		};
	}
	*/
}
