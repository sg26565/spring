package com.bayerbbs.mapper.spring;

import javax.inject.Named;
import javax.inject.Singleton;

import com.bayerbbs.mapper.Mapper;

@Named
@Singleton
public class StringToDoubleMapper extends Mapper<String, Double> {
	@Override
	public Double map(final String from) {
		System.out.println(this.getClass().getName());
		return Double.valueOf(from);
	}
}
