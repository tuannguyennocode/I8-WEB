package com.i8web.entity.Admin;

public class Products {
	private int id;
	private String name;
	private String price_old;
	private String price_new;
	private String description;
	private String	status;
	private String	many_image;
	private String	image;
	private String	detail;
	private String	product_id;
	private String	ghimSale;
	private String  ghimNew;
	private String slug;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice_new() {
		return price_new;
	}
	public void setPrice_new(String price_new) {
		this.price_new = price_new;
	}
	public String getPrice_old() {
		return price_old;
	}
	public void setPrice_old(String price_old) {
		this.price_old = price_old;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMany_image() {
		return many_image;
	}
	public void setMany_image(String many_image) {
		this.many_image = many_image;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getProduct_id() {
		return product_id;
	}
	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}
	public String getGhimSale() {
		return ghimSale;
	}
	public void setGhimSale(String ghimSale) {
		this.ghimSale = ghimSale;
	}
	public String getGhimNew() {
		return ghimNew;
	}
	public void setGhimNew(String ghimNew) {
		this.ghimNew = ghimNew;
	}
	public String getSlug() {
		return slug;
	}
	public void setSlug(String slug) {
		this.slug = slug;
	}
}