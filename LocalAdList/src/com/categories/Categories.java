package com.categories;
import org.bson.types.ObjectId;
public class Categories {
	private ObjectId id;
	private String choose;
	private String postingtitle;
	private String city;
	private String postalcode;
	private String description;
	private String email;
	
	Categories() {}
 
	public Categories(String choose,String postingtitle, String city, String postalcode,String description,String email ) {
		super();
		this.choose=choose;
		this.postingtitle = postingtitle;
		this.city = city;
		this.postalcode = postalcode;
		this.description = description;
		this.email=email;
	}
	public ObjectId getId() {
		return id;
	}
	public void setId(ObjectId id) {
		this.id = id;
	}
	public String getPostingtitle() {
		return postingtitle;
	}
	public void setPostingtitle(String postingtitle) {
		this.postingtitle = postingtitle;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPostalcode() {
		return city;
	}
	public void setPostalcode(String postalcode) {
		this.postalcode = postalcode;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getChoose() {
		return choose;
	}
	public void setChoose(String choose) {
		this.choose = choose;
	}

}
