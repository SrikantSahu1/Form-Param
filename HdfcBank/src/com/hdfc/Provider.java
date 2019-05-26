package com.hdfc;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("/surya")
public class Provider{
	@POST
	@Path("/plasma-cutting")
	public String showMsg(
			@FormParam("pid")int prdId,
			@FormParam("pnm")String prdName,
			@FormParam("pcst")double prdCost) 
	{
		return "Plasma Cutting Product Details: "+"ProductID: "+prdId+" ProductName: "+prdName+" ProductCost: "+prdCost;
		
	}
}