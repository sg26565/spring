package com.bayerbbs.mapper.spring;

import javax.inject.Named;
import javax.inject.Singleton;

import com.bayerbbs.mapper.Mapper;

@Named
@Singleton
public class StringToFloatMapper extends Mapper<String, Float> {
	@Override
	public Float map(final String from) {
		System.out.println(this.getClass().getName());
		return Float.valueOf(from);
	}
}
