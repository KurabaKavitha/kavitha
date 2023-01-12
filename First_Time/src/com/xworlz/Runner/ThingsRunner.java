package com.xworlz.Runner;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworlz.Things.HardWare;
import com.xworlz.Things.Pen;
import com.xworlz.Things.Pencil;
import com.xworlz.Things.Rubber;
import com.xworlz.Things.SoftwareEngineer;
import com.xworlz.configuration.AutowiredConfiguration;

public class ThingsRunner {
	
	public static void main(String[] args) {
		ApplicationContext ref=new AnnotationConfigApplicationContext(AutowiredConfiguration.class);
		String[] bean=ref.getBeanDefinitionNames();
		System.out.println(Arrays.toString(bean));
		HardWare hardware=ref.getBean(HardWare.class);
		System.out.println(hardware);

		SoftwareEngineer sof=ref.getBean(SoftwareEngineer.class);
		System.out.println(sof);
		Pencil p=ref.getBean(Pencil.class);
		System.out.println(p);
		Rubber r=ref.getBean(Rubber.class);
		System.out.println(r);
		Pen p1=ref.getBean(Pen.class);
		System.out.println(p1);
	}

}
