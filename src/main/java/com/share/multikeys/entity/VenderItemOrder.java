package com.share.multikeys.entity;
/** 
* @author weigen.ye 
* @date 创建时间：2016年10月11日 下午4:19:56 
*
*/
public class VenderItemOrder {

	private Integer venderId;
	private Integer orderId;
	private Integer itemId;
	private String  status;
	private String  venderName;
	public Integer getVenderId() {
		return venderId;
	}
	public void setVenderId(Integer venderId) {
		this.venderId = venderId;
	}
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public Integer getItemId() {
		return itemId;
	}
	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getVenderName() {
		return venderName;
	}
	public void setVenderName(String venderName) {
		this.venderName = venderName;
	}
	
	@Override
	public String toString() {
		return String.format("vender_id:%s, order_id:%s, item_id:%s, vender_name:%s, status:%s ",
				venderId,orderId,itemId,venderName,status);
	}
}
