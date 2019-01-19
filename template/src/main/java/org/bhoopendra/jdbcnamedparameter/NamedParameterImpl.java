package org.bhoopendra.jdbcnamedparameter;

import java.util.List;

import javax.sql.DataSource;

import org.bhoopendra.bean.Circle;
import org.bhoopendra.dao.CircleDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Component;
@Component
public class NamedParameterImpl implements CircleDAO {
	
	private DataSource dataSource;
	private NamedParameterJdbcTemplate jdbcTemplate;

	public DataSource getDataSource() {
		return dataSource;
	}

	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
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
		String sql = "insert into CIRCLE (ID,NAME) values(:id,:name)";
		SqlParameterSource sqlParameterSource = new MapSqlParameterSource("id",10).addValue("name", "Circle Ten");
		jdbcTemplate.update(sql, sqlParameterSource);
		
	}

	@Override
	public void createTriangleTable() {
		// TODO Auto-generated method stub
		
	}

}
