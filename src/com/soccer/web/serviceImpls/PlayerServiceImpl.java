package com.soccer.web.serviceImpls;

import java.util.List;

import com.soccer.web.daoImpls.PlayerDaoImpl;
import com.soccer.web.domains.PlayerBean;
import com.soccer.web.services.PlayerService;

public class PlayerServiceImpl implements PlayerService{
	//singleton pattern
	private static PlayerServiceImpl instance = new PlayerServiceImpl();
	public static PlayerServiceImpl getInstance() {return instance;}
	private PlayerServiceImpl() {}
	
	public PlayerBean login(PlayerBean param) {
		System.out.println("서비스임플 로그인 접속");
		System.out.println("playerId값" + param.getPlayerId());
		System.out.println("solar값" + param.getSolar());
		return PlayerDaoImpl.getInstance().selectByPlayerIdSolar(param);
	}
	public List<String> findPositions() {
		return PlayerDaoImpl.getInstance().selectPositions();
	}

	@Override
	public List<PlayerBean> findByTeamIdPosition(PlayerBean param) {
		
		return PlayerDaoImpl.getInstance().selectByTeamIdPosition(param);
	}

	@Override
	public List<PlayerBean> findByTeamIdHeightName(PlayerBean param) {
		return PlayerDaoImpl.getInstance().selectByTeamIdPositionHeightName(param);
	}

}
