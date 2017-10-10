package com.nt.dao;

import com.nt.bo.RegistrationBO;

public class RegistrationDAOImpl implements RegistrationDAO {
private String qry="insert into nukari_com values(?,?,?,?,?,?)";
	@Override
	public int register(RegistrationBO rbo) {
		//
		return 0;
	}

}
