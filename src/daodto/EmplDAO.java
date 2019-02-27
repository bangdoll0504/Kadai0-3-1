package daodto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class EmplDAO {
	private Connection con;
	public EmplDAO()throws Exception{
		DBManagerAdmin dbManagerAdmin = DBManagerAdmin.getDBManagerAdmin();
		this.con = dbManagerAdmin.getConnection();
	}

	public EmplDTO emplRefer(String emplid, String emplpass) throws Exception{
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		EmplDTO emplDTO= new EmplDTO();
		emplDTO.setCuserid(emplid);
		String sql = "SELECT * FROM employee where empid=? and emppass=?";

		try{
			pstmt =con.prepareStatement(sql);
			pstmt.setString(1,emplid);
			pstmt.setString(2,emplpass);
			rs=pstmt.executeQuery();
			if(rs.next()){
				emplDTO.setPass(rs.getString("emppass"));
				emplDTO.setLname(rs.getString("emplname"));
				emplDTO.setSname(rs.getString("empfname"));
			}
		}catch(Exception e){
			e.printStackTrace();
			throw new Exception();
		}
		return emplDTO;

	}

}
