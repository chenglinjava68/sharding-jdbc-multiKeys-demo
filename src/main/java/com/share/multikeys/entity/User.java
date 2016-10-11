package com.share.multikeys.entity;

import java.util.Date;

import com.share.multikeys.utils.DateUtil;

/** 
* @author weigen.ye 
* @date 创建时间：2016年10月11日 上午11:35:17 
*
*/
public class User {

	private Integer userId;
	private Integer orderId;
	private String remark;
	private Date createTime;
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
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
	@Override
    public String toString() {
        return String.format("user_id: %s, order_id: %s, remark: %s, create_time:%s", 
        		userId,orderId,remark,DateUtil.toDateString(createTime,"yyyy-MM-dd HH:mm:ss"));
    }
}
