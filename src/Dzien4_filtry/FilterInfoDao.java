package Dzien4_filtry;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FilterInfoDao {
	
	private static final String JDBC_CONN_STRING = "jdbc:mysql://localhost:3306/coderslab?useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	private static final String USER = "rybak";
	private static final String PASS = "coderslab";	
	private static final String INSERT_SQL = "INSERT INTO filter_info (browser_info, date_time, parameters, execution_time) VALUES (?, ?, ?, ?)";
	private static final String SELECT_SQL = "SELECT * FROM filter_info";

	public void insertFilter(FilterInfo filter) {
		try (Connection con = DriverManager.getConnection(JDBC_CONN_STRING, USER, PASS);) {
			PreparedStatement statement = con.prepareStatement(INSERT_SQL);
			statement.setString(1,  filter.getBrowserInfo());
			statement.setDate(2, filter.getDateTime());
			statement.setString(3, filter.getParameters());
			statement.setLong(4, filter.getExecutionTime());
			statement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}