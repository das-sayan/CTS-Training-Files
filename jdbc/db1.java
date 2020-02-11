import java.sql.*;
public class db1 {

	public static void main(String[] args) throws Exception {
		String url="jdbc:mysql://localhost:3306/mydb";
		String username="root";
		String password="1234";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,username,password);
		Statement stmt=con.createStatement();
		
		//String s1="create table employee(emp_id int not null primary key, emp_name varchar(30))";
		
		//stmt.executeUpdate(s1);
		//System.out.println("Table Created !!");
		String s3="insert into employee values(5,'Ram');";
		stmt.executeUpdate(s3);
		
		
		String s2="select * from employee";
		ResultSet rs = stmt.executeQuery(s2);
		
		
		while(rs.next()){
			System.out.println(rs.getInt(1)+ " "+rs.getString(2) );
		}*/
		/*String s16="insert into employee values(?,?);";
		PreparedStatement pstmt = con.prepareStatement(s16);
		pstmt.setInt(1,5);
		pstmt.setString(2,"Harshal");
		pstmt.executeUpdate();
		*/
		String s3="delete from employee where emp_id=5";
		stmt.executeUpdate(s3);
		String s2="select * from employee";
		ResultSet rs = stmt.executeQuery(s2);
		
		
		while(rs.next()){
			System.out.println(rs.getInt(1)+ " "+rs.getString(2) );
		}
		stmt.close();
		con.close();
	}

}
