package learn.jdbc;
import java.io.IOException;
import java.sql.*;
public class A1_LoadDriverTest {

	/*
	1. load and register driver
	-> loaddriver: 
	-> set classpath=c:/oraclexe/.../lib/ojdbc6.jar
	2. establish connection
	3. Statement, PreparedStat, CallableState
	4. write and execute sql
		execute(any), executeQuery(select), executeUpdate(non select DDL, DML)
	5. close resources
	*/
	
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
			//type1 //Class a = Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			//type4?
			//Class a = Class.forName("oracle.jdbc.OracleDriver");
			//ProcessBuilder pb = new ProcessBuilder("dir");
			//pb.start();
			
			//System.out.println(a.toString());

				//dsn_name //url: jdbc:oracle:thin:@localhost:1521:xe
				Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
				System.out.println(con);
				Statement st = con.createStatement();
						//prepareStatement("select * from employees where rownum =1");
				
				ResultSet rs = st.executeQuery("select first_name from employees where rownum =1"); //resultset
				
				System.out.println(rs.toString()+"");
				rs.close();
				st.close();
				con.close();
				//rs.getRow()
				//Row r = rs.first();
				
				//int a = st.executeUpdate("update employees set first_name = 'TEST' where rownum =1"); //int
				//System.out.println(a+"");
				//st.execute(arg0) //
				
				//dynamic sql - use execute method.
				
/*
				con.createStatement();
				con.prepareStatement(sql);
				con.prepareCall(sql);

				1) Statement  		  –  Used to execute normal SQL queries.
				2) PreparedStatement  –  Used to execute dynamic or parameterized SQL queries.
				3) CallableStatement  –  Used to execute the stored procedures.
*/
}
}

/*
ResultSet executeQuery(String sql) throws SQLException :
This method is used for SQL statements which retrieve some data from the database. For example is SELECT statement. This method is meant to be used for select queries which fetch some data from the database. This method returns one java.sql.ResultSet object which contains the data returned by the query.
int executeUpdate(String sql) throws SQLException :
This method is used for SQL statements which update the database in some way. For example INSERT, UPDATE and DELETE statements. All these statements are DML(Data Manipulation Language) statements. This method can also be used for DDL(Data Definition Language) statements which return nothing. For example CREATE and ALTER statements. This method returns an int value which represents the number of rows affected by the query. This value will be 0 for the statements which return nothing.
boolean execute(String sql) throws SQLException :
This method can be used for all types of SQL statements. If you don’t know which method to use for you SQL statements, then this method can be the best option. This method returns a boolean value. TRUE indicates that statement has returned a ResultSet object and FALSE indicates that statement has returned an int value or returned nothing.
*/