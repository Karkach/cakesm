package org.mql.cakes.struts.business;

import java.util.List;

import org.mql.cakes.struts.models.Utilisateur;

public interface UtilisateurBusiness {
	public int add(Utilisateur user);
	public void remove(Utilisateur user);
	public Utilisateur get(int id);
	public void set(Utilisateur user);
	public Utilisateur connextion(String mail, String password);
	public List<Utilisateur> getAll();
}
