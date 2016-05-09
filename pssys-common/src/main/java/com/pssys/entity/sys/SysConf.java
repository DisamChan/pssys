package com.pssys.entity.sys;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.pssys.common.persistence.entity.BaseEntity;

/**
 * 系统属性实体类
 * @author zengyufei
 * 2016-4-22 下午11:00:03
 */
@Entity
@Table(name="sys_conf")
public class SysConf extends BaseEntity<Long>{

    private static final long serialVersionUID = 1L;
	
    @Column(name="sys_name")
    private String systemName;//系统名称
    @Column(name="sys_url")
    private String systemUrl;//系统URL
    @Column(name="sys_alias")
    private String systemAlias;//系统别名，用于面包屑导航
    @Column(name="sys_version")
    private String systemReleaseVersion;//系统发布版本号
    @Column(name="sys_author")
    private String systemDeveloper;//系统开发者
    @Column(name="sys_copyright")
    private String systemCopyright;//系统版权信息
    @Column(name="sys_customerId")
    private String systemCustomerId;//系统客户唯一编号
    @Column(name="sys_isUse")
    private String isUse;	//	当前启用的配置
    
	public String getSystemName() {
    	return systemName;
    }
	public void setSystemName(String systemName) {
    	this.systemName = systemName;
    }
	public String getSystemUrl() {
    	return systemUrl;
    }
	public void setSystemUrl(String systemUrl) {
    	this.systemUrl = systemUrl;
    }
	public String getSystemAlias() {
    	return systemAlias;
    }
	public void setSystemAlias(String systemAlias) {
    	this.systemAlias = systemAlias;
    }
	public String getSystemReleaseVersion() {
    	return systemReleaseVersion;
    }
	public void setSystemReleaseVersion(String systemReleaseVersion) {
    	this.systemReleaseVersion = systemReleaseVersion;
    }
	public String getSystemDeveloper() {
    	return systemDeveloper;
    }
	public void setSystemDeveloper(String systemDeveloper) {
    	this.systemDeveloper = systemDeveloper;
    }
	public String getSystemCopyright() {
    	return systemCopyright;
    }
	public void setSystemCopyright(String systemCopyright) {
    	this.systemCopyright = systemCopyright;
    }
	public String getSystemCustomerId() {
    	return systemCustomerId;
    }
	public void setSystemCustomerId(String systemCustomerId) {
    	this.systemCustomerId = systemCustomerId;
    }
	public String getIsUse() {
    	return isUse;
    }
	public void setIsUse(String isUse) {
    	this.isUse = isUse;
    }
}
