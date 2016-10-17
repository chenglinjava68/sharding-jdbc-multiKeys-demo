package com.share.multikeys.utils;

import java.util.List;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.collections.CollectionUtils;

import com.github.pagehelper.Page;

/** 
* @author weigen.ye 
* @date 创建时间：2016年10月12日 下午5:33:10 
*
*/
public class PageUtil {

	public static <T> Page<T> buildPage(List<T> list) {
		if (CollectionUtils.isEmpty(list)) {
			return null;
		}
		if (!(list instanceof Page)) {
			Page<T> page = new Page<T>();
			page.addAll(list);
			return page;
		}
		return (Page<T>) list;
	}
	
	
	public static <T> T make(Object object, Class<T> cls) {
		if (object == null) {
			return null;
		}
		T t = null;
		try {
			t = cls.newInstance();
			BeanUtils.copyProperties(t, object);
		} catch (Exception e) {
			return null;
		}
		return t;
	}
	
	@SuppressWarnings("unchecked")
	public static <T> List<T> makePage(List<?> objectList, Class<T> cls) {
		if (objectList == null) {
			return null;
		}
		Page<T> page = make(objectList, Page.class);
		
		for (Object object : objectList) {
			T t = make(object, cls);
			if (t != null) {
				page.add(t);
			}
		}
		return page;
	}
}
