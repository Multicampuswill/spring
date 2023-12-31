package com.multi.mvc000;

public class ProductDTO {
	//DTO의 멤버변수는 db테이블의 컬럼수와 동일해야함.
	private String id;
	private String title;
	private String content;
	private String price;
	private String img;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	@Override
	public String toString() {
		return "ProductDTO [id=" + id + ", title=" + title + ", content=" + content + ", price=" + price + ", img="
				+ img + "]";
	}
	
	
}
