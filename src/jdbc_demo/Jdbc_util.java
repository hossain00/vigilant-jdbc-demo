package jdbc_demo;
import java.sql.*;
public class Jdbc_util {
	private static final String mysqlUrl = "jdbc:mysql://localhost:3306/demo";
	private static final String oraUrl = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String myUser ="student";
	private static final String myPass = "student";
	private static final String orUser = "hr";
	private static final String orPass = "hr";
	
	
	
	public static Connection getConnection(Db_type type) throws SQLException{
		
		switch(type){
		
		case MYSQL_DB:
			return DriverManager.getConnection(mysqlUrl, myUser, myPass);
		
		case ORACLE_DB:
			return DriverManager.getConnection(oraUrl, orUser, orPass);
			
		default:
			return null;
		
			
			
			
			
		}		
		
		
	}

}
