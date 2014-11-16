package com.nitts.shopperparadise;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Index;

@Entity
public class EntityProduct {
	@Id String name;
	@Index String type;
	@Index String imgurl;
	@Index int cost;
	
	EntityProduct(){}
	public EntityProduct(String name,String type,String imgurl,int cost)
	{
		super();
		this.name = name;
		this.type=type;
		this.imgurl = imgurl;
		this.cost=cost;
	
	}
	public String getName() {
		return name;
	}
	public String getType()
	{
		return type;
	}
	public String getImgurl() {
		return imgurl;
	}
	public int getCost() {
		return cost;
	}
	
	
	

	
}
