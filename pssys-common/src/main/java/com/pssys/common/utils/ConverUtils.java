package com.pssys.common.utils;

/**
 * 类型转换工具类
 * @author zengyufei 2016-4-17 下午2:27:16
 */
final public class ConverUtils {
	
	/**
	 * 转换字符串为 int 类型
	 * 
	 * @author zengyufei 2016-4-17 下午7:55:31
	 * @param obj
	 *            字符串对象类型
	 * @param defaultValue
	 *            当转换失败时的默认值
	 * @return int
	 * @throws Exception
	 */
	public static final int objToInt(final Object obj, Integer... defaultValue)
	{
		try {
			return Integer.parseInt(obj.toString());
		} catch (Exception e) {
			try {
				return defaultValue[0];
			} catch (Exception e1) {
				return -1;
			}
		}
	}
	
	/**
	 * 转换字符串为 Long 类型
	 * 
	 * @author zengyufei 2016-4-17 下午7:55:31
	 * @param obj
	 *            字符串对象类型
	 * @param defaultValue
	 *            当转换失败时的默认值
	 * @return Long
	 * @throws Exception
	 */
	public static final Long objToLong(final Object obj, Long... defaultValue)
	{
		try {
			return Long.parseLong(obj.toString());
		} catch (Exception e) {
			try {
				return defaultValue[0];
			} catch (Exception e1) {
				return -1L;
			}
		}
	}
	
	/**
	 * 转换字符串为 Float 类型
	 * 
	 * @author zengyufei 2016-4-17 下午7:55:31
	 * @param obj
	 *            字符串对象类型
	 * @param defaultValue
	 *            当转换失败时的默认值
	 * @return Float
	 * @throws Exception
	 */
	public static final Float objToFloat(final Object obj, Float... defaultValue)
	{
		try {
			return Float.parseFloat(obj.toString());
		} catch (Exception e) {
			try {
				return defaultValue[0];
			} catch (Exception e1) {
				return -1F;
			}
		}
	}
	
	/**
	 * 转换字符串为 Double 类型
	 * 
	 * @author zengyufei 2016-4-17 下午7:55:31
	 * @param obj
	 *            字符串对象类型
	 * @param defaultValue
	 *            当转换失败时的默认值
	 * @return Double
	 * @throws Exception
	 */
	public static final Double objToDouble(final Object obj, Double... defaultValue)
	{
		try {
			return Double.parseDouble(obj.toString());
		} catch (Exception e) {
			try {
				return defaultValue[0];
			} catch (Exception e1) {
				return -1D;
			}
		}
	}
	
	public static void main(String[] args) throws Exception
	{
		String str = "2";
		System.out.println(objToDouble(str));
	}
}
