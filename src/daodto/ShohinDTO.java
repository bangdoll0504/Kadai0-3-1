package daodto;


public class ShohinDTO{
	private String shohinid; //商品ID
	private int teika; //定価
	private int kakaku; //価格（販売予定価格）
	private String shohinmei; //商品名
	private String isbn; //ISBNコード
		
	public ShohinDTO(){
		this.shohinid=null;
		this.teika=0;
		this.kakaku=0;
		this.shohinmei=null;
		this.isbn=null;
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
	
	
	
}
