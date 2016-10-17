package com.share.multikeys.service;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.share.multikeys.entity.Item;
import com.share.multikeys.entity.ItemOrderJoin;
import com.share.multikeys.entity.UserKind;
import com.share.multikeys.entity.UserOrderJoin;
import com.share.multikeys.entity.VenderItemOrder;
import com.share.multikeys.repository.CommonRepository;
import com.share.multikeys.utils.PageUtil;

/** 
* @author weigen.ye 
* @date 创建时间：2016年10月11日 下午1:57:35 
*
*/
@Service
@Transactional
public class CommonService {

	@Resource
	private CommonRepository commonRepository;
	
	public void selectItemOrderJoin(Integer id){
		Long s=System.currentTimeMillis();
    	List<ItemOrderJoin> list=commonRepository.selectItemOrderJoin(id);
    	if(list!=null&&list.size()>0){
	    	for(int i=0;i<list.size();i++){
	    		System.out.println(list.get(i));
	    	}
    	}
        System.out.println("cost "+(System.currentTimeMillis()-s)+"ms");
	}
	
	public void selectItemOrderJoinBetweenKey(Integer sOrderId,Integer eOrderId){
		Long s=System.currentTimeMillis();
    	List<ItemOrderJoin> list=commonRepository.selectItemOrderJoinBetweenKey(sOrderId,eOrderId);
    	if(list!=null&&list.size()>0){
	    	for(int i=0;i<list.size();i++){
	    		System.out.println(list.get(i));
	    	}
    	}
        System.out.println("cost "+(System.currentTimeMillis()-s)+"ms");
	}
	
	/**
	 * 普通表PageHelp
	 * @param sItemId
	 * @param eItemId
	 * @param pageNum
	 * @param pageSize
	 */
	public void selectItemsWithPageHelp(Integer sItemId,Integer eItemId,Integer pageNum,Integer pageSize){
		Long s=System.currentTimeMillis();
		PageHelper.startPage(pageNum, pageSize);
    	List<Item> list=commonRepository.selectIntemsBetweenKeys(sItemId,eItemId);
    	Page<Item> pageList=null;
    	if(list instanceof Page){
    		pageList=(Page<Item> )PageUtil.makePage(list, Item.class);
    	}
    	if(pageList!=null&&pageList.size()>0){
    		System.out.println("pageNum:"+pageList.getPageNum());
    		System.out.println("pageSize:"+pageList.getPageSize());
	    	for(int i=0;i<pageList.size();i++){
	    		System.out.println(pageList.get(i));
	    	}
    	}
        System.out.println("cost "+(System.currentTimeMillis()-s)+"ms");
	}
	
	/**
	 * join有分片表测试 mybatis分布插件使用
	 * @param sOrderId
	 * @param eOrderId
	 * @param pageNum
	 * @param pageSize
	 */
	public void selectItemOrderJoinBetweenKeyWithPageHelp(Integer sOrderId,Integer eOrderId,Integer pageNum,Integer pageSize){
		Long s=System.currentTimeMillis();
		PageHelper.startPage(pageNum, pageSize);
    	List<ItemOrderJoin> list=commonRepository.selectItemOrderJoinBetweenKey(sOrderId,eOrderId);
    	Page<ItemOrderJoin> pageList=null;
    	if(list instanceof Page){
    		pageList=(Page<ItemOrderJoin> )PageUtil.makePage(list, ItemOrderJoin.class);
    	}
    	if(pageList!=null&&pageList.size()>0){
    		System.out.println("pageNum:"+pageList.getPageNum());
    		System.out.println("pageSize:"+pageList.getPageSize());
	    	for(int i=0;i<pageList.size();i++){
	    		System.out.println(pageList.get(i));
	    	}
    	}
        System.out.println("cost "+(System.currentTimeMillis()-s)+"ms");
	}
	
	public void selectItemOrderJoinBetweenKeyAndTime(Integer sOrderId,Integer eOrderId,Date sTime,Date eTime){
		Long s=System.currentTimeMillis();
    	List<ItemOrderJoin> list=commonRepository.selectItemOrderJoinBetweenKeyAndTime(sOrderId,eOrderId,sTime,eTime);
    	if(list!=null&&list.size()>0){
	    	for(int i=0;i<list.size();i++){
	    		System.out.println(list.get(i));
	    	}
    	}
        System.out.println("cost "+(System.currentTimeMillis()-s)+"ms");
	}
	
	public void selectUserOrderJoinBetweenKey(Integer sOrderId,Integer eOrderId){
		Long s=System.currentTimeMillis();
    	List<UserOrderJoin> list=commonRepository.selectUserOrderJoinBetweenKey(sOrderId,eOrderId);
    	if(list!=null&&list.size()>0){
	    	for(int i=0;i<list.size();i++){
	    		System.out.println(list.get(i));
	    	}
    	}
        System.out.println("cost "+(System.currentTimeMillis()-s)+"ms");
	}
	
	public void selectVenderItemOrderJoin(Integer id){
		Long s=System.currentTimeMillis();
    	List<VenderItemOrder> list=commonRepository.selectVenderItemOrderJoin(id);
    	if(list!=null&&list.size()>0){
	    	for(int i=0;i<list.size();i++){
	    		System.out.println(list.get(i));
	    	}
    	}
        System.out.println("cost "+(System.currentTimeMillis()-s)+"ms");
	}
	
	public void selectUserKindJionBetweenKey(Integer sUserId,Integer eUserId){
		Long s=System.currentTimeMillis();
    	List<UserKind> list=commonRepository.selectUserKindJionBetweenKey(sUserId,eUserId);
    	if(list!=null&&list.size()>0){
	    	for(int i=0;i<list.size();i++){
	    		System.out.println(list.get(i));
	    	}
    	}
        System.out.println("cost "+(System.currentTimeMillis()-s)+"ms");
	}
}
