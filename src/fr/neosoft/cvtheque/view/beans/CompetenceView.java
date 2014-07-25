package fr.neosoft.cvtheque.view.beans;

import java.io.Serializable;
import java.util.Calendar;
import java.util.List;

/**
 * The persistent class for the competence database table.
 * 
 */
public class CompetenceView implements Serializable {
	private static final long serialVersionUID = 1L;

	private int id;

	private Calendar dateModification;

	private String libelle;

	private int version;

	private CategorieView categorie;

	private LangageView langage;

	private List<ExperienceView> experiences;

	public CompetenceView() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Calendar getDateModification() {
		return this.dateModification;
	}

	public void setDateModification(Calendar dateModification) {
		this.dateModification = dateModification;
	}

	public String getLibelle() {
		return this.libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public int getVersion() {
		return this.version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public CategorieView getCategorie() {
		return this.categorie;
	}

	public void setCategorie(CategorieView categorie) {
		this.categorie = categorie;
	}

	public LangageView getLangage() {
		return this.langage;
	}

	public void setLangage(LangageView langage) {
		this.langage = langage;
	}

	public List<ExperienceView> getExperiences() {
		return this.experiences;
	}

	public void setExperiences(List<ExperienceView> experiences) {
		this.experiences = experiences;
	}

	@Override
	public String toString() {
		return "Competence [id=" + id + ", dateModification="
				+ dateModification + ", libelle=" + libelle + ", version="
				+ version + ", categorie=" + categorie + ", langage=" + langage
				+ ", experiences=" + experiences + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((categorie == null) ? 0 : categorie.hashCode());
		result = prime
				* result
				+ ((dateModification == null) ? 0 : dateModification.hashCode());
		result = prime * result
				+ ((experiences == null) ? 0 : experiences.hashCode());
		result = prime * result + id;
		result = prime * result + ((langage == null) ? 0 : langage.hashCode());
		result = prime * result + ((libelle == null) ? 0 : libelle.hashCode());
		result = prime * result + version;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CompetenceView other = (CompetenceView) obj;
		if (categorie == null) {
			if (other.categorie != null)
				return false;
		} else if (!categorie.equals(other.categorie))
			return false;
		if (dateModification == null) {
			if (other.dateModification != null)
				return false;
		} else if (!dateModification.equals(other.dateModification))
			return false;
		if (experiences == null) {
			if (other.experiences != null)
				return false;
		} else if (!experiences.equals(other.experiences))
			return false;
		if (id != other.id)
			return false;
		if (langage == null) {
			if (other.langage != null)
				return false;
		} else if (!langage.equals(other.langage))
			return false;
		if (libelle == null) {
			if (other.libelle != null)
				return false;
		} else if (!libelle.equals(other.libelle))
			return false;
		if (version != other.version)
			return false;
		return true;
	}
	
}