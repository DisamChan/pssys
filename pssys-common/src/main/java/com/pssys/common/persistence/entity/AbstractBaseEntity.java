package com.pssys.common.persistence.entity;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * 公共抽象实体父类
 * @MappedSuperclass注解使该类的属性可以被继承并写入表中
 * @author zengyufei
 * 2016-4-22 下午10:39:51
 */
@MappedSuperclass
public abstract class AbstractBaseEntity<ID extends Serializable> implements Serializable{
	
    private static final long serialVersionUID = 1L;
    
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private ID id;
	/**
     * @Id 映射主键属性,这里采用uuid的主键生成策略
      * @GeneratedValue —— 注解声明了主键的生成策略。该注解有如下属性
      * strategy 指定生成的策略,默认是GenerationType. AUTO
     * GenerationType.AUTO 主键由程序控制
      * GenerationType.TABLE 使用一个特定的数据库表格来保存主键
      * GenerationType.IDENTITY 主键由数据库自动生成,主要是自动增长类型
      * GenerationType.SEQUENCE 根据底层数据库的序列来生成主键，条件是数据库支持序列
      * generator 指定生成主键使用的生成器
      */

	public ID getId() {
    	return id;
    }

	public void setId(ID id) {
    	this.id = id;
    }
	
}
