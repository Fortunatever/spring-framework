package com.fortuever.spring.debuger.beans;

public class Person {
	private String name;
	private Integer age;

	public Person() {
	}

	public Person(String name, Integer age) {
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return "[ name=" + this.name + ", age=" + this.age + "]";
	}
}
