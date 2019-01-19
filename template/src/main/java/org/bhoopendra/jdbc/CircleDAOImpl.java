package org.bhoopendra.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.bhoopendra.bean.Circle;
import org.bhoopendra.dao.CircleDAO;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Component;

@Component
public class CircleDAOImpl extends JdbcDaoSupport implements CircleDAO {
	@Override
	public Circle createCircle(Circle circle) {
		
		RowMapper<Circle>	rowMapper = new RowMapper<Circle>() {
			
			@Override
			public Circle mapRow(ResultSet resultSet, int rowNum) throws SQLException {
				return new Circle(resultSet.getInt("ID"), resultSet.getString("NAME"));
			}
		};
		
		String sql = "SELECT * from CIRCLE where id = ?";
		return getJdbcTemplate().queryForObject(sql, new Object[] { 1 },
				(resultSet, rowNum) -> (new Circle(resultSet.getInt("ID"), resultSet.getString("NAME"))));
	}

	@Override
	public int getCircleCount() {
		String sql = "SELECT COUNT(*) from CIRCLE";
		return getJdbcTemplate().queryForInt(sql);

	}

	@Override
	public String getCircleName() {
		String sql = "SELECT name from CIRCLE where id = ?";
		return getJdbcTemplate().queryForObject(sql, new Object[] { 1 }, String.class);
	}

	@Override
	public List<Circle> getAllCircle() {
		String sql = "SELECT * from CIRCLE";
		return getJdbcTemplate().query(sql,
				(resultSet, rowNum) -> (new Circle(resultSet.getInt("ID"), resultSet.getString("NAME"))));
	}

	@Override
	public void insertCircle() {
		String sql = "insert into CIRCLE (ID,NAME) values(?,?)";
		getJdbcTemplate().update(sql, 3, "third circle");
	}

	@Override
	public void createTriangleTable() {
		String sql = "CREATE TABLE TRIANGLE (ID INTEGER,NAME CHAR(50))";
		getJdbcTemplate().execute(sql);
	}
	

}
