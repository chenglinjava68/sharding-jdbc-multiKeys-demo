package com.share.multikeys.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.share.multikeys.entity.Vender;
import com.share.multikeys.repository.VenderRepository;

/** 
* @author weigen.ye 
* @date 创建时间：2016年10月11日 下午4:35:52 
*
*/
@Service
public class VenderService {
	
	@Autowired
	private VenderRepository venderRepository;
	
	public void insert(Vender vender){
		venderRepository.insert(vender);
	}
}
