package com.nitts.shopperparadise;





import com.googlecode.objectify.Objectify;
import com.googlecode.objectify.ObjectifyFactory;
import com.googlecode.objectify.ObjectifyService;


public class ofyService {

	static {
		factory().register(EntityPromo.class);
		factory().register(EntityProduct.class);
		
	}
	
	public static  Objectify ofy()
	{
		return  ObjectifyService.ofy();
	}
	public static  ObjectifyFactory factory()
	{
		return ObjectifyService.factory();
	}
}
