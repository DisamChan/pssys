package com.pssys.entity.sys;

import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import com.pssys.common.persistence.entity.BaseEntity;

/*
 * @Entity 声明一个类为实体Bean
 * @Table(name = "xx")指定实体类映射的表,如果表名和实体类名一致,可以不指定
 */
@Entity
@Table(name="sys_user")
public class SysUser extends BaseEntity<Long>{
	
    private static final long serialVersionUID = 1L;
    
	private String userName;
	private String password;
	
	//FetchType.EAGER即时加载，orphanRemoval孤儿删除，不知道什么意思。cascade级联，映射对方表的字段名sysUser
	@OneToMany(fetch=FetchType.EAGER, targetEntity=SysRole.class, orphanRemoval=true, cascade=CascadeType.ALL, mappedBy="sysUser")
	@Fetch(FetchMode.SELECT)//加载方式为即时加载，join会使懒加载失效，其他则会造成n+1问题
	@Basic(optional=true, fetch=FetchType.EAGER)	//@Basic标记可以指定实体属性的加载方式，懒加载或即时加载，默认是懒加载。optional表示属性是否可为null。
	@OrderBy()
	private List<SysRole> sysRole;
	
	public List<SysRole> getSysRole() {
    	return sysRole;
    }
	public void setSysRole(List<SysRole> sysRole) {
    	this.sysRole = sysRole;
    }
	public String getUserName() {
    	return userName;
    }
	public void setUserName(String userName) {
    	this.userName = userName;
    }
	public String getPassword() {
    	return password;
    }
	public void setPassword(String password) {
    	this.password = password;
    }
	
}
