package com.soccer.web.daoImpls;

import com.soccer.web.daos.TeamDao;
import com.soccer.web.domains.TeamBean;

public class TeamDaoImpl implements TeamDao{
	private static TeamDaoImpl instance = new TeamDaoImpl();
	
	public static TeamDaoImpl getInstance() {
		return instance;
	}
	
	private TeamDaoImpl() {}
	@Override
	public void insertTeam(TeamBean param) {
		// TODO Auto-generated method stub
		
	}

}
