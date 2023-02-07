package com.example.foo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("foo")
public class FooController {

	@GetMapping(value = { "/", "" })
	public String index() {
		return "foo";
	}

}
