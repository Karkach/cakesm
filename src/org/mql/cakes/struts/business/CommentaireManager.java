package org.mql.cakes.struts.business;

import java.util.List;
import java.util.Vector;

import org.mql.cakes.struts.models.Commentaire;
import org.mql.cakes.struts.models.dao.CommentaireDao;

public class CommentaireManager implements CommentaireBusiness{
	
	private CommentaireDao cDao;
	
	public CommentaireManager() {
		
	}
	
	public CommentaireManager(CommentaireDao cDao) {
		super();
		this.cDao = cDao;
	}

	public CommentaireDao getcDao() {
		return cDao;
	}

	public void setcDao(CommentaireDao cDao) {
		this.cDao = cDao;
	}

	public int add(Commentaire commentaire) {
		return cDao.insert(commentaire);
	}

	public void remove(Commentaire commentaire) {
		cDao.delete(commentaire);
	}

	public Commentaire get(int id) {
		return cDao.select(id);
	}

	public List<Commentaire> getsOfAnnonce(int idAnnonce) {
		Vector<Commentaire> commentaires = new Vector<>();
		List<Commentaire> list = cDao.selectAll();
		for (Commentaire c : list) {
			if (c.getAnnonce().getId() == idAnnonce) {
				commentaires.add(c);
			}
		}
		return commentaires;
	}

	public void set(Commentaire commentaire) {
		cDao.update(commentaire);
	}

	public List<Commentaire> getAll() {
		return cDao.selectAll();
	}

}
