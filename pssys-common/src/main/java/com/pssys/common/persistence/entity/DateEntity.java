package com.pssys.common.persistence.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.OrderBy;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * 公共实体类时间类
 * @DateTimeFormat格式化时间格式，只针对Date类型
 * @Temporal注解好像是能够在创建类的时候自定赋值，无需手动赋值，TemporalType有几种类型，分别为年份，日期，时间和完整的年月日时分秒
 * @CreatedBy目前不生效
 * @Column数据库表的别名
 * @author zengyufei
 * 2016-4-22 下午10:46:30
 */
@MappedSuperclass
public abstract class DateEntity<ID extends Serializable> extends AbstractBaseEntity<ID> {
	
    private static final long serialVersionUID = 1L;
    
    /**
     * 每条记录的创造时间
     */
    @Column(name="createDate")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH-mm-ss")
    @Temporal(TemporalType.TIMESTAMP)
    @OrderBy(value = "createDate ASC")//注释指明加载类时按createDate的降序排序 ，如果这么做了，将会牺牲一点性能 
	private Date createDate;
    //@Temporal注释用来指定java.util.Date 或java.util.Calendar 属性与数据库类型date,time 或timestamp 中的那一种类型进行映射  
    
    /**
     * 创建记录于谁
     */
    @Column(name="createBy")
    @CreatedBy
    private String createBy;
	/**
	 * 最后操作时间
	 */
	@Column(name="lastModifiedDate")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH-mm-ss")
	@Temporal(TemporalType.TIMESTAMP)
	private Date lastModifiedDate;
	/**
	 * 最后修改于谁
	 */
    @Column(name="lastModifiedBy")
    @LastModifiedBy
    private String lastModifiedBy;
    
	public String getCreateBy() {
    	return createBy;
    }
	public void setCreateBy(String createBy) {
    	this.createBy = createBy;
    }
	public String getLastModifiedBy() {
    	return lastModifiedBy;
    }
	public void setLastModifiedBy(String lastModifiedBy) {
    	this.lastModifiedBy = lastModifiedBy;
    }
	public Date getCreateDate() {
    	return createDate;
    }
	public void setCreateDate(Date createDate) {
    	this.createDate = createDate;
    }
	public Date getLastModifiedDate() {
    	return lastModifiedDate;
    }
	public void setLastModifiedDate(Date lastModifiedDate) {
    	this.lastModifiedDate = lastModifiedDate;
    }
}
