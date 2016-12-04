package org.mql.cakes.struts.business;

import java.util.List;

import org.mql.cakes.struts.models.Annonce;

public interface AnnonceBusiness {
	public int add(Annonce annonce);
	public void remove(Annonce annonce);
	public Annonce get(int id);
	public List<Annonce> getsOfUser(int idUser);
	public void set(Annonce user);
	public List<Annonce> getAll();
	public List<Annonce> getAll(String ...patterns);
}
