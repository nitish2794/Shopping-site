package com.nitts.shopperparadise;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Index;

@Entity
public class EntityPromo {
	@Id String code;
	@Index int discount;
	
	EntityPromo(){}
	public EntityPromo(String code,int discount)
	{
		super();
		this.code = code;
		this.discount = discount;
	
	}
	public String getCode() {
		return code;
	}
	
	public int getDiscount() {
		return discount;
	}
	
	

	
}
