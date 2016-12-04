package org.mql.cakes.struts.models.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.mql.cakes.struts.models.Utilisateur;

public class UtilisateurDaoHB implements UtilisateurDao {
	
	private Session session;
	
	public UtilisateurDaoHB() {
		session = Manager.getSessionFactory().openSession();
	}
	
	public Session getSession() {
		return session;
	}
	
	public void setSession(Session session) {
		this.session = session;
	}

	public int insert(Utilisateur user) {
		try {
			System.out.println(session);
			Transaction tx = session.beginTransaction();
			session.persist(user);
			tx.commit();
			return 1;
		} catch (Exception e) {
			System.out.println("Erreur-- UtilisateurDaoHB.insert"+ e.getMessage());
			return 0;
		}
	}

	public Utilisateur delete(Utilisateur u) {
		try {
			Transaction tx = session.beginTransaction();
			session.delete(u);
		    tx.commit();
		    return u;
		} catch (Exception e) {
			System.out.println("Erreur-- UtilisateurDaoHB.delete"+ e.getMessage());
			return null;
		}
	}

	public Utilisateur select(int id) {
		try {
		Transaction tx = session.beginTransaction();
		Utilisateur instance = (Utilisateur) session.get("org.mql.cakes.struts.models.Utilisateur", id);
		tx.commit();	
		return instance;
		} catch (Exception e) {
			System.out.println("Erreur-- UtilisateurDaoHB.select"+ e.getMessage());
			return null;
		}
	}

	public int update(Utilisateur user) {
		try {
			Transaction tx = session.beginTransaction();
			session.saveOrUpdate(user);
			tx.commit();
			return 1;
		} catch (Exception e) {
			System.out.println("Erreur-- UtilisateurDaoHB.update"+ e.getMessage());
			return 0;
		}
	}

	public Utilisateur selectByMail(String mail) {
		try{
			String hql = "FROM Utilisateur "  + 
	             "WHERE mail = '"+mail+"'";
			Query query = session.createQuery(hql);
			return (Utilisateur) query.list().get(0);
		} catch (Exception e) {
			System.out.println("Erreur-- UtilisateurDaoHB.selectByMail"+ e.getMessage());
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	public List<Utilisateur> selectAll() {
		try{
		String hql = "FROM Utilisateur ";
	    Query query = session.createQuery(hql);
	    return query.list();
		} catch (Exception e) {
			System.out.println("Erreur-- UtilisateurDaoHB.selectAll"+ e.getMessage());
			return null;
		}
	}

	public static void main(String[] args) {
		UtilisateurDaoHB uHb = new UtilisateurDaoHB();
		Utilisateur u = new Utilisateur("nom", "prenom", "telephone", "mail", "motDePasse", "ville");
		//u.getCommentaires().add(new Commentaire("Commantaire ......", u));
		uHb.insert(u);
		
//		CommentaireDaoHB cHb = new CommentaireDaoHB();
//		Commentaire c = new Commentaire("text_2");
//		cHb.insert(c);
//		Utilisateur u = uHb.select(1);
		//u.getAnnonces().add(new Annonce("titre", "text", "type", "ville", 2, "image"));
//		u.getCommentaires().add(c);
//		uHb.insert(u);
	//	System.out.println(uHb.select(1).getCommentaires());
		
	}
	
}
