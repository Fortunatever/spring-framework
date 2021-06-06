package com.fortuever.spring.debuger.testannotations;

import com.fortuever.spring.debuger.beans.Person;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

public class BeanAnnotation {
	public static void run() {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(BeanAnnotation.class);
		ConfigurableListableBeanFactory bf = ac.getBeanFactory();
		String[] names = bf.getBeanDefinitionNames();
		for (String name : names) {
			System.out.println(name + "--->" + bf.getBean(name));
		}
	}

	@Bean
	public Person getNoNamedPerson() {
		return new Person("noNamedPerson", 12);
	}

	@Bean("namedPerson")
	public Person getNamedPerson() {
		return new Person("namedPerson", 12);
	}
}
