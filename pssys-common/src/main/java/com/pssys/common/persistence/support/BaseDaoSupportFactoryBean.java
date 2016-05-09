package com.pssys.common.persistence.support;

import java.io.Serializable;

import javax.persistence.EntityManager;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.JpaRepositoryFactoryBean;
import org.springframework.data.repository.core.support.RepositoryFactorySupport;

public class BaseDaoSupportFactoryBean<R extends JpaRepository<T, ID>, T, ID extends Serializable>
extends JpaRepositoryFactoryBean<R, T, ID> {

	
	
	@Override
    protected RepositoryFactorySupport createRepositoryFactory(EntityManager entityManager) {
	    return new BaseDaoSupportFactory<T, ID>(entityManager);
    }
	
}