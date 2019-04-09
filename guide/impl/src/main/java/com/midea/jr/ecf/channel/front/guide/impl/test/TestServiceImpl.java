package com.midea.jr.ecf.channel.front.guide.impl.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.midea.jr.ecf.channel.front.guide.dao.test.dao.TestDao;
import com.midea.jr.ecf.channel.front.guide.dao.test.po.TestPo;
import com.midea.jr.ecf.channel.front.guide.service.test.TestService;

/**
 * @author csy
 * @description
 * @date 2018-4-19
 */
@Service
public class TestServiceImpl implements TestService {

	@Autowired
	private TestDao testDao;

	@Override
	@Transactional
	public String test() {
		TestPo testPo = new TestPo();
		testPo.setName( "csy" );
		testDao.insert( testPo );
		return "success";
	}
}
