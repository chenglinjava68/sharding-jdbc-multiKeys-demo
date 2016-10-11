package com.share.multikeys;

import java.util.Date;
import java.util.Random;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.share.multikeys.service.CommonService;
import com.share.multikeys.service.OrderService;
import com.share.multikeys.service.UserService;
import com.share.multikeys.utils.DateUtil;

@Service
@Transactional
public class Main {
    @SuppressWarnings("unused")
	public static void main(final String[] args) {
       @SuppressWarnings("resource")
	   ApplicationContext applicationContext = new ClassPathXmlApplicationContext("META-INF/mybatisContext.xml");
       Random r=new Random();
       /*多主键路由*/
       OrderService orderService = applicationContext.getBean(OrderService.class);
	  
//	   for(int i=1;i<500;i++){
//		  Integer integer=r.nextInt(10);
//		  Integer days=(integer*30+1)-270;
//		  Date date=DateUtil.addDays(new Date(), days);
//		  Order order=new Order();
//		  order.setOrderId(i);
//		  order.setCreateTime(date);
//		  order.setUserId(i+1);
//		  order.setStatus("INIT"+i);
//		  orderService.insert(order);
//	   }
//  
//		orderService.selectByKey(99);
//		orderService.selectByKeyOrTime(1,DateUtil.stringToDate("2016-10-08 17:08:38", "yyyy-MM-dd HH:mm:ss"));
//		 
//		orderService.selectBetweenTime(DateUtil.addDays(new Date(), -180),new Date());
//		orderService.selectRangeTime(DateUtil.addDays(new Date(), -90),new Date());
		 
		/*单主键路由*/
		UserService userService = applicationContext.getBean(UserService.class);
//		for(int i=0;i<100;i++){
//			User user=new User();
//			Integer integer=r.nextInt(10);
//			Integer days=(integer*30+1)-270;
//		    Date date=DateUtil.addDays(new Date(), days);
//		    user.setUserId(i);
//		    user.setOrderId(i+1);
//		    user.setCreateTime(date);
//		    user.setRemark("test"+i);
//			userService.insert(user);
//		}
//		userService.selectBetweenKey(9, 99);
	
		/*不进行路由*/
//		ItemService itemService = applicationContext.getBean(ItemService.class);
//		Item item=new Item();
//		item.setItemId(12);
//		item.setOrderId(10);
//		item.setItemName("testName");
//		itemService.insert(item);
//		itemService.selectJoin(1);
//		itemService.selectByKey(999);
//		itemService.selectBetweenKeys(99,199); 
		
		CommonService commonService=applicationContext.getBean(CommonService.class);
		commonService.selectItemOrderJoin(300);
//		commonService.selectUserOrderJoinWithTime(DateUtil.addDays(new Date(), -180), new Date());
       
    
    }
}
