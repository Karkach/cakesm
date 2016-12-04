package org.mql.cakes.struts.models.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.mql.cakes.struts.models.Annonce;

public class AnnonceDaoHB implements AnnonceDao{

	private Session session;
	
	public AnnonceDaoHB() {
		session = Manager.getSessionFactory().openSession();
	}
	
	public Session getSession() {
		return session;
	}
	
	public void setSession(Session session) {
		this.session = session;
	}
	
	public int insert(Annonce annonce) {
		try {
			Transaction tx = session.beginTransaction();
			session.persist(annonce);
			tx.commit();
			return 1;
		} catch (Exception e) {
			System.out.println("Erreur-- AnnonceDaoHB.insert"+ e.getMessage());
			e.printStackTrace();
			return 0;
		}
	}

	public Annonce delete(Annonce a) {
		try {
			Transaction tx = session.beginTransaction();
			session.delete(a);
		    tx.commit();
		    return a;
		} catch (Exception e) {
			System.out.println("Erreur-- AnnonceDaoHB.delete"+ e.getMessage());
			return null;
		}
			
	}

	public Annonce select(int id) {
		try {
			Transaction tx = session.beginTransaction();
			Annonce instance = (Annonce) session.get("org.mql.cakes.struts.models.Annonce", id);
			tx.commit();	
		return instance;
		} catch (Exception e) {
			System.out.println("Erreur-- AnnonceDaoHB.select"+ e.getMessage());
			return null;
		}
	}

	public int update(Annonce annonce) {
		try {
			Transaction tx = session.beginTransaction();
			session.saveOrUpdate(annonce);
			tx.commit();
			return 1;
		} catch (Exception e) {
			System.out.println("Erreur-- AnnonceDaoHB.update"+ e.getMessage());
			return 0;
		}
		
	}

	@SuppressWarnings("unchecked")
	public List<Annonce> selectAll() {
		try{
			String hql = "FROM Annonce ";
		    Query query = session.createQuery(hql);
		    return query.list();
		} catch (Exception e) {
			System.out.println("Erreur-- AnnonceDaoHB.selectAll"+ e.getMessage());
			return null;
		}
	}
}
