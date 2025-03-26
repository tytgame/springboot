package com.example.demo.test;

import org.springframework.stereotype.Component;

@Component("printerA")
public class PrinterA implements Printer{
	
	@Override
	public void print(String msg) {
		System.out.println("Printer A :" + msg);
	}
}
