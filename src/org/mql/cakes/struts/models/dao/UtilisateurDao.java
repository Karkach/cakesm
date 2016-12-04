package org.mql.cakes.struts.models.dao;

import java.util.List;

import org.mql.cakes.struts.models.Utilisateur;

public interface UtilisateurDao {
	public int insert(Utilisateur user);
	public Utilisateur delete(Utilisateur u);
	public Utilisateur select(int id);
	public int update(Utilisateur user);
	public Utilisateur selectByMail(String mail);
	public List<Utilisateur> selectAll();
}
