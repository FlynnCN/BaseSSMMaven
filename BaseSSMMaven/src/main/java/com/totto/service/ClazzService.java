package com.totto.service;

import com.totto.pojo.Clazz;

public interface ClazzService {
	public Clazz selectClazzById(Integer id);
	
	public Clazz selectClazzById2(Integer id);
	
	public void insertClazz(Clazz clazz);
}
