package com.pssys.entity.sys;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.pssys.common.persistence.entity.TreeEntity;

/**
 * 角色实体类
 * @author zengyufei
 * 2016-4-22 下午11:00:03
 */
@Entity
@Table(name="sys_dict")
public class SysDict extends TreeEntity<Long>{

    private static final long serialVersionUID = 1L;
    
    private String name;//名称
    private String description;//描述
    private String addBy;//创建于谁
    private String updateBy;//'最后修改于谁
    
	public String getName() {
    	return name;
    }
	public void setName(String name) {
    	this.name = name;
    }
	public String getDescription() {
    	return description;
    }
	public void setDescription(String description) {
    	this.description = description;
    }
	public String getAddBy() {
    	return addBy;
    }
	public void setAddBy(String addBy) {
    	this.addBy = addBy;
    }
	public String getUpdateBy() {
    	return updateBy;
    }
	public void setUpdateBy(String updateBy) {
    	this.updateBy = updateBy;
    }
    
}
