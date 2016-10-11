package com.share.multikeys.repository;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.share.multikeys.entity.ItemOrderJoin;
import com.share.multikeys.entity.UserOrderJoin;

/** 
* @author weigen.ye 
* @date 创建时间：2016年10月11日 下午1:27:39 
*
*/
public interface CommonRepository {

	public List<ItemOrderJoin>selectItemOrderJoin(@Param("orderId") Integer orderId);
 	public List<UserOrderJoin>selectUserOrderJoinWithTime(@Param("sTime") Date sTime, @Param("eTime") Date eTime);
}
