package org.bhoopendra.jdbc;

import java.util.List;

import javax.sql.DataSource;

import org.bhoopendra.bean.Circle;
import org.bhoopendra.dao.CircleDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;

public class SimpleJdbcTemplateImpl implements CircleDAO {
	
	private DataSource dataSource;
	private SimpleJdbcTemplate simpleJdbcTemplate;
	

	public DataSource getDataSource() {
		return dataSource;
	}

	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.simpleJdbcTemplate = new SimpleJdbcTemplate(dataSource);
	}

	@Override
	public Circle createCircle(Circle circle)
			throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getCircleCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getCircleName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Circle> getAllCircle() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertCircle() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void createTriangleTable() {
		// TODO Auto-generated method stub
		
	}

}
