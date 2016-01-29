package com.bayerbbs.mapper.spring;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

import com.bayerbbs.mapper.Mapper;

@Named
@Singleton
public class StringToIntMapper extends Mapper<String, Integer> {
	@Inject
	private Mapper<String, Float> floatMapper;

	@Override
	public Integer map(final String from) {
		System.out.println(this.getClass().getName());
		final Float f = floatMapper.map(from);
		return f.intValue();
	}
}
