package com.app.dca.web;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dca.entity.*;
import com.app.dca.service.*;

@Validated
@RestController
@RequestMapping("/api")
public class ResponseRestController {
	
	@Autowired
	private IResponseService service;
	
	public ResponseRestController() {
		System.out.println("--------Response Rest Controller Constructor----------");
	}
	
	@GetMapping("/home")
	public String homeRequest()
	{
		return "Welcome :Developer Community App"+LocalDateTime.now();
	}
	
	@PostMapping("/response")
	public Response addResponse(@RequestBody  Response resp)
	{
		service.addResponse(resp);
		return resp;
	}
	
	@GetMapping("/responses")
	public List<Response> getAllResponses()
	{
		return service.getAllResponses();
	}
	
}//end class


