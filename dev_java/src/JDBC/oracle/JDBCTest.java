package JDBC.oracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBCTest {
	

	public static void main(String[] args) {
		Connection con = null;// interface - 단독으로 인스턴스 불가 A a = new A()
		// 메소드 호출로 객체생성 가능하다.
		// getConnection(URL, username, pw)
		// 물리적으로 떨어져 있는 오라클 서버와 연결통로를 만든다.
		PreparedStatement pstmt = null;
		// 오라클 서버에 sql문을 전달할 때 사용함. 
		// 조회 결과를 받아서 자바에서 출력할 때 오라클에 커서를 조작해야 함. 
		ResultSet re = null;
	    String sql = "SELECCT deptno, dname, loc FROM dept";
		try {
			// 오라클 제조사가 제공하는 드라이버 클래스가 있어야함.
			// 있는 위치는 아래에 C:\Users\youyoungjin\Desktop\이클립스\eGovFrameDev-4.0.0-64bit\eclipse\plugins ojdbc6.jar안에 있어요.
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc.oracle:thin:@192.168.0.18:1521:orcl11","scott","tiger");
			// 파라미터로 받은 select문을 전달
			pstmt = con.prepareStatement(sql);
			//전달된 select문에 대한 처리를 요청하고 커서 받아내기 
			re = pstmt.executeQuery();
		    System.out.println(con+"생성 되었나요?"); 
		} catch (Exception e) {
			System.out.println("오라클 서버와 연결 통로 확보 실패");
			// Stack메모리에 쌓인 에러 메세지에 대한 history정보 출력해줌 
			e.printStackTrace();
			
		}

	}

}
