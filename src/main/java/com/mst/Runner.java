package com.mst;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mst.beans.Prototype;
import com.mst.beans.Singelton;
import com.mst.beans.SingeltonLazy;
import com.mst.config.Config;

public class Runner {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		System.out.println("******************************************");
		Prototype p1 = context.getBean("proto", Prototype.class);
		Prototype p2 = context.getBean("proto", Prototype.class);
		
		System.out.println("proto1= "+p1.x);
		System.out.println("proto2= "+p2.x);
		
		System.out.println("------------------------------------------");
		
		Singelton s1 = context.getBean(Singelton.class);
		Singelton s2 = context.getBean(Singelton.class);
		System.out.println("s1= "+ s1.x);
		System.out.println("s2= "+ s2.x);
		
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
		SingeltonLazy sl = context.getBean(SingeltonLazy.class);
	}

}
