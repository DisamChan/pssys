package com.pssys.common.testservice;

import org.springframework.beans.factory.annotation.Autowired;

import com.pssys.common.service.BaseService;
import com.pssys.common.testdao.TestDao;
import com.pssys.entity.sys.SysUser;

public class TestService extends BaseService{
	
	@Autowired
	private TestDao testDao;
	
	public void test() throws Exception{
		testDao.testCutomMethoh(new SysUser());
	}
}
