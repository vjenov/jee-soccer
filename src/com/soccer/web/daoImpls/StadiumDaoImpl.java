package com.soccer.web.daoImpls;

import com.soccer.web.daos.StadiumDao;
import com.soccer.web.domains.StadiumBean;

public class StadiumDaoImpl implements StadiumDao{
	
	private static StadiumDaoImpl instance = new StadiumDaoImpl();
	
	public static StadiumDaoImpl getInstance() {
		return instance;
	}
	
	private StadiumDaoImpl() {}
	@Override
	public void insertStadium(StadiumBean param) {
		// TODO Auto-generated method stub
		
	}

}
