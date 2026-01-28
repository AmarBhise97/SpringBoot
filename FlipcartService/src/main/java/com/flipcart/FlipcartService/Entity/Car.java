package com.flipcart.FlipcartService.Entity;

import java.util.UUID;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.ApplicationScope;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;
@Component



//@Scope("singleton")//only one bean created
//@Scope("prototype")//only change two tabs ore gives calss name
//@RequestScope  //change even you gives the request
//@SessionScope  //session scope when will session will change.
@ApplicationScope//only change servalatrequest.


public class Car {
	UUID uuid=UUID.randomUUID();
	public String getid() {
		return this.uuid+" ";
	}
	

}
