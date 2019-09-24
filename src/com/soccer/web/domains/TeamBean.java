package com.soccer.web.domains;

import java.io.Serializable;

import lombok.Data;

@Data
public class TeamBean implements Serializable{
	private static final long serialVersionUID = 1L;
	private String teamId, teamName, regionName, orgYyyy,
	homePage, address, ddd, stadiumId, zipCode1, zipCode2,
	tel, fax, owner;
}
