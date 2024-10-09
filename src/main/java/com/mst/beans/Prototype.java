package com.mst.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component("proto")
@Scope("prototype")
public class Prototype {

	public int x = (int)(Math.random()*100);
	
	@PostConstruct
	public void init() {
		System.out.println("Prototype is loaded...");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Prototype is going down...");
	}
}
