package in.akash.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {

	@GetMapping("/hello/{name}")
	public String sayHello(@PathVariable("name") String name) {

		String hiMsg = "Hello";

		return hiMsg + ", how are you?";
	}
}
