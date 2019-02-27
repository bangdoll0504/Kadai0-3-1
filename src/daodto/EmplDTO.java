package daodto;


public class EmplDTO{
	private String emplid; //商品ID
	private String emplpass; //定価
	private String empllname; //価格（販売予定価格）
	private String emplfname; //商品名

	public EmplDTO(){
		this.emplid=null;
		this.emplpass=null;
		this.empllname=null;
		this.emplfname=null;
	}

	public String getEmplid() {
		return emplid;
	}

	public String getEmplPass() {
		return emplpass;
	}

	public String getEmplLname() {
		return empllname;
	}

	public String getEmplFname() {
		return emplfname;
	}

	public void setCuserid(String emplid) {
		this.emplid = emplid;
	}

	public void setPass(String pass) {
		this.emplpass = pass;
	}

	public void setLname(String lname) {
		this.empllname = lname;
	}

	public void setSname(String fname) {
		this.emplfname = fname;
	}
}
