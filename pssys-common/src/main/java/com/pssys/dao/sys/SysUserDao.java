package com.pssys.dao.sys;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.pssys.common.persistence.dao.BaseDao;
import com.pssys.entity.sys.SysUser;

public interface SysUserDao extends BaseDao<SysUser, Long> {
	
	/* 以下注释 spring data jpa 都已实现 */
	/* 查询所有用户 */
	/* 保存用户，保存用户前默认会查询一次确认是否存在 */
	/* 删除用户 */
	
	/**
	 * 修改用户密码
	 * @author zengyufei
	 * 2016-4-28 下午9:52:42
	 * @param password 要修改的密码
	 * @param id	谁要修改密码
	 * @return
	 * @throws Exception
	 */
	@Modifying
	@Query("update SysUser set password = :password where id=:id")
	public Long updateUserPasswordById(@Param("password")String password, @Param("id") Long id) throws Exception;

	/**
	 * 根据用户名和密码查找数据库获取实体
	 * @author zengyufei
	 * 2016-4-24 上午8:50:38
	 * @param userName
	 * @param password
	 * @return
	 */
	public SysUser findByUserNameAndPassword(String userName, String password);

	/**
	 * 根据用户名查找数据库获取实体
	 * @author zengyufei
	 * 2016-4-24 上午8:53:54
	 * @param userName
	 * @return
	 */
	public SysUser findByUserName(String userName);
	
}
