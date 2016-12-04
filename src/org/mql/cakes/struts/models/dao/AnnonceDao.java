package org.mql.cakes.struts.models.dao;

import java.util.List;

import org.mql.cakes.struts.models.Annonce;

public interface AnnonceDao {
	public int insert(Annonce annonce);
	public Annonce delete(Annonce a);
	public Annonce select(int id);
	public int update(Annonce annonce);
	public List<Annonce> selectAll();
}
