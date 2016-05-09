package com.pssys.common.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 继承commons 下 StringUtils工具类
 * @author zengyufei
 * 2016-4-17 下午1:57:58
 */
final public class BlankUtils extends org.apache.commons.lang3.StringUtils {
	
	/**
	 * 判断字符串是否为空
	 * @author zengyufei
	 * 2016-4-17 下午2:01:34
	 * @param str
	 * @return boolean
	 * @throws Exception
	 */
	public static final boolean isBlank(final String str) throws Exception
	{
		return str == null || ("").equals(str);
	}
	
	/**
	 * 判断字符串是否不为空
	 * @author zengyufei
	 * 2016-4-17 下午2:01:34
	 * @param str
	 * @return boolean
	 * @throws Exception
	 */
	public static final boolean isNotBlank(final String str) throws Exception
	{
		return !isBlank(str);
	}
	
	/**
	 * 判断对象是否为空
	 * @author zengyufei
	 * 2016-4-17 下午2:02:10
	 * @param obj
	 * @return
	 * @throws Exception
	 */
	public  static final boolean isBlank(final Object obj) throws Exception
	{
		return obj == null;
	}
	
	/**
	 * 判断对象是否不为空
	 * @author zengyufei
	 * 2016-4-17 下午2:02:10
	 * @param obj
	 * @return
	 * @throws Exception
	 */
	public  static final boolean isNotBlank(final Object obj) throws Exception
	{
		return !isBlank(obj);
	}
	
	/**
	 * 判断数组是否为空
	 * @author zengyufei
	 * 2016-4-17 下午2:02:10
	 * @param obj
	 * @return
	 * @throws Exception
	 */
	public  static final boolean isBlank(final Object[]  array) throws Exception
	{
		return array == null || array.length ==0;
	}
	
	/**
	 * 判断数组是否不为空
	 * @author zengyufei
	 * 2016-4-17 下午2:02:10
	 * @param obj
	 * @return
	 * @throws Exception
	 */
	public  static final boolean isNotBlank(final Object[]  array) throws Exception
	{
		return !isBlank(array);
	}
	
	/**
	 * 判断集合是否为空
	 * @author zengyufei
	 * 2016-4-17 下午2:07:20
	 * @param collection
	 * @return
	 * @throws Exception
	 */
	public  static final boolean isBlank(final Collection<? extends Object> collection)  throws Exception
	{
		return collection.isEmpty() || collection.size() == 0;
	}
	
	/**
	 * 判断集合是否不为空
	 * @author zengyufei
	 * 2016-4-17 下午2:07:29
	 * @param collection
	 * @return
	 * @throws Exception
	 */
	public static final  boolean isNotBlank(final Collection<? extends Object> collection)  throws Exception
	{
		return !isBlank(collection);
	}
	
	/**
	 * 判断map是否为空
	 * @author zengyufei
	 * 2016-4-17 下午2:07:20
	 * @param collection
	 * @return
	 * @throws Exception
	 */
	public static final  boolean isBlank(final Map<String, ? extends Object> map)  throws Exception
	{
		return map.isEmpty() || map.size() == 0;
	}
	
	/**
	 * 判断map是否不为空
	 * @author zengyufei
	 * 2016-4-17 下午2:07:20
	 * @param collection
	 * @return
	 * @throws Exception
	 */
	public  static final  boolean isNotBlank(final Map<String, ? extends Object> map)  throws Exception
	{
		return !isBlank(map);
	}
	
	public static void main(String[] args) throws Exception
	{
		//字符串
		String str1 = "1";
		String str2 = "2";
		System.out.println(isBlank(str1));
		str1 = "";
		System.out.println(isBlank(str1));
		str1 = str2;
		System.out.println(isBlank(str1));
		//集合
		List<String> list = new ArrayList<String>();
		System.out.println("list isBlank = " + isBlank(list));
		System.out.println("list isNotBlank = " + isNotBlank(list));
		//map
		Map<String , Object> map = new HashMap<String, Object>();
		System.out.println(isBlank(map));
		System.out.println(isNotBlank(map));
	}
}
