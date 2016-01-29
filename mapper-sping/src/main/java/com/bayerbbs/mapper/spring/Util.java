package com.bayerbbs.mapper.spring;

import javax.inject.Named;
import javax.inject.Singleton;

import org.springframework.context.annotation.Bean;

import com.bayerbbs.mapper.Mapper;

@Named
@Singleton
public class Util {
	@Singleton
	@Bean
	public Mapper<String, Boolean> booleanMapper() {
		return new Mapper<String, Boolean>() {
			@Override
			public Boolean map(final String from) {
				System.out.println(this.getClass().getName());
				return Boolean.valueOf(from);
			}
		};
	}
}
