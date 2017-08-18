package com.sa761.helloworld.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sa761.helloworld.domain.Employee;

/**
 * 
 * @author Jone Li
 *
 * @Date 2017年8月18日 下午3:21:51
 */
@RestController
public class HelloWorldController {

	@RequestMapping("/hello")
	public Employee getEmp(){
		Employee emp = new Employee();
		emp.setId(110);
		emp.setName("scott");
		emp.setAge(28);
		return emp;
	}
	
}
