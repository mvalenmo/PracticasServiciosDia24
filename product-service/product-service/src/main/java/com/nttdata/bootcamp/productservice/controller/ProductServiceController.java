package com.nttdata.bootcamp.productservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductServiceController {
	@Value("${server.port}")
	private String port;
	
	@GetMapping(path="/port")
	public String getPort() {
		return "El puerto del micro es: " + port;
	}

}
