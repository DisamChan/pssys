package com.pssys.service.sys;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pssys.common.service.BaseService;
import com.pssys.common.utils.BlankUtils;
import com.pssys.dao.sys.SysUserDao;
import com.pssys.entity.sys.SysUser;

@Service
@Transactional(readOnly = true)
public class SysUserService extends BaseService<SysUser, Long> {
	
	private static final Logger log = LoggerFactory.getLogger(SysUserService.class);
	
	@Autowired
	private SysUserDao sysUserDao;

	/**
	 * 修改密码
	 * @author zengyufei
	 * 2016-4-24 上午8:47:56
	 * @param sysUser
	 * @param password
	 * @return
	 */
	@Transactional(readOnly = false)
	public Long updatePassword(SysUser sysUser, String password){
        try {
	        sysUser.setPassword(password);
	        sysUserDao.save(sysUser);
	        return 1L;
        } catch (Exception e) {
	        return -1L;
        }
	}
	
	/**
	 * 根据用户名查找数据库判断是否存在 或 判断是否有同名账户
	 * @author zengyufei
	 * 2016-4-24 上午8:55:08
	 * @param userName
	 * @return
	 */
	@Transactional(readOnly = true)
	public Long validateUserName(String userName){
		try {
	        SysUser sysUser = sysUserDao.findByUserName(userName);
	        return BlankUtils.isNotBlank(sysUser) ? 1L : -1L;
        } catch (Exception e) {
        	return -1L;
        }
	}
	
	/**
	 * 根据用户名和密码查找数据库获取实体
	 * @author zengyufei
	 * 2016-4-24 上午8:55:35
	 * @param userName
	 * @param password
	 * @return
	 */
	@Transactional(readOnly = true)
	public SysUser login(String userName, String password){
		try {
			return sysUserDao.findByUserNameAndPassword(userName, password);
        } catch (Exception e) {
        	return null;
        }
	}
	
}
