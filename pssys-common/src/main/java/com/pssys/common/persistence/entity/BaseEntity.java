package com.pssys.common.persistence.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/**
 * 公共实体父类
 * @author zengyufei
 * 2016-4-22 下午10:39:51
 */
@MappedSuperclass
public abstract class BaseEntity<ID extends Serializable> extends DateEntity<ID>{

    private static final long serialVersionUID = 1L;
	
    /**
     * 逻辑删除状态
     */
    @Column(name="flag")
    private String del_flag;

	public String getDel_flag() {
    	return del_flag;
    }

	public void setDel_flag(String del_flag) {
    	this.del_flag = del_flag;
    }

}
