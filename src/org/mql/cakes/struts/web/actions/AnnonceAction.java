package org.mql.cakes.struts.web.actions;

import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import org.apache.struts2.ServletActionContext;
import org.mql.cakes.struts.business.AnnonceBusiness;
import org.mql.cakes.struts.models.Annonce;
import org.mql.cakes.struts.models.Utilisateur;
import org.mql.cakes.struts.tools.CopyFile;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class AnnonceAction {
	
	private Annonce annonce;
	private List<Annonce> annonces;
	private AnnonceBusiness aBusiness;
	private  Map<String, Object> session;
	private File imageFile;
	private String imageFileFileName;
	
	public AnnonceAction() {
		System.out.println(">>>> new AnnonceAction");
		annonces = new Vector<>();
		annonce = new Annonce();
		imageFile = new File("/txt");
		session = ActionContext.getContext().getSession();
	}

	public Annonce getAnnonce() {
		return annonce;
	}

	public void setAnnonce(Annonce a) {
		this.annonce = a;
	}

	public List<Annonce> getAnnonces() {
		return annonces;
	}

	public void setAnnonces(List<Annonce> annonces) {
		this.annonces = annonces;
	}

	public AnnonceBusiness getaBusiness() {
		return aBusiness;
	}

	public void setaBusiness(AnnonceBusiness aBusiness) {
		this.aBusiness = aBusiness;
	}

	public void setImageFile(File imageFile) {
		this.imageFile = imageFile;
	}
	
	public File getImageFile() {
		return imageFile;
	}
	
	public String getImageFileFileName() {
		return imageFileFileName;
	}
	
	public void setImageFileFileName(String imageFileName) {
		this.imageFileFileName = imageFileName;
	}
	
	private String loadImage(){
		try{
			String path = ServletActionContext.getServletContext().getRealPath("/");
			String p[] = path.split(".metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps");
			path = p[0]+"cakes/WebContent/images/imageAnnonces/";
			System.out.println(imageFile.getAbsolutePath());
			String avatarNam = "karkachCacks"+CopyFile.getIdFile()+imageFileFileName.substring(imageFileFileName.length()-4);
			CopyFile.copy(imageFile, path+avatarNam);
			return "images/imageAnnonces/"+avatarNam;
	      }catch(Exception e){
	         return "images/annonces_icone.png";
	      }
	}
	
	public String addAnnonce(){
		Utilisateur u = (Utilisateur)session.get("user");
		if (u != null) {
			annonce.setUtilisateur(u);
			annonce.setVille(u.getVille());
		}
		annonce.setImage(loadImage());
		aBusiness.add(annonce);
		System.out.println(annonce);
		return ActionSupport.SUCCESS;
	}
	
	public String listAnnonceOfUser(){
		System.out.println("Profile Open");
		Utilisateur u = (Utilisateur)session.get("user");
		if (u != null) {
			System.out.println(annonces.size());
			annonces = aBusiness.getsOfUser(u.getId());
			return ActionSupport.SUCCESS;
		}
		return ActionSupport.ERROR;
	}
}
