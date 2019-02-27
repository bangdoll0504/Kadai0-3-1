package daodto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CuserDAO {
	private Connection con;

	public CuserDAO() throws Exception {
		DBManagerAdmin dbManagerAdmin = DBManagerAdmin.getDBManagerAdmin();
		this.con = dbManagerAdmin.getConnection();
	}

	public CuserDTO cuserRefer(String empid) throws Exception {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		CuserDTO cuserDTO = new CuserDTO();
		cuserDTO.setCuserid(empid);
		String sql = "SELECT * FROM employee where empid=?";

		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, empid);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				cuserDTO.setPass(rs.getString("password"));
				cuserDTO.setLname(rs.getString("lname"));
				cuserDTO.setSname(rs.getString("fname"));
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}
		return cuserDTO;

	}

}
