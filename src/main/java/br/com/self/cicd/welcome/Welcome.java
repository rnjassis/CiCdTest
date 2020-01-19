package br.com.self.cicd.welcome;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/welcome")
public class Welcome {

	@RequestMapping(method = RequestMethod.GET)
	public String welcome(){
		return "Welcome";
	}
}
