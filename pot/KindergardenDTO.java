package pot;

import java.sql.Date;

public class KindergardenDTO {
	private String chnum; 
	private String chname; 
	private String chsex;
	private Date chbirthday; 
	private double height; 
	private double weight;
	private String chaddr;
	private String charactor;
	protected String getChnum() {
		return chnum;
	}
	protected void setChnum(String chnum) {
		this.chnum = chnum;
	}
	protected String getChname() {
		return chname;
	}
	protected void setChname(String chname) {
		this.chname = chname;
	}
	protected String getChsex() {
		return chsex;
	}
	protected void setChsex(String chsex) {
		this.chsex = chsex;
	}
	protected Date getChbirthday() {
		return chbirthday;
	}
	protected void setChbirthday(Date chbirthday) {
		this.chbirthday = chbirthday;
	}
	protected double getHeight() {
		return height;
	}
	protected void setHeight(double height) {
		this.height = height;
	}
	protected double getWeight() {
		return weight;
	}
	protected void setWeight(double weight) {
		this.weight = weight;
	}
	protected String getChaddr() {
		return chaddr;
	}
	protected void setChaddr(String chaddr) {
		this.chaddr = chaddr;
	}
	protected String getCharactor() {
		return charactor;
	}
	protected void setCharactor(String charactor) {
		this.charactor = charactor;
	}
	@Override
	public String toString() {
		return "KindergardenDTO [chnum=" + chnum + ", chname=" + chname + ", chsex=" + chsex + ", chbirthday="
				+ chbirthday + ", height=" + height + ", weight=" + weight + ", chaddr=" + chaddr + ", charactor="
				+ charactor + "]";
	}
	public KindergardenDTO(String chnum, String chname, String chsex, Date chbirthday, double height, double weight,
			String chaddr, String charactor) {
		this.chnum = chnum;
		this.chname = chname;
		this.chsex = chsex;
		this.chbirthday = chbirthday;
		this.height = height;
		this.weight = weight;
		this.chaddr = chaddr;
		this.charactor = charactor;
	}
	public KindergardenDTO() {
	}
	
	
}
