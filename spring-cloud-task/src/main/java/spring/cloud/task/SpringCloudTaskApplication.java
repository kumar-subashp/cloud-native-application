package spring.cloud.task;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.configuration.EnableTask;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableTask
public class SpringCloudTaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudTaskApplication.class, args);
	}

	/*
	 CommandLineRunner
	 ApplicationRunner
	* */

	@Bean
	public Task getTask(){
		return new Task();
	}

	public class Task implements CommandLineRunner{

		@Override
		public void run(String... args) throws Exception {
			if (args != null){
				System.out.println("Parameter length is " + args.length);
			}
		}
	}
}
