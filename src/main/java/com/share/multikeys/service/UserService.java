package com.share.multikeys.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.share.multikeys.entity.User;
import com.share.multikeys.repository.UserRepository;

/** 
* @author weigen.ye 
* @date 创建时间：2016年10月11日 上午11:41:31 
*
*/
@Service
@Transactional
public class UserService {

	    @Resource
	    private UserRepository userRepository;
	    
	    
	    public void insert(User model){
	    	userRepository.insert(model);
	    }
	    
	    @Transactional(readOnly = true)
	    public void select() {
	        System.out.println(userRepository.selectAll());
	    }
	    
	    public void selectByKey(Integer orderId) {
	    	Long s=System.currentTimeMillis();
	    	List<User> list=userRepository.selectByKey(orderId);
	    	if(list!=null&&list.size()>0){
		    	for(int i=0;i<list.size();i++){
		    		System.out.println(list.get(i));
		    	}
	    	}
	        System.out.println("cost "+(System.currentTimeMillis()-s)+"ms");
	    }
	    
	    public void selectAll() {
	    	Long s=System.currentTimeMillis();
	    	List<User> list=userRepository.selectAll();
	    	if(list!=null&&list.size()>0){
		    	for(int i=0;i<list.size();i++){
		    		System.out.println(list.get(i));
		    	}
	    	}
	        System.out.println("cost "+(System.currentTimeMillis()-s)+"ms");
	    }
	    
	    public void selectBetweenKey(Integer sId, Integer eId) {
	    	Long s=System.currentTimeMillis();
	    	List<User> list=userRepository.selectBetweenKey(sId,eId);
	    	if(list!=null&&list.size()>0){
		    	for(int i=0;i<list.size();i++){
		    		System.out.println(list.get(i));
		    	}
	    	}
	        System.out.println("cost "+(System.currentTimeMillis()-s)+"ms");
	    }
	    
	    public void selectLimit(Integer sId, Integer eId) {
	    	Long s=System.currentTimeMillis();
	    	List<User> list=userRepository.selectLimit(sId,eId);
	    	if(list!=null&&list.size()>0){
		    	for(int i=0;i<list.size();i++){
		    		System.out.println(list.get(i));
		    	}
	    	}
	        System.out.println("cost "+(System.currentTimeMillis()-s)+"ms");
	    }
	    
}
