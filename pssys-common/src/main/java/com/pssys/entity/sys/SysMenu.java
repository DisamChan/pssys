package com.pssys.entity.sys;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.pssys.common.persistence.entity.TreeEntity;

@Entity
@Table(name="sys_menu")
public class SysMenu extends TreeEntity<Long>{
	
    private static final long serialVersionUID = 1L;
	
    private String menuName;
    private String url;
    private String permission;
    
	public String getMenuName() {
    	return menuName;
    }
	public void setMenuName(String menuName) {
    	this.menuName = menuName;
    }
	public String getUrl() {
    	return url;
    }
	public void setUrl(String url) {
    	this.url = url;
    }
	public String getPermission() {
    	return permission;
    }
	public void setPermission(String permission) {
    	this.permission = permission;
    }
    
}
