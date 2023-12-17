package com.ITJ.Hello;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
@RestController
public class HelloController{
	@GetMapping(path="/")
	public String hello()
	{
		return "Hello wold";
	}

}
