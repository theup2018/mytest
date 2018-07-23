package com.death.uttamtutorial.model;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class DataItem{

	@SerializedName("parent")
	private Object parent;

	@SerializedName("category_image")
	private String categoryImage;

	@SerializedName("menu_icon")
	private String menuIcon;

	@SerializedName("updated_at")
	private String updatedAt;

	@SerializedName("name")
	private String name;

	@SerializedName("count")
	private int count;

	@SerializedName("created_at")
	private String createdAt;

	@SerializedName("id")
	private int id;

	@SerializedName("subcategory")
	private List<SubcategoryItem> subcategory;

	@SerializedName("slug")
	private String slug;

	@SerializedName("status")
	private String status;

	public void setParent(Object parent){
		this.parent = parent;
	}

	public Object getParent(){
		return parent;
	}

	public void setCategoryImage(String categoryImage){
		this.categoryImage = categoryImage;
	}

	public String getCategoryImage(){
		return categoryImage;
	}

	public void setMenuIcon(String menuIcon){
		this.menuIcon = menuIcon;
	}

	public String getMenuIcon(){
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

	public void setCount(int count){
		this.count = count;
	}

	public int getCount(){
		return count;
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

	public void setSubcategory(List<SubcategoryItem> subcategory){
		this.subcategory = subcategory;
	}

	public List<SubcategoryItem> getSubcategory(){
		return subcategory;
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
			"DataItem{" + 
			"parent = '" + parent + '\'' + 
			",category_image = '" + categoryImage + '\'' + 
			",menu_icon = '" + menuIcon + '\'' + 
			",updated_at = '" + updatedAt + '\'' + 
			",name = '" + name + '\'' + 
			",count = '" + count + '\'' + 
			",created_at = '" + createdAt + '\'' + 
			",id = '" + id + '\'' + 
			",subcategory = '" + subcategory + '\'' + 
			",slug = '" + slug + '\'' + 
			",status = '" + status + '\'' + 
			"}";
		}
}