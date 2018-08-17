package com.totto.service.impl;

import javax.xml.crypto.dsig.CanonicalizationMethod;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.totto.mapper.ClazzMapper;
import com.totto.pojo.Clazz;
import com.totto.service.ClazzService;

@Service
public class ClazzServiceImpl implements ClazzService {
	@Autowired
	private ClazzMapper clazzMapper;
	
	@Override
	public Clazz selectClazzById(Integer id) {
		return clazzMapper.selectClazzById(id);
	}

	@Override
	public void insertClazz(Clazz clazz) {
		clazzMapper.insertClazz(clazz);
	}

	@Override
	public Clazz selectClazzById2(Integer id) {
		return clazzMapper.selectClazzById2(id);
	}

}
