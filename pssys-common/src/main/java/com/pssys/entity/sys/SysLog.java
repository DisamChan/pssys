package com.pssys.entity.sys;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.pssys.common.persistence.entity.BaseEntity;

/**
 * 系统属性实体类
 * @author zengyufei
 * 2016-4-22 下午11:00:03
 */
@Entity
@Table(name="sys_log")
public class SysLog extends BaseEntity<Long>{

    private static final long serialVersionUID = 1L;
	
    private String title;//标题
    private String type;//log类型
    private String content;//执行的业务
    private String sql;//执行操作的语句集
    private String requestBy;//请求来自谁
    private String ip;//请求的IP
    private String url;//请求的url
    private String method;//方法
    private String param;//参数
    private String customerId;//客户ID
    
	public String getTitle() {
    	return title;
    }
	public void setTitle(String title) {
    	this.title = title;
    }
	public String getType() {
    	return type;
    }
	public void setType(String type) {
    	this.type = type;
    }
	public String getContent() {
    	return content;
    }
	public void setContent(String content) {
    	this.content = content;
    }
	public String getSql() {
    	return sql;
    }
	public void setSql(String sql) {
    	this.sql = sql;
    }
	public String getRequestBy() {
    	return requestBy;
    }
	public void setRequestBy(String requestBy) {
    	this.requestBy = requestBy;
    }
	public String getIp() {
    	return ip;
    }
	public void setIp(String ip) {
    	this.ip = ip;
    }
	public String getUrl() {
    	return url;
    }
	public void setUrl(String url) {
    	this.url = url;
    }
	public String getMethod() {
    	return method;
    }
	public void setMethod(String method) {
    	this.method = method;
    }
	public String getParam() {
    	return param;
    }
	public void setParam(String param) {
    	this.param = param;
    }
	public String getCustomerId() {
    	return customerId;
    }
	public void setCustomerId(String customerId) {
    	this.customerId = customerId;
    }
    
}
