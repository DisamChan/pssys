package com.pssys.common.persistence.support;

import java.io.Serializable;

import javax.persistence.EntityManager;

import org.springframework.data.jpa.repository.support.JpaRepositoryFactory;
import org.springframework.data.repository.core.RepositoryMetadata;

import com.pssys.common.persistence.dao.BaseDaoImpl;

public class BaseDaoSupportFactory<T, ID extends Serializable> extends JpaRepositoryFactory {

	private EntityManager entityManager;
	
	public BaseDaoSupportFactory(EntityManager entityManager) {
	    super(entityManager);
	    this.entityManager = entityManager;
    }

    protected Class<?> getRepositoryBaseClass(RepositoryMetadata metadata) {
	    return BaseDaoImpl.class;
    }

	@SuppressWarnings("unchecked")
    protected Object getTargetRepository(RepositoryMetadata metadata) {
	    return new BaseDaoImpl<T, ID>( (Class<T>)metadata.getDomainType(), entityManager);
    }
	
}
