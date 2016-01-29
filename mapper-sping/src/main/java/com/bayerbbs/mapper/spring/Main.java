package com.bayerbbs.mapper.spring;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.bayerbbs.mapper.Mapper;

@Named
public class Main {
	public static void main(final String[] args) {
		try (AbstractApplicationContext context = new AnnotationConfigApplicationContext("com.bayerbbs.mapper.spring")) {
			context.getBean(Main.class).run();
		}
	}

	@Inject
	Mapper<String, Integer> intMapper;

	@Inject
	Mapper<String, Float> floatMapper;

	@Inject
	Mapper<String, Double> doubleMapper;

	@Inject
	Mapper<String, Boolean> booleanMapper;

	private void run() {
		System.out.println("Hello Spring!");

		final String s = "3.1415";

		System.out.println(intMapper.map(s));
		System.out.println(floatMapper.map(s));
		System.out.println(doubleMapper.map(s));

		System.out.println(booleanMapper.map("false"));
		System.out.println(booleanMapper.map("0"));
		System.out.println(booleanMapper.map("No"));
	}
}
