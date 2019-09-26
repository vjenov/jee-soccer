package com.soccer.web.daoImpls;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
	
	public PlayerBean selectByPlayerIdSolar(PlayerBean param) {
		PlayerBean player = null;
		String sql = "SELECT *\r\n" + 
				"FROM PLAYER\r\n" + 
				"WHERE PLAYER_ID LIKE ?\r\n" +
				"AND SOLAR LIKE ?";
		try {
			PreparedStatement stmt = DatabaseFactory.createDatabase(Constants.VENDOR).getConnection().prepareStatement(sql);
			stmt.setString(1, param.getPlayerId());
			stmt.setString(2, param.getSolar());
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				player = new PlayerBean();
				player.setBackNo(rs.getString("BACK_NO"));
				player.setBirthDate(rs.getString("BIRTH_DATE"));
				player.setEPlayerName(rs.getString("E_PLAYER_NAME"));
				player.setHeight(rs.getString("HEIGHT"));
				player.setJoinYyyy(rs.getString("JOIN_YYYY"));
				player.setNation(rs.getString("NATION"));
				player.setNickName(rs.getString("NICKNAME"));
				player.setPlayerId(rs.getString("PLAYER_ID"));
				player.setPlayerName(rs.getString("PLAYER_NAME"));
				player.setPosition(rs.getString("POSITION"));
				player.setSolar(rs.getString("SOLAR"));
				player.setTeamId(rs.getString("TEAM_ID"));
				player.setWeight(rs.getString("WEIGHT"));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("쿼리에서 뽑아낸 결과값" + player.toString());
		return player;
	}
	public List<String> selectPositions() {
		List<String> positions = new ArrayList<>();
		String sql = "SELECT DISTINCT POSITION position \n" + "FROM PLAYER";
		try {
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
	@Override
	public List<PlayerBean> selectByMany(PlayerBean param) {
		List<PlayerBean> players = new ArrayList<>();
		String sql = "????";
		try {
			PreparedStatement stmt = DatabaseFactory.createDatabase(Constants.VENDOR).getConnection().prepareStatement(sql);
			stmt.setString(1, param.getBackNo());
			stmt.setString(2, param.getBirthDate());
			stmt.setString(3, param.getHeight());
			stmt.setString(4, param.getJoinYyyy());
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return players;
	}


}
