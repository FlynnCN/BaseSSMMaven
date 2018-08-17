package com.totto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.totto.pojo.Clazz;
import com.totto.service.ClazzService;

@Controller
@RequestMapping("/clazz")
public class ClazzController {
	@Autowired
	private ClazzService clazzService;
	
	@RequestMapping("/selectClazzById")
	@ResponseBody
	public Clazz selectClazzById(Integer id){
		Clazz clazz = clazzService.selectClazzById(id);
		return clazz;
	}
	
	@RequestMapping("/selectClazzById2")
	@ResponseBody
	public Clazz selectClazzById2(Integer id){
		Clazz clazz = clazzService.selectClazzById2(id);
		return clazz;
	}
}
