package com.pssys.common.persistence.dao;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import com.pssys.entity.sys.SysUser;

/**
 * 实现公共dao 
 * @NoRepositoryBean注解的意思是不被spring扫描并注册成bean
 * @author zengyufei
 * 2016-5-9 下午9:14:36
 * @param <T>
 * @param <ID>
 */
@NoRepositoryBean
public class BaseDaoImpl<T, ID extends Serializable> extends SimpleJpaRepository<T, ID>
implements BaseDao<T, ID> {

	@SuppressWarnings("unused")
    private final Class<T> domainClass;
	private EntityManager em;
	
	public BaseDaoImpl(Class<T> domainClass, EntityManager em) {
	    super(domainClass, em);
	    this.domainClass = domainClass;
	    this.em = em;
    }

	@SuppressWarnings("unchecked")
    @Override
    public void testCutomMethoh(SysUser sysUser) throws Exception {
		String hql = "from SysUser";  
        Query q = em.createQuery(hql);  
        List<SysUser> resultList = q.getResultList();
        for (Object object : resultList) {
        	System.out.println(object);
        }
		System.out.println("test success!");
    }


}
