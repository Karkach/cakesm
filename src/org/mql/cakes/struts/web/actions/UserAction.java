package org.mql.cakes.struts.web.actions;

import java.io.File;
import java.util.Map;

import org.apache.struts2.ServletActionContext;
import org.mql.cakes.struts.business.UtilisateurBusiness;
import org.mql.cakes.struts.models.Utilisateur;
import org.mql.cakes.struts.tools.CopyFile;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Utilisateur u;
	private File avatar;
	//private String avatarContentType; 
	private String avatarFileName;
	private Map<String, Object> session;
	
	private UtilisateurBusiness uBusiness;
	
	public UserAction() {
		u = new Utilisateur();
		session = ActionContext.getContext().getSession();
	}
	
	public void setAvatar(java.io.File avatar) {
		this.avatar = avatar;
	}
	
	public java.io.File getAvatar() {
		return avatar;
	}
	
	public UtilisateurBusiness getuBusiness() {
		return uBusiness;
	}
	
	public void setuBusiness(UtilisateurBusiness uBusiness) {
		this.uBusiness = uBusiness;
	}
	
	public void setAvatarFileName(String avatarFileName) {
		this.avatarFileName = avatarFileName;
	}
	
	public Utilisateur getU() {
		return u;
	}
	
	public void setU(Utilisateur u) {
		this.u = u;
	}
	
	private String loadAvatar(){
		try{
			String path = ServletActionContext.getServletContext().getRealPath("/");
			String p[] = path.split(".metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps");
			path = p[0]+"cakes/WebContent/images/avatars/";
			String avatarNam = "karkachCacks"+CopyFile.getIdFile()+avatarFileName.substring(avatarFileName.length()-4);
			CopyFile.copy(avatar, path+avatarNam);
			return "images/avatars/"+avatarNam;
	      }catch(Exception e){
	         return "images/avatar_icone.png";
	      }
	}
	
	public String addUser(){
		u.setPhoto(loadAvatar());
		System.out.println("addUser()"+u);
		session.put("user", u);
		uBusiness.add(u); 
		return ActionSupport.SUCCESS;
	}
 
	public String list(){
		if (session.get("user") != null) {
			return ActionSupport.SUCCESS;
		} else {
			return ActionSupport.ERROR;
		}
	}
	
	public String logout(){
		session.remove("user");
		return ActionSupport.SUCCESS;
	}
	
	public String login(){
		if ((u = uBusiness.connextion(u.getMail(), u.getMotDePasse())) != null) {
			session.put("user", u);
			return ActionSupport.SUCCESS;
		}
		addActionError("Votre combinaison email et mot de passe incorrecte");
		return ActionSupport.ERROR;
	}
}
