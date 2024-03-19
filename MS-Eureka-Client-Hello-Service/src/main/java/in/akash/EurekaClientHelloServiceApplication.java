package in.akash;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EurekaClientHelloServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientHelloServiceApplication.class, args);
	}

}

// Before running this application, start the Eureka-Registry-Eureka-Server
