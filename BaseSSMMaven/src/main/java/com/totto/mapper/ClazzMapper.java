package com.totto.mapper;

import com.totto.pojo.Clazz;

public interface ClazzMapper {
	public Clazz selectClazzById(Integer id);
	
	public Clazz selectClazzById2(Integer id);
	
	public void insertClazz(Clazz clazz);
}
