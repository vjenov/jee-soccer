package com.soccer.web.daoImpls;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.soccer.web.daos.PlayerDao;
import com.soccer.web.domains.PlayerBean;
import com.soccer.web.factory.DatabaseFactory;
import com.soccer.web.pool.Constants;

public class PlayerDaoImpl implements PlayerDao{
	//singleton pattern
	private static PlayerDaoImpl instance = new PlayerDaoImpl();
	@SuppressWarnings("unused")
	private static Connection conn;
	@SuppressWarnings("unused")
	
	public static PlayerDaoImpl getInstance() {return instance;}
	private PlayerDaoImpl() {}
	
	public List<String> selectPositions() {
		List<String> positions = new ArrayList<>();
		try {
			String sql = "SELECT DISTINCT POSITION position \n" + "FROM PLAYER";
			PreparedStatement stmt = DatabaseFactory.createDatabase(Constants.VENDOR).getConnection().prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				positions.add(rs.getString("position"));
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return positions;
	}

	@Override
	public List<PlayerBean> selectByTeamIdPosition(PlayerBean param) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PlayerBean> selectByTeamIdPositionHeightName(PlayerBean param) {
		// TODO Auto-generated method stub
		return null;
	}


}
