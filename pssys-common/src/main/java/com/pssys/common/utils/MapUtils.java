package com.pssys.common.utils;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

/**
 * map 工具
 * 创建、并集
 * @author zengyufei
 * 2016-4-17 下午8:28:08
 */
public class MapUtils {
	
	/**
	 * 创建一个非线程安全的 HashMap<String, Object>
	 * @author zengyufei
	 * 2016-4-17 下午8:29:57
	 * @return HashMap<String, Object>
	 */
	public static final Map<String, Object> createMap()	{
		return new HashMap<String, Object>();
	}
	
	/**
	 * 创建一个线程安全的 ConcurrentHashMap<String, Object>
	 * @author zengyufei
	 * 2016-4-17 下午8:29:57
	 * @return ConcurrentHashMap<String, Object>
	 */
	public static final Map<String, Object> createConcurrentMap()	{
		return new ConcurrentHashMap<String, Object>();
	}
	
	/**
	 * 并集两个 map 集合
	 * @author zengyufei
	 * 2016-4-17 下午8:39:57
	 * @param source 源 map
	 * @param target 目标 map
	 * @return  返回一个去除相同key和value的map集合
	 */
	public static final Map<String, Object> unionMap(Map<String, Object> source, Map<String, Object> target)
	{
		Map<String, Object> newMap = createMap();
		for (Entry<String, Object> entrySet : target.entrySet()) {
			if(source.containsKey(entrySet.getKey()) && source.containsValue(entrySet.getValue()))
				source.remove(entrySet.getKey());
        }
		newMap.putAll(source);
		return newMap;
	}
	
	
	
	public static void main(String[] args) {
		Map<String, Object> createMap1 = createMap();
	    createMap1.put("1", "2");
	    createMap1.put("2", "3");
	    System.out.println(createMap1.get("1"));
	    Map<String, Object> createMap2 = createMap();
	    createMap2.put("1", "2");
	    System.out.println(createMap2.get("1"));
	    Map<String, Object> unionMap = unionMap(createMap1,createMap2);
	    for (Entry<String, Object> entry : unionMap.entrySet()) {
	        System.out.println(entry.getKey() + "=" + entry.getValue());
        }
    }
	
}
