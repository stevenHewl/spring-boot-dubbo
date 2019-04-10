package spring.boot.dubbo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableDubbo
public class SpringBootDubboProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDubboProviderApplication.class, args);
		/*
		new SpringApplicationBuilder(SpringBootDubboProviderApplication.class)
				.listeners((ApplicationListener<ApplicationEnvironmentPreparedEvent>) event -> {
					Environment environment = event.getEnvironment();
					int port = environment.getProperty("embedded.zookeeper.port", int.class);
					new EmbeddedZooKeeper(port, false).start();
				}).run(args);
				*/
	}
}
