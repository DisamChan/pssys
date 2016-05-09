package com.pssys.sys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.druid.support.json.JSONUtils;
import com.pssys.common.utils.BlankUtils;
import com.pssys.common.web.BaseController;
import com.pssys.entity.sys.SysConf;


/**
 * 系统管理设置
 * @author zengyufei
 * 2016-4-10 下午12:45:04
 */
@Controller
@RequestMapping("/sysconf")
public class SysConfController extends BaseController {
	
	
	/**
	 * 取得正在使用的系统参数模板
	 * @author zengyufei
	 * 2016-5-4 下午11:10:28
	 * @param sysConf
	 * @param model
	 * @return	跳转到编辑默认系统参数页面
	 * @throws Exception
	 */
	@RequestMapping(value="/toEditConf", method = RequestMethod.GET)	
	public String toEditConf(SysConf sysConf, Model model) throws Exception{
		/*SysConf defaultConfiguration = sysConfService.findByDefaultConfiguration();
		model.addAttribute("sysConf", defaultConfiguration);*/
		return "sysconf/toEditConf";
	}
	
	/**
	 * 保存系统参数信息
	 * @author zengyufei
	 * 2016-5-4 下午11:10:28
	 * @param sysConf
	 * @param model
	 * @return	跳转到编辑默认系统参数页面
	 * @throws Exception
	 */
	@ResponseBody
	@RequestMapping(value="/editConf", method = RequestMethod.POST)	
	public String editConf(SysConf sysConf, Model model) throws Exception{
		//sysConf = sysConfService.save(sysConf);
		return BlankUtils.isNotBlank(sysConf) ? JSONUtils.toJSONString(sysConf) : null;
	}
}
