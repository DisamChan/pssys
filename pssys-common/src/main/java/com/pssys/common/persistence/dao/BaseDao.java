package com.pssys.common.persistence.dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pssys.entity.sys.SysUser;

/**
 * 要实现公共dao方法暴露给所有子类
 * 注意： 泛型只有在运行时才能确定是什么类型，如果直接使用@Repository等注册spring bean的注解，
 * 在启动时会报错，因为泛型类型不确定，只有在我使用BaseDao的子类，例如SysUserDao<SysUser, Long>的时候才能确定泛型的类型，
 * spring data jpa 有提供这样的方式来搞定泛型公共dao的问题，需要这样做：
 * 1，BaseDao<T, Long>继承 jpa的接口
 * 2，实现BaseDao并继承SimpleJpaRepository，实现BaseDao需要实现两个构造方法之一，从构造方法中拿到泛型类型class和entityManager
 * 3，写一个自定义的方法，例如本类中的 testCutomMethoh()
 * 4，取代<jpa:repositories>中的factory-class，建立一个继承JpaRepositoryFactoryBean类的factory-class，
 * 重写RepositoryFactorySupport()方法，方法返回一个继承JpaRepositoryFactory的类
 * 5，建立一个继承JpaRepositoryFactory的类，重写getRepositoryBaseClass()和getTargetRepository(),
 * getRepositoryBaseClass()返回BaseDaoImpl实现类的class，getTargetRepository()返回new BaseDaoImpl( (Class<T>)metadata.getDomainType(), entityManager) 即可
 * 这样实现BaseDao接口的所有类都会具有BaseDao声明的实现
 * @author zengyufei
 * 2016-5-9 下午9:27:50
 * @param <T>
 * @param <ID>
 */
public interface BaseDao<T, ID extends Serializable>
	extends JpaRepository<T, ID> {
	
	/**
	 * 测试的方法，给与继承此类的所有子类暴露该方法
	 * @author zengyufei
	 * 2016-5-9 下午9:13:57
	 * @throws Exception
	 */
	void testCutomMethoh(SysUser sysUser) throws Exception;
	
	/*
	    And --- 等价于 SQL 中的 and 关键字，比如 findByUsernameAndPassword(String user, Striang pwd)；
		Or --- 等价于 SQL 中的 or 关键字，比如 findByUsernameOrAddress(String user, String addr)；
		Between --- 等价于 SQL 中的 between 关键字，比如 findBySalaryBetween(int max, int min)；
		LessThan --- 等价于 SQL 中的 "<"，比如 findBySalaryLessThan(int max)；
		GreaterThan --- 等价于 SQL 中的">"，比如 findBySalaryGreaterThan(int min)；
		IsNull --- 等价于 SQL 中的 "is null"，比如 findByUsernameIsNull()；
		IsNotNull --- 等价于 SQL 中的 "is not null"，比如 findByUsernameIsNotNull()；
		NotNull --- 与 IsNotNull 等价；
		Like --- 等价于 SQL 中的 "like"，比如 findByUsernameLike(String user)；
		NotLike --- 等价于 SQL 中的 "not like"，比如 findByUsernameNotLike(String user)；
		OrderBy --- 等价于 SQL 中的 "order by"，比如 findByUsernameOrderBySalaryAsc(String user)；
		Not --- 等价于 SQL 中的 "！ ="，比如 findByUsernameNot(String user)；
		In --- 等价于 SQL 中的 "in"，比如 findByUsernameIn(Collection<String> userList) ，方法的参数可以是 Collection 类型，也可以是数组或者不定长参数；
		NotIn --- 等价于 SQL 中的 "not in"，比如 findByUsernameNotIn(Collection<String> userList) ，方法的参数可以是 Collection 类型，也可以是数组或者不定长参数；
	 */
	
	/*
	 * 扩展JpaRepository
		如果你不想暴露那么多的方法，可以自己订制自己的Repository，还可以在自己的Repository里面添加自己使用的公共方法
		当然更灵活的是自己写一个实现类，来实现自己需要的方法
		1：写一个与接口同名的类，加上后缀为Impl，这个在前面xml里面配置过，可以自动被扫描到。这个类不需要实现任何接口。
		2：在接口中加入自己需要的方法，比如：
		public Page<Object[]> getByCondition(UserQueryModel u);
		3：在实现类中，去实现这个方法就好了，会被自动找到
		4 : 参考roleDao和roleDaoImpl
	 * 
	 * 
	 */
}
