package com.pssys.entity.sys;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import com.pssys.common.persistence.entity.BaseEntity;

/**
 * 角色实体类
 * @author zengyufei
 * 2016-4-22 下午11:00:03
 */
@Entity
@Table(name="sys_role")
public class SysRole extends BaseEntity<Long>{

    private static final long serialVersionUID = 1L;
	
    private String roleName;
    private String roleType;
    private String isAdmin;
    
    @ManyToOne(optional=true, fetch=FetchType.LAZY)
    @Fetch(FetchMode.SELECT)
    @Basic(optional=true, fetch=FetchType.EAGER)
    private SysUser sysUser;
    
	public String getRoleName() {
    	return roleName;
    }
	public void setRoleName(String roleName) {
    	this.roleName = roleName;
    }
	public String getIsAdmin() {
    	return isAdmin;
    }
	public void setIsAdmin(String isAdmin) {
    	this.isAdmin = isAdmin;
    }
	public String getRoleType() {
    	return roleType;
    }
	public void setRoleType(String roleType) {
    	this.roleType = roleType;
    }
	public SysUser getSysUser() {
    	return sysUser;
    }
	public void setSysUser(SysUser sysUser) {
    	this.sysUser = sysUser;
    }
}
