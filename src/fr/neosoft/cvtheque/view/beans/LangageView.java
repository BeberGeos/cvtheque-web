package fr.neosoft.cvtheque.view.beans;

import java.io.Serializable;
import java.util.Calendar;
import java.util.List;

import javax.faces.bean.ManagedBean;

/**
 * The persistent class for the langage database table.
 * 
 */
@ManagedBean
public class LangageView implements Serializable {
	private static final long serialVersionUID = 1L;

	private int id;

	private Calendar dateModification;

	private String libelle;

	private int version;

	private List<CompetenceView> competences;

	public LangageView() {
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

	public List<CompetenceView> getCompetences() {
		return this.competences;
	}

	public void setCompetences(List<CompetenceView> competences) {
		this.competences = competences;
	}

	@Override
	public String toString() {
		return "Langage [id=" + id + ", dateModification=" + dateModification
				+ ", libelle=" + libelle + ", version=" + version
				+ ", competences=" + competences + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((competences == null) ? 0 : competences.hashCode());
		result = prime
				* result
				+ ((dateModification == null) ? 0 : dateModification.hashCode());
		result = prime * result + id;
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
		LangageView other = (LangageView) obj;
		if (competences == null) {
			if (other.competences != null)
				return false;
		} else if (!competences.equals(other.competences))
			return false;
		if (dateModification == null) {
			if (other.dateModification != null)
				return false;
		} else if (!dateModification.equals(other.dateModification))
			return false;
		if (id != other.id)
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