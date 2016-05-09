package com.pssys.service.sys;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.pssys.common.service.BaseService;
import com.pssys.entity.sys.SysConf;

@Service
public class SysConfService extends BaseService<SysConf, Long> {
	
	 private static final Logger log = LoggerFactory.getLogger(SysConfService.class);
	
/*	@Autowired
	private SysConfDao sysConfDao;*/
	 
	 /**
	  * 返回默认的系统参数设置
	  * @author zengyufei
	  * 2016-5-4 下午10:38:24
	  * @return
	  * @throws Exception
	  */
	 /*public SysConf findByDefaultConfiguration() throws Exception {
		 log.info("查看默认的系统参数");
	     return sysConfDao.findByIsUse();
    }*/
	 
	 /**
	  * 保存默认的系统参数设置
	  * @author zengyufei
	  * 2016-5-4 下午10:41:01
	  * @param sysConf
	  * @return	成功则返回保存成功的ID，否则返回-1。
	  * @throws Exception
	  */
//	 public Long saveDefaultConfiguration(SysConf sysConf) throws Exception {
//		 log.info("保存默认的系统参数");
//		 SysConf entity = sysConfDao.save(sysConf);
//		 return BlankUtils.isNotBlank(entity) ? entity.getId() : -1;
//	 }
	 
	 /**
	  * 更换默认配置模板，预留接口
	  * @author zengyufei
	  * 2016-5-4 下午10:43:14
	  * @param sysConfId
	  * @return	成功返回大于-1的数。
	  * @throws Exception
	  */
	 /*public Long changeDefaultConfiguration(Long sysConfId) throws Exception {
		 log.info("更换默认的系统参数");
		 return sysConfId;
	 }*/
}
