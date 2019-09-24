package com.soccer.web.daoImpls;

import com.soccer.web.daos.ScheduleDao;
import com.soccer.web.domains.ScheduleBean;

public class ScheduleDaoImpl implements ScheduleDao{
	private static ScheduleDaoImpl instance = new ScheduleDaoImpl();
	
	public static ScheduleDaoImpl getInstance() {
		return instance;
	}
	
	private ScheduleDaoImpl() {}
	@Override
	public void insertSchedule(ScheduleBean param) {
		// TODO Auto-generated method stub
		
	}

}
