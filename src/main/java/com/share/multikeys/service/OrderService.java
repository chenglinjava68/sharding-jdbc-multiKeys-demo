package com.share.multikeys.service;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.share.multikeys.entity.Order;
import com.share.multikeys.repository.OrderRepository;

/**
 * Order 服务对象.
 * 
 * @author gaohongtao
 */
@Service
@Transactional
public class OrderService {
    
    @Resource
    private OrderRepository orderRepository;
    
    @Transactional(readOnly = true)
    public void select() {
        System.out.println(orderRepository.selectAll());
    }
    
    public void selectByKey(Integer orderId) {
    	Long s=System.currentTimeMillis();
    	List<Order> list=orderRepository.selectByKey(orderId);
    	if(list!=null&&list.size()>0){
	    	for(int i=0;i<list.size();i++){
	    		System.out.println(list.get(i));
	    	}
    	}
        System.out.println("cost "+(System.currentTimeMillis()-s)+"ms");
    }
    
    public void selectByKeyOrTime(Integer orderId,Date date) {
    	Long s=System.currentTimeMillis();
    	List<Order> list=orderRepository.selectByKeyOrTime(orderId,date);
    	if(list!=null&&list.size()>0){
	    	for(int i=0;i<list.size();i++){
	    		System.out.println(list.get(i));
	    	}
    	}
        System.out.println("cost "+(System.currentTimeMillis()-s)+"ms");
    }
    
    
    public void selectBetweenTime(Date sDate,Date eDate) {
    	Long s=System.currentTimeMillis();
    	List<Order> list=orderRepository.selectBetweenTime(sDate,eDate);
    	if(list!=null&&list.size()>0){
	    	for(int i=0;i<list.size();i++){
	    		System.out.println(list.get(i));
	    	}
    	}
        System.out.println("cost "+(System.currentTimeMillis()-s)+"ms");
    }
    
    public void selectRangeTime(Date sDate,Date eDate) {
    	Long s=System.currentTimeMillis();
    	List<Order> list=orderRepository.selectRangeTime(sDate,eDate);
    	if(list!=null&&list.size()>0){
	    	for(int i=0;i<list.size();i++){
	    		System.out.println(list.get(i));
	    	}
    	}
        System.out.println("cost "+(System.currentTimeMillis()-s)+"ms");
    }
    
    public void selectInRange(){
    	
    }
    
    public void insert(Order order) {
    	orderRepository.insert(order);
	}
    public void insert() {
    	 Order criteria = new Order();
         criteria.setUserId(10);
         //criteria.setOrderId(1012);
         criteria.setStatus("INSERT_TEST_12");
         criteria.setCreateTime(new Date());
         orderRepository.insert(criteria);
    }
    
}
