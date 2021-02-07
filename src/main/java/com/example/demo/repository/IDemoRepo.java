package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Demo;

public interface IDemoRepo extends JpaRepository<Demo,Integer> {


}
