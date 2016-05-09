package com.pssys.common.service;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;

import com.pssys.common.persistence.dao.BaseDao;

public abstract class AbstractBaseService<T, ID extends Serializable> {

	 @Autowired
    protected BaseDao<T, ID> baseDao;

	public T save(T t) throws Exception {
	    return baseDao.save(t);
    }
    
}
