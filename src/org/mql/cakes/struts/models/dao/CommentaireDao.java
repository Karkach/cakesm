package org.mql.cakes.struts.models.dao;

import java.util.List;

import org.mql.cakes.struts.models.Commentaire;


public interface CommentaireDao {
	public int insert(Commentaire commentaire);
	public Commentaire delete(Commentaire c);
	public Commentaire select(int id);
	public int update(Commentaire commentaire);
	public List<Commentaire> selectAll();
}
