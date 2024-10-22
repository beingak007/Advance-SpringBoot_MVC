package in.akash.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ActorServiceConsumingRunner_PostingJsonData implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {

		System.out.println("ActorServiceConsumingRunner_PostingJsonData.run()");

		RestTemplate template = new RestTemplate();
		String serviceUrl = "http://localhost:8080/api/actor/register";

		// Sending the information to @RequestBody(JSON data)
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		String json_body = "{\r\n" + "    \"aid\": 3,\r\n" + "    \"name\": \"Sachin Tendulkar\",\r\n"
				+ "    \"age\": \"54\",\r\n" + "    \"type\": \"batsman\"\r\n" + "}";
		HttpEntity<String> request = new HttpEntity<String>(json_body, headers);

		ResponseEntity<String> responseEntity = template.postForEntity(serviceUrl, request, String.class);

		System.out.println("ResponseBody                :: " + responseEntity.getBody());
		System.out.println("Response Status Code Value  :: " + responseEntity.getStatusCodeValue());
		System.out.println("Response Status Code        :: " + responseEntity.getStatusCode().name());
		System.out.println("*************************************************");

	}

}