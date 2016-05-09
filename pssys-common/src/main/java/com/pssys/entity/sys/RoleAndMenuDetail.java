package com.pssys.entity.sys;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.pssys.common.persistence.entity.BaseEntity;

/**
 * 角色实体类
 * @author zengyufei
 * 2016-4-22 下午11:00:03
 */
@Entity
@Table(name="sys_role_menu_detail")
public class RoleAndMenuDetail extends BaseEntity<Long>{

    private static final long serialVersionUID = 1L;
	
    private Long roleId;
    private Long menuId;
    
	public Long getRoleId() {
    	return roleId;
    }
	public void setRoleId(Long roleId) {
    	this.roleId = roleId;
    }
	public Long getMenuId() {
    	return menuId;
    }
	public void setMenuId(Long menuId) {
    	this.menuId = menuId;
    }
    
}
