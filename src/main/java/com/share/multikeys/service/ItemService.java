package com.share.multikeys.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.share.multikeys.entity.Item;
import com.share.multikeys.repository.ItemRepository;

/** 
* @author weigen.ye 
* @date 创建时间：2016年10月8日 下午5:46:52 
*
*/
@Service
@Transactional
public class ItemService {

	@Resource
    private ItemRepository itemRepository;
	
	public void insert(Item item){
		this.itemRepository.insert(item);
	}
	
	@Transactional(readOnly = true)
    public void select() {
		Long s=System.currentTimeMillis();
        System.out.println("cost "+(System.currentTimeMillis()-s)+"ms: "+itemRepository.selectAll());
    }
	    
    public void selectByKey(Integer itemId) {
    	Long s=System.currentTimeMillis();
        System.out.println("cost "+(System.currentTimeMillis()-s)+"ms"+itemRepository.selectByKey(itemId));
    }
    
    public void selectJoin(Integer orderId) {
    	Long s=System.currentTimeMillis();
        System.out.println("cost "+(System.currentTimeMillis()-s)+"ms"+itemRepository.selectJoin(orderId));
    }
    
    public void selectBetweenKeys(Integer sItemId,Integer eItemId){
    	Long s=System.currentTimeMillis();
    	List<Item> list=itemRepository.selectBetweenKeys(sItemId, eItemId);
    	if(list!=null&&list.size()>0){
    		for(int i=0;i<list.size();i++){
    			System.out.println(list.get(i));
    		}
    	}
        System.out.println("cost "+(System.currentTimeMillis()-s)+"ms");
    }
}
