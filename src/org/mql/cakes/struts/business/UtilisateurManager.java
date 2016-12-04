package org.mql.cakes.struts.business;

import java.util.List;

import org.mql.cakes.struts.models.Utilisateur;
import org.mql.cakes.struts.models.dao.UtilisateurDao;

public class UtilisateurManager implements UtilisateurBusiness{
	
	private UtilisateurDao uDao;
	
	public UtilisateurManager() {
		
	}

	public UtilisateurManager(UtilisateurDao uDao) {
		super();
		this.uDao = uDao;
	}

	public UtilisateurDao getuDao() {
		return uDao;
	}

	public void setuDao(UtilisateurDao uDao) {
		this.uDao = uDao;
	}
	
	public int add(Utilisateur user) {
		return uDao.insert(user);
	}

	public void remove(Utilisateur user) {
		remove(user);
	}

	public Utilisateur get(int id) {
		return uDao.select(id);
	}


	public void set(Utilisateur user) {
		uDao.update(user);
	}

	public Utilisateur connextion(String mail, String password) {
		Utilisateur u = uDao.selectByMail(mail);
		if (u != null) {
			if (password.equals(u.getMotDePasse())) {
				return u;
			}
		}
		return null;
	}

	public List<Utilisateur> getAll() {
		return uDao.selectAll();
	}
	
	
	
}
