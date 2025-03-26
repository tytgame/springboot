package com.example.demo.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
	
	@Autowired
	Person Person1;
	
	@Autowired
	@Qualifier("printerB")
	Printer printer;
	
	@Autowired
	Person Person2;
	
	@RequestMapping("/")
	public @ResponseBody String root() {
		System.out.println("person1 : ");
		Person1.print();
		System.out.println("person2 : ");
		Person2.print();
		
		Person1.setPrinter(printer);
		Person1.print();
		
		if(Person1 == Person2) {
			System.out.println("동일한 객체");
		} else {
			System.out.println("다른 객체");
		}
		
		Person2.print();
		
		return "Annotation 사용하기";
	}
}
