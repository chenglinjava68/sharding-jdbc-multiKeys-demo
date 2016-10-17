package com.share.multikeys.entity;

import java.util.Date;

import com.share.multikeys.utils.DateUtil;

/** 
* @author weigen.ye 
* @date 创建时间：2016年10月12日 上午11:06:40 
*
*/
public class UserKind {

	private Integer kindId;
	private Integer userId;
	private String type;
	private Integer orderId;
	private String remark;
	private Date createTime;
	public Integer getKindId() {
		return kindId;
	}
	public void setKindId(Integer kindId) {
		this.kindId = kindId;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
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
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
	@Override
	public String toString() {
		return String.format("user_id:%s, kind_id:%s, order_id:%s, type:%s, remark:%s, create_time:%s",
				userId,kindId,orderId,type,remark,DateUtil.toDateString(createTime, "yyyy-MM-dd HH:mm:ss"));
	}
	
}
