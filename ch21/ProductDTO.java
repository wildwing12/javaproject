package ch21;

public class ProductDTO {
	private String product_no; 
	private String plocal; 
	private String pname; 
	private String company;
	private int uprice; 
	private int acc;
	private int sprice;
	protected String getProduct_no() {
		return product_no;
	}
	protected void setProduct_no(String product_no) {
		this.product_no = product_no;
	}
	protected String getPlocal() {
		return plocal;
	}
	protected void setPlocal(String plocal) {
		this.plocal = plocal;
	}
	protected String getPname() {
		return pname;
	}
	protected void setPname(String pname) {
		this.pname = pname;
	}
	protected String getCompany() {
		return company;
	}
	protected void setCompany(String company) {
		this.company = company;
	}
	protected int getUprice() {
		return uprice;
	}
	protected void setUprice(int uprice) {
		this.uprice = uprice;
	}
	protected int getAcc() {
		return acc;
	}
	protected void setAcc(int acc) {
		this.acc = acc;
	}
	protected int getSprice() {
		return sprice;
	}
	protected void setSprice(int sprice) {
		this.sprice = sprice;
	}
	@Override
	public String toString() {
		return "ProductDTO [product_no=" + product_no + ", plocal=" + plocal + ", pname=" + pname + ", company="
				+ company + ", uprice=" + uprice + ", acc=" + acc + ", sprice=" + sprice + "]";
	}
	public ProductDTO() {
	}
	public ProductDTO(String product_no, String plocal, String pname, String company, int uprice, int acc) {
		super();
		this.product_no = product_no;
		this.plocal = plocal;
		this.pname = pname;
		this.company = company;
		this.uprice = uprice;
		this.acc = acc;
		sprice = uprice*acc;
	}
	
	
	
}
