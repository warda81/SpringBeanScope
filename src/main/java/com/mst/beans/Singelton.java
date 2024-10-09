package com.mst.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
@Scope("singleton")
public class Singelton {

	public int x = (int)(Math.random()*100);
	
	@PostConstruct
	public void init() {
		System.out.println("Singelton is loaded...");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Singelton is going down...");
	}
}
