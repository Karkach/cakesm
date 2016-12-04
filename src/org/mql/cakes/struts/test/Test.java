package org.mql.cakes.struts.test;

import org.mql.cakes.struts.models.Annonce;
import org.mql.cakes.struts.models.Commentaire;
import org.mql.cakes.struts.models.Utilisateur;
import org.mql.cakes.struts.models.dao.AnnonceDaoHB;
import org.mql.cakes.struts.models.dao.CommentaireDaoHB;
import org.mql.cakes.struts.models.dao.UtilisateurDaoHB;

public class Test {
	
	public static void main(String[] args) {
		
		UtilisateurDaoHB daoU = new UtilisateurDaoHB();
		AnnonceDaoHB daoA = new AnnonceDaoHB();
		CommentaireDaoHB daoC = new CommentaireDaoHB();
		
		Utilisateur u = daoU.select(5);
		Annonce a = new Annonce("titre titre titre ", "texttexttexttexttexttext", "type", "ville", 32, "image");
		a.setUtilisateur(u);
		Commentaire c = new Commentaire("Commentaire", u, a);
		Commentaire c2 = new Commentaire("Commentaire", u, a);
		//u.setId(0);
		//daoU.insert(u);
		//daoU.delete(5);
		
	}

}
