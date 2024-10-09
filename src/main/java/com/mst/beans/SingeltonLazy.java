package com.mst.beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
@Lazy
public class SingeltonLazy {

	@PostConstruct
	public void init() {
		System.out.println("Lazy Singelton is loaded...");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Lazy Singelton is going down...");
	}
	
	public void showDetails() {
		System.out.println("Hello from lazy singelton");
	}
}
