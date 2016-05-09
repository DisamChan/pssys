package com.pssys.sys.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pssys.common.web.BaseController;
import com.pssys.dao.sys.SysUserDao;
import com.pssys.entity.sys.SysUser;


/**
 * 系统用户控制器，用于登录、注销
 * @author zengyufei
 * 2016-4-10 下午12:45:04
 */
@Controller
@RequestMapping("/sysUser")
public class SysUserController extends BaseController {
	
	@Autowired
	SysUserDao sysUserDao;
	
	/**
	 * 用户添加
	 * @author zengyufei
	 * 2016-4-10 下午12:49:40
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/save")
	public String save() throws Exception
	{
		System.out.println("save 方法调用！");
		SysUser sysUser = new SysUser();
		sysUser.setId(1L);
		sysUser.setUserName("zengyufei");
		sysUser.setPassword("123456");
		sysUserDao.save(sysUser);
		return null;
	}
}
