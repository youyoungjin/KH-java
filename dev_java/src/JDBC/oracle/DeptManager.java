package JDBC.oracle;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.sun.tools.javac.util.List;

public class DeptManager {

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
	    public DeptManager() {
	    	 initDisplay();	 
	    }
	    public List<Map<String,object>> getDeptList() {
	    	List<Map<String,object>> deptList = null;
	    	
	    	return dep
	    }

	}

}
