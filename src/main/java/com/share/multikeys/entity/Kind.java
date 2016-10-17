package com.share.multikeys.entity;
/** 
* @author weigen.ye 
* @date 创建时间：2016年10月12日 上午11:04:42 
*
*/
public class Kind {

	private Integer kindId;
	private Integer userId;
	private String type;
	
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
}
