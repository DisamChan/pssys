package com.pssys.sys.controller;

import net.sf.json.JSONObject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pssys.common.utils.BlankUtils;
import com.pssys.common.web.BaseController;
import com.pssys.entity.sys.SysUser;
import com.pssys.service.sys.SysUserService;


/**
 * 系统用户控制器，用于登录、注销
 * @author zengyufei
 * 2016-4-10 下午12:45:04
 */
@Controller
public class SysLoginController extends BaseController{
	
	@Autowired
	private SysUserService sysUserService;
	
	/**
	 * 系统用户登录
	 * @author zengyufei
	 * 2016-4-24 上午8:57:58
	 * @return json
	 * @throws Exception
	 */
	@ResponseBody
	@RequestMapping("/loginOutOfDate")
	public String loginOutOfDate() throws Exception
	{
		JSONObject json = new JSONObject();
		System.out.println("测试登录");
		System.out.println("先判断是否存在系统管理员，如没有，开始添加！");
		Long validateResult = sysUserService.validateUserName("admin");
		if(validateResult == -1)
		{
			SysUser sysUser = new SysUser();
			sysUser.setUserName("admin");
			sysUser.setPassword("123");
			sysUserService.save(sysUser);
		}
		System.out.println("开始登录判断！");
		SysUser login = sysUserService.login("admin", "123");
		if(BlankUtils.isNotBlank(login))
		{
			json.put("status", "success");
			json.put("msg", "登录成功");
			return json.toString();
		}
		json.put("status", "error");
		json.put("msg", "登录失败");
		return json.toString();
	}

}
