package org.mql.cakes.struts.models;

import java.util.GregorianCalendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="utilisateur")
public class Utilisateur {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="nom", length=40, nullable=true)
	private String nom;
	@Column(name="prenom", length=40, nullable=true)
	private String prenom;
	@Column(name="telephone", length=30)
	private String telephone;
	@Column(name="mail", length=30, nullable=true)
	private String mail;
	@Column(name="motDePasse", length=40, nullable=true)
	private String motDePasse;
	@Column(name="ville", length=15)
	private String ville;
	@Column(name="photo", length=50)
	private String photo;
	@Column(name="date")
	private GregorianCalendar date;
	
	public void init(){
		this.date = new GregorianCalendar();
	}
	
	public Utilisateur() {
		init();
	}

	public Utilisateur(String nom, String prenom, String telephone, String mail, String motDePasse, String ville) {
		init();
		this.nom = nom;
		this.prenom = prenom;
		this.telephone = telephone;
		this.mail = mail;
		this.motDePasse = motDePasse;
		this.ville = ville;
	}

	public Utilisateur(int id, String nom, String prenom, String telephone, String mail, String motDePasse, String ville) {
		init();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.telephone = telephone;
		this.mail = mail;
		this.motDePasse = motDePasse;
		this.ville = ville;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getMotDePasse() {
		return motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	public String getVille() {
		return ville;
	}
	
	public void setVille(String ville) {
		this.ville = ville;
	}
	
	public GregorianCalendar getDate() {
		return date;
	}

	public void setDate(GregorianCalendar date) {
		this.date = date;
	}
	
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	
	public String getPhoto() {
		return photo;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", telephone=" + telephone + ", mail=" + mail
				+ ", motDePasse=" + motDePasse + ", ville=" + ville + ", date=" + date.get(GregorianCalendar.YEAR)
				+ ", photo=" + photo+ "]";
	}

}
