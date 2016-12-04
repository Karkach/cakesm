package org.mql.cakes.struts.models.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.mql.cakes.struts.models.Commentaire;

public class CommentaireDaoHB implements CommentaireDao {

	private Session session;
	
	public CommentaireDaoHB() {
		session = Manager.getSessionFactory().openSession();
	}
	
	public Session getSession() {
		return session;
	}
	
	public void setSession(Session session) {
		this.session = session;
	}

	
	public int insert(Commentaire commentaire) {
		try {
			Transaction tx = session.beginTransaction();
			session.persist(commentaire);
			tx.commit();
			return 1;
		} catch (Exception e) {
			System.out.println("Erreur-- CommentaireDaoHB.insert"+ e.getMessage());
			return 0;
		}
	}

	public Commentaire delete(Commentaire c) {
		try {
			Transaction tx = session.beginTransaction();
			session.delete(c);
			tx.commit();
			return c;
		} catch (Exception e) {
			System.out.println("Erreur-- CommentaireDaoHB.delete"+ e.getMessage());
			return null;
		}
	}

	public Commentaire select(int id) {
		try{
			Transaction tx = session.beginTransaction();
			Commentaire instance = (Commentaire) session.get("org.mql.cakes.struts.models.Commentaire", id);
			tx.commit();	
			return instance;
		} catch (Exception e) {
			System.out.println("Erreur-- CommentaireDaoHB.select"+ e.getMessage());
			return null;
		}
	}
	
	public int update(Commentaire commentaire) {
		try {
			Transaction tx = session.beginTransaction();
			session.saveOrUpdate(commentaire);
			tx.commit();
			return 1;
		} catch (Exception e) {
			System.out.println("Erreur-- CommentaireDaoHB.update"+ e.getMessage());
			return 0;
		}
		
	}
	
	@SuppressWarnings("unchecked")
	public List<Commentaire> selectAll() {
		try{
			String hql = "FROM Commentaire ";
		    Query query = session.createQuery(hql);
		    return query.list();
		} catch (Exception e) {
			System.out.println("Erreur-- CommentaireDaoHB.select"+ e.getMessage());
			return null;
		}
	}

}
