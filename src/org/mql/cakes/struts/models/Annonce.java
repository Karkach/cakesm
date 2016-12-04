package org.mql.cakes.struts.models;

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
@Table(name="annonce")
public class Annonce {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="titre", length=40, nullable=true)
	private String titre;
	@Column(name="text", length=1000, nullable=true)
	private String text;
	@Column(name="type", length=30, nullable=true)
	private String type;
	@Column(name="ville", length=30, nullable=true)
	private String ville;
	@Column(name="votes")
	private int votes;
	@Column(name="date")
	private GregorianCalendar date;
	@Column(name="image")
	private String image;
	@ManyToOne
	@JoinColumn(name="id_u", referencedColumnName="id")
	private Utilisateur utilisateur;
	
	public Annonce() {
		this.date = new GregorianCalendar();
	}

	public Annonce(int id, String titre, String text, String type, String ville, int votes, String image) {
		this.id = id;
		this.titre = titre;
		this.text = text;
		this.type = type;
		this.ville = ville;
		this.votes = votes;
		this.image = image;
		this.date = new GregorianCalendar();
	}

	public Annonce(String titre, String text, String type, String ville, int votes, String image) {
		this.titre = titre;
		this.text = text;
		this.type = type;
		this.ville = ville;
		this.votes = votes;
		this.image = image;
		this.date = new GregorianCalendar();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public int getVotes() {
		return votes;
	}

	public void setVotes(int votes) {
		this.votes = votes;
	}

	public GregorianCalendar getDate() {
		return date;
	}

	public void setDate(GregorianCalendar date) {
		this.date = date;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
	
	public Utilisateur getUtilisateur() {
		return utilisateur;
	}
	
	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}
	
	@Override
	public String toString() {
		return "Annonce [id=" + id + ", titre=" + titre + ", text=" + text + ", type=" + type + ", ville=" + ville
				+ ", votes=" + votes + ", date=" + date.get(GregorianCalendar.YEAR) + ", image=" + image + "]";
	}

}
