package org.mql.cakes.struts.business;

import java.util.List;

import org.mql.cakes.struts.models.Commentaire;

public interface CommentaireBusiness {
	public int add(Commentaire commentaire);
	public void remove(Commentaire commentaire);
	public Commentaire get(int id);
	public List<Commentaire> getsOfAnnonce(int idAnnonce);
	public void set(Commentaire commentaire);
	public List<Commentaire> getAll();
}
