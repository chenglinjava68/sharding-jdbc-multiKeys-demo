package com.share.multikeys.service;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.share.multikeys.entity.ItemOrderJoin;
import com.share.multikeys.entity.UserOrderJoin;
import com.share.multikeys.repository.CommonRepository;

/** 
* @author weigen.ye 
* @date 创建时间：2016年10月11日 下午1:57:35 
*
*/
@Service
@Transactional
public class CommonService {

	@Resource
	private CommonRepository commonRepository;
	
	public void selectItemOrderJoin(Integer id){
		Long s=System.currentTimeMillis();
    	List<ItemOrderJoin> list=commonRepository.selectItemOrderJoin(id);
    	if(list!=null&&list.size()>0){
	    	for(int i=0;i<list.size();i++){
	    		System.out.println(list.get(i));
	    	}
    	}
        System.out.println("cost "+(System.currentTimeMillis()-s)+"ms");
	}
	
	public void selectUserOrderJoinWithTime(Date sTime,Date eTime){
		Long s=System.currentTimeMillis();
    	List<UserOrderJoin> list=commonRepository.selectUserOrderJoinWithTime(sTime,eTime);
    	if(list!=null&&list.size()>0){
	    	for(int i=0;i<list.size();i++){
	    		System.out.println(list.get(i));
	    	}
    	}
        System.out.println("cost "+(System.currentTimeMillis()-s)+"ms");
	}
}
