package com.share.multikeys.entity;

import java.util.Date;

import com.share.multikeys.utils.DateUtil;

/** 
* @author weigen.ye 
* @date 创建时间：2016年10月11日 下午2:16:45 
*
*/
public class ItemOrderJoin {

	private Integer itemId;
	private Integer orderId;
	private String itemName;
	private Date createTime;
	public Integer getItemId() {
		return itemId;
	}
	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	@Override
    public String toString() {
        return String.format("item_id: %s, order_id: %s, item_name: %s,crate_time:%s", 
        		itemId,orderId,itemName,DateUtil.toDateString(createTime, "yyyy-MM-dd HH:mm:ss"));
    }
}
