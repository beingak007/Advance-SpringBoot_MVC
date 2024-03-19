package in.akash;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringBootConfigServerAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootConfigServerAppApplication.class, args);
	}

}
