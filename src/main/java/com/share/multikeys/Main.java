package com.share.multikeys;

import java.util.Date;
import java.util.Random;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.share.multikeys.entity.Kind;
import com.share.multikeys.entity.Order;
import com.share.multikeys.entity.User;
import com.share.multikeys.entity.Vender;
import com.share.multikeys.service.KindService;
import com.share.multikeys.service.OrderService;
import com.share.multikeys.service.UserService;
import com.share.multikeys.service.VenderService;
import com.share.multikeys.utils.DateUtil;

@Service
@Transactional
@SuppressWarnings("unused")
public class Main {
	
	public static void main(final String[] args) {
	   ApplicationContext applicationContext = new ClassPathXmlApplicationContext("META-INF/mybatisContext.xml");
//	   insertOrder(applicationContext);
//	   insertUser(applicationContext);
//	   insertKind(applicationContext);
	   insertVender(applicationContext);
	   
       /*多主键路由*/
//      OrderService orderService = applicationContext.getBean(OrderService.class);
//		orderService.selectByKey(99);
//		orderService.selectByKeyOrTime(1,DateUtil.stringToDate("2016-10-08 17:08:38", "yyyy-MM-dd HH:mm:ss"));
//		orderService.selectBetweenTime(DateUtil.addDays(new Date(), -180),new Date());
//		orderService.selectRangeTime(DateUtil.addDays(new Date(), -90),new Date());
		 
		/*单主键路由*/
//		UserService userService = applicationContext.getBean(UserService.class);
//		userService.selectBetweenKey(9, 99);
		
		/*单主键路由*/
//		KindService kindService = applicationContext.getBean(KindService.class);
		
		/** 常用sql操作  **/
//		CommonService commonService=applicationContext.getBean(CommonService.class);
//		/** t_user_order、t_user_kind 两张表关联，t_user_order、t_user_kind 分键字段相同  **/
//		commonService.selectUserKindJionBetweenKey(9, 99);
//		/** t_item_order、t_user_order 两张表关联，t_user_order表分片   **/
//		commonService.selectItemOrderJoinBetweenKey(9,99);
//		/** t_item_order、t_user_order 两张表关联，t_user_order表分片  **/
//		commonService.selectItemOrderJoinBetweenKeyAndTime(9,99, DateUtil.addDays(new Date(), -30), new Date());
//		commonService.selectItemOrderJoin(300);
     	/** t_order_vender、 t_item_order、t_user_order 三张表关联，t_user_order表分片  **/
//		commonService.selectVenderItemOrderJoin(100);
//		commonService.selectUserOrderJoinBetweenKey(9,99);
//		commonService.selectItemOrderJoinBetweenKeyWithPageHelp(9, 99, 0, 10);
//		commonService.selectItemsWithPageHelp(9, 99, 1, 10);
		
		/*不进行路由*/
//		ItemService itemService = applicationContext.getBean(ItemService.class);
//		Item item=new Item();
//		item.setOrderId(-199);
//		item.setItemName("test");
//		itemService.insert(item);
//		itemService.selectJoin(1);
//		itemService.selectByKey(999);
//		itemService.selectBetweenKeys(99,199); 
    }
    
    /*多主键路由*/
	private static void insertOrder(ApplicationContext applicationContext){
       Random r=new Random();
       OrderService orderService = applicationContext.getBean(OrderService.class);
 	   for(int i=4943397;i<10000000;i++){
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
    }
	
	/*单主键路由*/
	private static void insertUser(ApplicationContext applicationContext){
		Random r=new Random();
		UserService userService = applicationContext.getBean(UserService.class);
		for(int i=0;i<10000000;i++){
			User user=new User();
			Integer integer=r.nextInt(10);
			Integer days=(integer*30+1)-270;
		    Date date=DateUtil.addDays(new Date(), days);
		    user.setUserId(i);
		    user.setOrderId(i+1);
		    user.setCreateTime(date);
		    user.setRemark("test"+i);
			userService.insert(user);
		}
	}
	
	/*单主键路由*/
	private static void insertKind(ApplicationContext applicationContext){
		KindService kindService = applicationContext.getBean(KindService.class);
		for(int i=0;i<10000000;i++){
			Kind kind=new Kind();
			kind.setKindId(i);
			kind.setUserId(i+1);
			kind.setType("TYPE"+i);
		    kindService.insert(kind);
		}
	}
	
	/*单主键路由*/
	private static void insertVender(ApplicationContext applicationContext){
		VenderService  venderService = applicationContext.getBean(VenderService.class);
		for(int i=0;i<5000000;i++){
			Vender vender=new Vender();
			vender.setOrderId(i);
			vender.setVenderId(i);
			vender.setVenderName("venderName"+1);
			venderService.insert(vender);
		}
	}
}
