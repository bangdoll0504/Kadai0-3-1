package beansdomain;

import java.io.Serializable;

import daodto.EmplDAO;
import daodto.EmplDTO;

public class Employee implements Serializable {
	private String emplid; // 顧客ID
	private String emplpass; // パスワード
	private String lname; // 姓
	private String fname; // 名
	private EmplDAO emplDAO; // DAOインスタンス変数

	public Employee() {
	} // 引数なしのコンストラクタ。コンストラクタが一つもないときは自動作成されるが、
		// 下で引数ありのコンストラクタを利用するので、これは必須

	public Employee(String emplid, String emplpass) throws Exception {
		this.emplDAO = new EmplDAO();
		// DAOで検索し、その結果をDTOで受け取る
		EmplDTO emplDTO = emplDAO.emplRefer(emplid, emplpass);
		// 受け取ったデータをBeans(ドメイン（このオブジェクト））に入れなおす
		// 一見無駄とも思える行為だが、内輪ルールとして行う
		this.emplid = emplDTO.getEmplid();
		this.emplpass = emplDTO.getEmplPass();
		this.lname = emplDTO.getEmplLname();
		this.fname = emplDTO.getEmplFname();
	}

	public String getEmplid() {
		return emplid;
	}

	public String getEmplPass() {
		return emplpass;
	}

	public String getEmplLname() {
		return lname;
	}

	public String getEmplFname() {
		return fname;
	}

	public void setEmplid(String emplid) {
		this.emplid = emplid;
	}

	public void setEmplPass(String emplpass) {
		this.emplpass = emplpass;
	}

	public void setEmplLname(String empllname) {
		this.lname = empllname;
	}

	public void setEmplFname(String emplfname) {
		this.fname = emplfname;
	}

	public boolean isExist() {
		if (this.fname == null) {
			return false;
		} else {
			return true;
		}
	}

}
