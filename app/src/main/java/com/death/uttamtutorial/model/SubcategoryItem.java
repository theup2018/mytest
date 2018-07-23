package com.death.uttamtutorial.model;

import com.google.gson.annotations.SerializedName;

public class SubcategoryItem{

	@SerializedName("parent")
	private String parent;

	@SerializedName("category_image")
	private Object categoryImage;

	@SerializedName("menu_icon")
	private Object menuIcon;

	@SerializedName("updated_at")
	private String updatedAt;

	@SerializedName("name")
	private String name;

	@SerializedName("created_at")
	private String createdAt;

	@SerializedName("id")
	private int id;

	@SerializedName("slug")
	private String slug;

	@SerializedName("status")
	private String status;

	public void setParent(String parent){
		this.parent = parent;
	}

	public String getParent(){
		return parent;
	}

	public void setCategoryImage(Object categoryImage){
		this.categoryImage = categoryImage;
	}

	public Object getCategoryImage(){
		return categoryImage;
	}

	public void setMenuIcon(Object menuIcon){
		this.menuIcon = menuIcon;
	}

	public Object getMenuIcon(){
		return menuIcon;
	}

	public void setUpdatedAt(String updatedAt){
		this.updatedAt = updatedAt;
	}

	public String getUpdatedAt(){
		return updatedAt;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setCreatedAt(String createdAt){
		this.createdAt = createdAt;
	}

	public String getCreatedAt(){
		return createdAt;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setSlug(String slug){
		this.slug = slug;
	}

	public String getSlug(){
		return slug;
	}

	public void setStatus(String status){
		this.status = status;
	}

	public String getStatus(){
		return status;
	}

	@Override
 	public String toString(){
		return 
			"SubcategoryItem{" + 
			"parent = '" + parent + '\'' + 
			",category_image = '" + categoryImage + '\'' + 
			",menu_icon = '" + menuIcon + '\'' + 
			",updated_at = '" + updatedAt + '\'' + 
			",name = '" + name + '\'' + 
			",created_at = '" + createdAt + '\'' + 
			",id = '" + id + '\'' + 
			",slug = '" + slug + '\'' + 
			",status = '" + status + '\'' + 
			"}";
		}
}