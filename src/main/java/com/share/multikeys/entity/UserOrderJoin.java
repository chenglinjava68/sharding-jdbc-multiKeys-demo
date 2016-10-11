package com.share.multikeys.entity;

import java.util.Date;

import com.share.multikeys.utils.DateUtil;

/** 
* @author weigen.ye 
* @date 创建时间：2016年10月11日 下午1:37:03 
*
*/
public class UserOrderJoin {

	private Integer userId;
	private Integer orderId;
	private String remark;
	private String status;
	private Date userOrderDate;
	
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getUserOrderDate() {
		return userOrderDate;
	}
	public void setUserOrderDate(Date userOrderDate) {
		this.userOrderDate = userOrderDate;
	}
	
	@Override
	public String toString() {
		return String.format("user_id:%s, order_id:%s, remark:%s, status:%s, user_order_time", 
				userId,orderId,remark,status,DateUtil.toDateString(userOrderDate, "yyyy-MM-dd HH:mm:ss"));
	}
}
