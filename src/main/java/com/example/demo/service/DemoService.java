package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.demo.model.Demo;
//import com.example.demo.repository.DemoRepo;
import com.example.demo.repository.IDemoRepo;

@Service
public class DemoService {

	@Autowired
	IDemoRepo demoRepo;
	
	public String checkDemoId(int demoId) {
		// TODO Auto-generated method stub
		System.out.println("received id is "+demoId);
		Optional<Demo> demo1=demoRepo.findById(demoId);
		System.out.println(demo1.toString());
		return "received id is "+demoId;
	}

	public String getDemo(Demo demo) {
		// TODO Auto-generated method stub
		System.out.println(demo.toString());
		System.out.println(demo.getId());
		demoRepo.save(demo);
		return "data Received";
		
	}

	public String getCustomDemo() {
		@Query("Select * from demo")
		public List<Demo> FindAllWithDescriptionQuery();
		// TODO Auto-generated method stub
		return null;
	}

}
