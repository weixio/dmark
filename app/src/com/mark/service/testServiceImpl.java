package com.mark.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mark.dao.UserDao;
import com.mark.dao.testDao;
import com.mark.po.UserPo;

@Service(value="testService")
public class testServiceImpl implements testService{
	@Autowired
	private testDao testdao;
	@Autowired
	private UserDao userdao;
	public void doservice() {
		System.out.println("testServiceImpl  doservice...");
		testdao.doDao();
		UserPo po = userdao.getUserbyId(1);
		System.out.println(po);
	}
	@Override
	public UserPo getUserPobyId(int id) {
		return userdao.getUserbyId(id);
	}

}
