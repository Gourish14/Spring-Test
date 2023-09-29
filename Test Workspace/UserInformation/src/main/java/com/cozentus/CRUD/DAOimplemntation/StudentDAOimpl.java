package com.cozentus.CRUD.DAOimplemntation;


import org.springframework.jdbc.core.JdbcTemplate;

import com.cozentus.CRUD.DAO.StudentDAO;

public class StudentDAOimpl implements StudentDAO {
	
	JdbcTemplate jdbcTemplate;
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int insertStudent() {
		
		String query = "Insert into student values(?,?)";
		int result = (query, studentDAO.getID(), studentDAO.getName());
		System.out.println(result);
	}
}