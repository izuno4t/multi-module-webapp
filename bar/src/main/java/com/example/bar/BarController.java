package com.example.bar;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("bar")
public class BarController {

	@GetMapping(value = { "/", "" })
	public String index() {
		return "bar";
	}

}
