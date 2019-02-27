package beansdomain;

import java.io.Serializable;

import daodto.CuserDAO;
import daodto.CuserDTO;

public class Customer implements Serializable{
	private String cuserid; //顧客ID
	private String passwd; //パスワード
	private String lname; //姓
	private String fname; //名
	private CuserDAO cuserDAO; //DAOインスタンス変数


	public Customer(){}  //引数なしのコンストラクタ。コンストラクタが一つもないときは自動作成されるが、
	                   //下で引数ありのコンストラクタを利用するので、これは必須
	public Customer(String cuserid) throws Exception{
		this.cuserDAO = new CuserDAO();
		//DAOで検索し、その結果をDTOで受け取る
		CuserDTO cuserDTO = cuserDAO.cuserRefer(cuserid);
		//受け取ったデータをBeans(ドメイン（このオブジェクト））に入れなおす
		//一見無駄とも思える行為だが、内輪ルールとして行う
		this.cuserid = cuserDTO.getCuserid();
		this.passwd = cuserDTO.getPass();
		this.lname = cuserDTO.getLname();
		this.fname = cuserDTO.getSname();
	}


	public String getCuserid() {
		return cuserid;
	}
	public String getPass() {
		return passwd;
	}
	public String getLname() {
		return lname;
	}
	public String getSname() {
		return fname;
	}
	public void setCuserid(String cuserid) {
		this.cuserid = cuserid;
	}
	public void setPass(String pass) {
		this.passwd = pass;
	}
	public void setLname(String kakaku) {
		this.lname = kakaku;
	}
	public void setSname(String shohinmei) {
		this.fname = shohinmei;
	}

	public boolean isExist(){
		if(this.fname==null){
			return false;
		}else{
			return true;
		}
	}

}
