package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Demo;
import com.example.demo.service.DemoService;

@RestController
@RequestMapping("/Demo")
public class DemoController {
	
	@Autowired
	DemoService demoService;
	
	@GetMapping("/check")
	String checkDemo() {
		return "Demo is UP";
	}
	@RequestMapping(value="/{id}" , method=RequestMethod.POST)
	String checkDemoId(@PathVariable("id") int demoId) {
		return demoService.checkDemoId(demoId);
		
	}
	@PostMapping("sec/{id}" )
	String checkDemoId2(@PathVariable("id") int demoId) {
		return demoService.checkDemoId(demoId);
		
	}
	@PostMapping("/getCustom")
	String getDemo() {
		return demoService.getCustomDemo();
		
	}

}
