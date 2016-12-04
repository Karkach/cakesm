package org.mql.cakes.struts.business;

import java.util.List;
import java.util.Vector;

import org.mql.cakes.struts.models.Annonce;
import org.mql.cakes.struts.models.dao.AnnonceDao;

public class AnnonceManager implements AnnonceBusiness{

	private AnnonceDao aDao;
	
	public AnnonceManager() {
		
	}
	
	public AnnonceManager(AnnonceDao aDao) {
		this.aDao = aDao;
	}

	public int add(Annonce annonce) {
		return aDao.insert(annonce);
	}

	public void remove(Annonce annonce) {
		aDao.delete(annonce);
	}

	public Annonce get(int id) {
		return aDao.select(id);
	}

	public List<Annonce> getsOfUser(int idUser) {
		List<Annonce> list = new Vector<>();
		for (Annonce annonce : getAll()) {
			if(annonce.getUtilisateur() != null){
				if (annonce.getUtilisateur().getId() == idUser) {
					list.add(annonce);
				}
			}
		}
		return list;
	}

	public void set(Annonce annonce) {
		aDao.update(annonce);
	}

	public List<Annonce> getAll() {
		return aDao.selectAll();
	}

	public List<Annonce> getAll(String ...patterns) {
		List<Annonce> list = new Vector<>();
		for (Annonce annonce : getAll()) {
			if (annonce.toString().contains(patterns[0]) || annonce.toString().contains(patterns[1]) || annonce.toString().contains(patterns[2])) {
				list.add(annonce);
			}
		}
		return list;
	}

}
