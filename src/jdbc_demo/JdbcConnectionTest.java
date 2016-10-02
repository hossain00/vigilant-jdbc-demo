package jdbc_demo;
import java.sql.*;
public class JdbcConnectionTest {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			conn = Jdbc_util.getConnection(Db_type.MYSQL_DB);
			
			System.out.println("connection established");
			
			stmt = conn.createStatement();
			
			rs = stmt.executeQuery("select * from employees");
			
			
			
			while(rs.next()){
				
				System.out.println(rs.getString("first_name"));
			}
			
				rs.last();
			
				System.out.println(rs.getRow());
		
		
		
		
		
		
		
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.err.println(e.getMessage());
		}
		finally{
			if (rs!=null){rs.close();}
			if (stmt!=null){stmt.close();}
			if (conn!=null){conn.close();}
		}
	}

}
