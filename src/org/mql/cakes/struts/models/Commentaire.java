package org.mql.cakes.struts.models;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="commentaire")
public class Commentaire {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="text", length=1000 , nullable=true)
	private String text;
	@Column(name="date")
	private GregorianCalendar date;
	@ManyToOne
	@JoinColumn(name="id_u", referencedColumnName="id")
	private Utilisateur utilisateur;
	@ManyToOne
	@JoinColumn(name="id_a", referencedColumnName="id")
	private Annonce annonce;
	
	public Commentaire() {
		this.date = new GregorianCalendar();
	}
	
	public Commentaire(int id, String text) {
		super();
		this.id = id;
		this.text = text;
		this.date = new GregorianCalendar();
	}

	public Commentaire(String text) {
		this.text = text;
		this.date = new GregorianCalendar();
	}
	
	public Commentaire(String text, Utilisateur u, Annonce a) {
		this.text = text;
		this.utilisateur = u;
		this.annonce = a;
		this.date = new GregorianCalendar();
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Calendar getDate() {
		return date;
	}

	public void setDate(GregorianCalendar date) {
		this.date = date;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	public Annonce getAnnonce() {
		return annonce;
	}

	public void setAnnonce(Annonce annonce) {
		this.annonce = annonce;
	}

	@Override
	public String toString() {
		return "Commentaire [id=" + id + ", text=" + text + ", date=" + date + "]";
	}
 
}
