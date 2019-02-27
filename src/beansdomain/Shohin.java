package beansdomain;

import java.io.Serializable;

import daodto.ShohinDAO;
import daodto.ShohinDTO;

public class Shohin implements Serializable{
	private String shohinid; //商品ID
	private int teika; //定価
	private int kakaku; //価格（販売予定価格）
	private String shohinmei; //商品名
	private String isbn; //ISBNコード
	private ShohinDAO shohinDAO; //DAOインスタンス変数

	
	public Shohin(){}  //引数なしのコンストラクタ。コンストラクタが一つもないときは自動作成されるが、
	                   //下で引数ありのコンストラクタを利用するので、これは必須
	public Shohin(String shohinid) throws Exception{
		this.shohinDAO = new ShohinDAO();
		//DAOで検索し、その結果をDTOで受け取る
		ShohinDTO shohinDTO = shohinDAO.shohinRefer(shohinid);
		//受け取ったデータをBeans(ドメイン（このオブジェクト））に入れなおす
		//一見無駄とも思える行為だが、内輪ルールとして行う
		this.shohinid = shohinDTO.getShohinid();
		this.teika = shohinDTO.getTeika();
		this.kakaku = shohinDTO.getKakaku();
		this.shohinmei = shohinDTO.getShohinmei();
		this.isbn = shohinDTO.getIsbn();
	}


	public String getShohinid() {
		return shohinid;
	}
	public int getTeika() {
		return teika;
	}
	public int getKakaku() {
		return kakaku;
	}
	public String getShohinmei() {
		return shohinmei;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setShohinid(String shohinid) {
		this.shohinid = shohinid;
	}
	public void setTeika(int teika) {
		this.teika = teika;
	}
	public void setKakaku(int kakaku) {
		this.kakaku = kakaku;
	}
	public void setShohinmei(String shohinmei) {
		this.shohinmei = shohinmei;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	public boolean isExist(){
		if(this.shohinmei==null){
			return false;
		}else{
			return true;
		}
	}

}
