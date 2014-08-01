package fr.neosoft.cvtheque.view.beans;

import java.io.Serializable;
import java.util.Calendar;
import java.util.List;

import javax.faces.bean.ManagedBean;

/**
 * The persistent class for the client database table.
 * 
 */
@ManagedBean
public class ClientView implements Serializable {
	private static final long serialVersionUID = 1L;

	private int id;

	private Calendar dateModification;

	private String nom;

	private Long siret;

	private int version;

	private AdresseView adresse;

	private List<ExperienceView> experiences;

	public ClientView() {
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

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Long getSiret() {
		return this.siret;
	}

	public void setSiret(Long siret) {
		this.siret = siret;
	}

	public int getVersion() {
		return this.version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public AdresseView getAdresse() {
		return this.adresse;
	}

	public void setAdresse(AdresseView adresse) {
		this.adresse = adresse;
	}

	public List<ExperienceView> getExperiences() {
		return this.experiences;
	}

	public void setExperiences(List<ExperienceView> experiences) {
		this.experiences = experiences;
	}

	@Override
	public String toString() {
		return "Client [id=" + id + ", dateModification=" + dateModification
				+ ", nom=" + nom + ", siret=" + siret + ", version=" + version
				+ ", adresse=" + adresse + ", experiences=" + experiences + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((adresse == null) ? 0 : adresse.hashCode());
		result = prime
				* result
				+ ((dateModification == null) ? 0 : dateModification.hashCode());
		result = prime * result
				+ ((experiences == null) ? 0 : experiences.hashCode());
		result = prime * result + id;
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		result = prime * result + ((siret == null) ? 0 : siret.hashCode());
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
		ClientView other = (ClientView) obj;
		if (adresse == null) {
			if (other.adresse != null)
				return false;
		} else if (!adresse.equals(other.adresse))
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
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		if (siret == null) {
			if (other.siret != null)
				return false;
		} else if (!siret.equals(other.siret))
			return false;
		if (version != other.version)
			return false;
		return true;
	}

	
}