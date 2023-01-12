package com.xworkz.Runner;

import java.util.Arrays;

import javax.security.auth.login.Configuration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.components.Engine;
import com.xworkz.components.Ghost;
import com.xworkz.components.Newspaper;
import com.xworkz.components.Snake;
import com.xworkz.configuration.Spring4configuration;


public class ComponentsRunner {
	public static void main(String[] args) {
		ApplicationContext contener= new AnnotationConfigApplicationContext(Spring4configuration.class);
		String[] ref=contener.getBeanDefinitionNames();
		int ref1=contener.getBeanDefinitionCount();
		System.out.println(ref1);
		System.out.println(Arrays.toString(ref));
		
		Newspaper paper=contener.getBean(Newspaper.class);
		System.out.println(paper);
		
		
		Engine engine=contener.getBean(Engine.class);
		System.out.println(engine);
		
		Snake pamu=contener.getBean(Snake.class);
		System.out.println(pamu);
		Ghost dhayam=contener.getBean(Ghost.class);
		System.out.println(dhayam);
	}

}
