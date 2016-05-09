package com.pssys.entity.sys;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.pssys.common.persistence.entity.BaseEntity;

@Entity
@Table(name="sys_user_role_detail")
public class UserAndRoleDetail extends BaseEntity<Long>{
	
    private static final long serialVersionUID = 1L;
    
	private Long userId;
	private Long roleId;
	
	public Long getUserId() {
    	return userId;
    }
	public void setUserId(Long userId) {
    	this.userId = userId;
    }
	public Long getRoleId() {
    	return roleId;
    }
	public void setRoleId(Long roleId) {
    	this.roleId = roleId;
    }
}
