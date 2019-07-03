package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@RestController
public class Application {
	
	 @RequestMapping("/")
	    public String home() {
	        return "Hello Docker World - Gagan";
	        
	    }
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
