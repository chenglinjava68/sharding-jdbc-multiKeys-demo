package com.share.multikeys.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.share.multikeys.entity.Kind;
import com.share.multikeys.repository.KindRepository;

/** 
* @author weigen.ye 
* @date 创建时间：2016年10月12日 上午11:19:05 
*
*/
@Service
public class KindService {
	
	@Resource
	private KindRepository kindRepository;
	
	public void insert(Kind model){
		kindRepository.insert(model);
	}
}
