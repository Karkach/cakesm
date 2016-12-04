package org.mql.cakes.struts.web.actions;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;

public class SessionAction{

	
	private  Map<String, Object> session;
	
	public SessionAction() {
		session = ActionContext.getContext().getSession();
	}
	
	public  Map<String, Object> getSession() {
		return session;
	}
	
	public  String sessionOpen(){
		if (session.get("user") != null) {
			return "profile";
		} else {
			return "index";
		}
	}
	
}
