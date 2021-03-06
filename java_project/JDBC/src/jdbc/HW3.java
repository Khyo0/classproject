package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class HW3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); 

		Connection conn = null;

		// 3. EMP 테이블에서 “SCOTT” 사원의 급여(sal) 정보를 1000으로 바꾸는 프로그램을 작성해보자.

		try {
			// 1. 드라이버 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Oracle Driver Load !!!");

			// 2. DB 연결     localhost == 127.0.0.1
			String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:orcl";
			String user = "scott";
			String password = "tiger";

			conn = DriverManager.getConnection(jdbcUrl, user, password);
			System.out.println("데이터베이스에 접속했습니다.");

			// 3. Statement 인스턴스 생성
			Statement stmt = conn.createStatement();
			
			// 입력 : insert
			String sqlInsert = "insert into dept values (7788, 'SCOTT', ANALYST, 7566, 1000 )";

			int resultCnt = stmt.executeUpdate(sqlInsert);

			if(resultCnt>0) {
				System.out.println("데이터가 정상적으로 입력되었습니다.");
			}
			PreparedStatement pstmt = null;

			String sql = "select * from emp";

			ResultSet rs = stmt.executeQuery(sql);

			if(!rs.next()) {
				System.out.println("검색의 결과가 없습니다.");
			} else {
				do {
					System.out.print(rs.getInt(1)+"\t");
					System.out.print(rs.getString(2)+"\t");
					System.out.println(rs.getString(3)+"\t");
				} while(rs.next());
			}

			rs.close();
			stmt.close();
			conn.close();		

		} catch (ClassNotFoundException e) {
			System.out.println("Driver 로드 실패");

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}