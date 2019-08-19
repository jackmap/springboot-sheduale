package com.example.controller;

import com.example.config.TestTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.concurrent.Future;

@RestController
public class Welcome {
    @Autowired
	TestTask testTask;


	@RequestMapping("/test")
	public String test1() {
		long s = System.currentTimeMillis();
		for (int i = 0; i < 10; i++) {
			testTask.task1();
			testTask.task2();
			testTask.task3();
			testTask.task4();
			testTask.task5();
		}
		long e = System.currentTimeMillis();
		System.out.println("task总耗时:" + (e - s));
		return "";
	}

	@RequestMapping("/test1")
	public void test(HttpServletResponse response) throws InterruptedException {
		long s = System.currentTimeMillis();
		testTask.task1();
		testTask.task2();
		testTask.task3();
		long e = System.currentTimeMillis();
		System.out.println("task总耗时:" + (e - s));
	}

}