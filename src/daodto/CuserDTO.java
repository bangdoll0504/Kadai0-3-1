package daodto;

public class CuserDTO {
	private String cuserid; // 商品ID
	private String pass; // 定価
	private String lname; // 価格（販売予定価格）
	private String sname; // 商品名

	public CuserDTO() {
		this.cuserid = null;
		this.pass = null;
		this.lname = null;
		this.sname = null;
	}

	public String getCuserid() {
		return cuserid;
	}

	public String getPass() {
		return pass;
	}

	public String getLname() {
		return lname;
	}

	public String getSname() {
		return sname;
	}

	public void setCuserid(String cuserid) {
		this.cuserid = cuserid;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}
}
