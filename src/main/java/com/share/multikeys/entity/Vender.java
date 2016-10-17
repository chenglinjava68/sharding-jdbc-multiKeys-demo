package com.share.multikeys.entity;
/** 
* @author weigen.ye 
* @date 创建时间：2016年10月11日 下午4:15:38 
*
*/
public class Vender {

	private Integer venderId;
	private Integer orderId;
	private String venderName;
	
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
	public String getVenderName() {
		return venderName;
	}
	public void setVenderName(String venderName) {
		this.venderName = venderName;
	}
	
	@Override
	public String toString() {
		return String.format("vender_id:%s, order_id:%s, vender_name:%s", venderId,orderId,venderName);
	}
}
