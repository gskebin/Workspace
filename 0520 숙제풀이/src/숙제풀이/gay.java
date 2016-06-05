package 숙제풀이;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class gay {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("쿼리를 입력하세요");
		String SQL = scan.nextLine();
		try
        {
       
        String driverName = "oracle.jdbc.driver.OracleDriver"; // 드라이버 이름 지정
        String dbURL = "jdbc:oracle:thin:@localhost:1521:ORCL"; // URL 지정
//        String SQL = "select name from user_info";
       
        Class.forName(driverName); // 드라이버 로드
        Connection con  = DriverManager.getConnection(dbURL,"system","oracle2"); // 연결
        System.out.println("Oracle DB Connection.");
        
        Statement stmt = con.createStatement();
       
//      stmt.executeUpdate(sqlCT);

        stmt.executeQuery(SQL);
        ResultSet result = stmt.executeQuery(SQL);
        
        System.out.print("idx" + "\t");
        System.out.print("name" + "\t");
        System.out.print("age" + "\t\n");
        while(result.next())
        {
            System.out.print(result.getInt(1) + "\t");
            System.out.print(result.getString(2) + "\t");
            System.out.print(result.getInt(3) + "\t\n");
        }
       
        con.close();
        }
        catch(Exception e)
        {
                System.out.println("Oracle Server Not Connection.");
                e.printStackTrace();
        }
		
		
	}
	
	
}
