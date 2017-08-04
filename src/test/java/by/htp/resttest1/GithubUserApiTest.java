package by.htp.resttest1;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.testng.annotations.Test;

import by.htp.resttest1.model.User;

public class GithubUserApiTest {

	@Test
	public void gitHubUserApiTest1(){
		RestTemplate myRestTemplate = new RestTemplate();
		User user = myRestTemplate.getForObject("https://api.github.com/users/golosoff", User.class);
		System.out.println(user);
/*		ResponseEntity<String> myResponse = myRestTemplate.getForEntity("https://api.github.com/users/golosoff", String.class);
		System.out.println(myResponse);*/
	}
	
}
