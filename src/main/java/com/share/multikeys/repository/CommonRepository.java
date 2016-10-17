package com.share.multikeys.repository;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.share.multikeys.entity.Item;
import com.share.multikeys.entity.ItemOrderJoin;
import com.share.multikeys.entity.UserKind;
import com.share.multikeys.entity.UserOrderJoin;
import com.share.multikeys.entity.VenderItemOrder;

/** 
* @author weigen.ye 
* @date 创建时间：2016年10月11日 下午1:27:39 
*
*/
public interface CommonRepository {
	
	/**
	 * 
	 * @param sItemId
	 * @param eItemId
	 * @return
	 */
	List<Item> selectIntemsBetweenKeys(@Param(value = "sItemId") Integer sItemId,@Param(value = "eItemId") Integer eItemId);
	
	/**
	 * 两张表关联，t_user_order、t_user_kind 分键字段相同
	 * @param sUserId
	 * @param eUserId
	 * @return
	 */
	public List<UserKind> selectUserKindJionBetweenKey(@Param("sUserId") Integer sUserId, @Param("eUserId") Integer eUserId);
	/**
	 * 两张表关联，但只是一张分片，t_order表多键分片
	 * @param sOrderId
	 * @param eOrderId
	 * @param sTime
	 * @param eTime
	 * @return
	 */
	public List<ItemOrderJoin> selectItemOrderJoinBetweenKeyAndTime(@Param("sOrderId") Integer sOrderId, @Param("eOrderId") Integer eOrderId ,
			@Param("sTime") Date sTime, @Param("eTime") Date eTime);
    
	/**
     * 两张表关联，但只是一张分片，t_order表多键分片
     * @param sOrderId
     * @param eOrderId
     * @return
     */
	public List<ItemOrderJoin> selectItemOrderJoinBetweenKey(@Param("sOrderId") Integer sOrderId, @Param("eOrderId") Integer eOrderId);
	
	/**
	 * 两张表关联，但只是一张分片，t_order表多键分片
	 * @param orderId
	 * @return
	 */
	public List<ItemOrderJoin> selectItemOrderJoin(@Param("orderId") Integer orderId);
 	
	/**
	 * 两张表关联，两张表都分片，t_order表按order_id与create_time分片，t_user_order按user_id分片，结果有问题
	 * @param sOrderId
	 * @param eOrderId
	 * @return
	 */
	public List<UserOrderJoin> selectUserOrderJoinBetweenKey(@Param("sOrderId") Integer sOrderId, @Param("eOrderId") Integer eOrderId);

	/**
	 * 三张表关联，但只是一张分片，t_order表多键分片
	 * @param orderId
	 * @return
	 */
	public List<VenderItemOrder> selectVenderItemOrderJoin(@Param("orderId") Integer orderId);
}
