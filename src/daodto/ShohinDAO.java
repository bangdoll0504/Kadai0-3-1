package daodto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class ShohinDAO {
	private Connection con;
	public ShohinDAO()throws Exception{
		DBManagerAdmin dbManagerAdmin = DBManagerAdmin.getDBManagerAdmin();
		this.con = dbManagerAdmin.getConnection();
	}
	
	public ShohinDTO shohinRefer(String shohinid) throws Exception{
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ShohinDTO shohinDTO= new ShohinDTO();
		shohinDTO.setShohinid(shohinid);
		String sql = "SELECT * FROM shohin where shohinid=?";
		
		try{
			pstmt =con.prepareStatement(sql);
			pstmt.setString(1,shohinid);
			rs=pstmt.executeQuery();
			if(rs.next()){
				shohinDTO.setTeika(rs.getInt("teika"));
				shohinDTO.setKakaku(rs.getInt("kakaku"));
				shohinDTO.setShohinmei(rs.getString("shohinmei"));
				shohinDTO.setIsbn(rs.getString("isbn"));
				
			}
		}catch(Exception e){
			e.printStackTrace();
			throw new Exception();
		}
		return shohinDTO;
		
	}
	
}
