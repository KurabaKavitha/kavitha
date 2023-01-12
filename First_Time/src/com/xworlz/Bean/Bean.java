package com.xworlz.Bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworlz.configuration.AutowiredConfiguration;

public class Bean {
	public class Runner {
		public void main(String[] args) {
			ApplicationContext ref=new AnnotationConfigApplicationContext(AutowiredConfiguration.class);

		}

}
}
