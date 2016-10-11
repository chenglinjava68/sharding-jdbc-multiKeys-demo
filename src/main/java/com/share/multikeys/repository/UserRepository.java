package com.share.multikeys.repository;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.share.multikeys.entity.User;

/** 
* @author weigen.ye 
* @date 创建时间：2016年10月11日 上午11:39:51 
*
*/
public interface UserRepository {

	void insert(User model);
    
    int update(List<Integer> userIds);
    
    List<User> selectAll();
    
    List<User> selectByKey(Integer orderId);
    
    List<User> selectBetweenKey(@Param("sId")Integer sId, @Param("eId")Integer eId);
    
    List<User> selectLimit(@Param("sId")Integer sId, @Param("eId")Integer eId);
}
