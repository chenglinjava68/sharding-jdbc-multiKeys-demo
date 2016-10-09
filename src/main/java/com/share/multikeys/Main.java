package com.share.multikeys;

import java.util.Date;
import java.util.Random;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.share.multikeys.entity.Order;
import com.share.multikeys.service.ItemService;
import com.share.multikeys.service.OrderService;
import com.share.multikeys.utils.DateUtil;

@Service
@Transactional
public class Main {
    @SuppressWarnings("unused")
	public static void main(final String[] args) {
        @SuppressWarnings("resource")
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("META-INF/mybatisContext.xml");
          OrderService orderService = applicationContext.getBean(OrderService.class);
          Random r=new Random();
		  for(int i=1;i<500;i++){
	      	  Integer integer=r.nextInt(10);
			  Integer days=(integer*30+1)-270;
			  Date date=DateUtil.addDays(new Date(), days);
			  Order order=new Order();
			  order.setOrderId(i);
			  order.setCreateTime(date);
			  order.setUserId(i+1);
			  order.setStatus("INIT"+i);
			  orderService.insert(order);
		  }
		  
//        orderService.selectByKey(1);
//        orderService.selectByKeyOrTime(1,DateUtil.stringToDate("2016-10-08 17:08:38", "yyyy-MM-dd HH:mm:ss"));
//        orderService.selectBetweenTime(DateUtil.addDays(new Date(), -30),new Date());
//        orderService.selectRangeTime(DateUtil.addDays(new Date(), -30),new Date());
         
//        ItemService itemService = applicationContext.getBean(ItemService.class);
//        Item item=new Item();
//        item.setItemId(12);
//        item.setOrderId(10);
//        item.setItemName("testName");
//        itemService.insert(item);
//        itemService.selectJoin(1);
//        itemService.selectByKey(999);
    }
}
