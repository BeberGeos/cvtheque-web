package fr.neosoft.cvtheque.view.beans;

import java.io.Serializable;
import java.util.Calendar;
import java.util.List;

/**
 * The persistent class for the experience database table.
 * 
 */
public class ExperienceView implements Serializable {
	private static final long serialVersionUID = 1L;

	private int id;

	private Calendar dateDebut;

	private Calendar dateFin;

	private Calendar dateModification;

	private String detailExperience;

	private int version;

	private List<CompetenceView> competences;

	private ClientView client;

	private List<UtilisateurView> utilisateurs;

	public ExperienceView() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Calendar getDateDebut() {
		return this.dateDebut;
	}

	public void setDateDebut(Calendar dateDebut) {
		this.dateDebut = dateDebut;
	}

	public Calendar getDateFin() {
		return this.dateFin;
	}

	public void setDateFin(Calendar dateFin) {
		this.dateFin = dateFin;
	}

	public Calendar getDateModification() {
		return this.dateModification;
	}

	public void setDateModification(Calendar dateModification) {
		this.dateModification = dateModification;
	}

	public String getDetailExperience() {
		return this.detailExperience;
	}

	public void setDetailExperience(String detailExperience) {
		this.detailExperience = detailExperience;
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

	public ClientView getClient() {
		return this.client;
	}

	public void setClient(ClientView client) {
		this.client = client;
	}

	public List<UtilisateurView> getUtilisateurs() {
		return this.utilisateurs;
	}

	public void setUtilisateurs(List<UtilisateurView> utilisateurs) {
		this.utilisateurs = utilisateurs;
	}

	@Override
	public String toString() {
		return "Experience [id=" + id + ", dateDebut=" + dateDebut
				+ ", dateFin=" + dateFin + ", dateModification="
				+ dateModification + ", detailExperience=" + detailExperience
				+ ", version=" + version + ", competences=" + competences
				+ ", client=" + client + ", utilisateurs=" + utilisateurs + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((client == null) ? 0 : client.hashCode());
		result = prime * result
				+ ((competences == null) ? 0 : competences.hashCode());
		result = prime * result
				+ ((dateDebut == null) ? 0 : dateDebut.hashCode());
		result = prime * result + ((dateFin == null) ? 0 : dateFin.hashCode());
		result = prime
				* result
				+ ((dateModification == null) ? 0 : dateModification.hashCode());
		result = prime
				* result
				+ ((detailExperience == null) ? 0 : detailExperience.hashCode());
		result = prime * result + id;
		result = prime * result
				+ ((utilisateurs == null) ? 0 : utilisateurs.hashCode());
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
		ExperienceView other = (ExperienceView) obj;
		if (client == null) {
			if (other.client != null)
				return false;
		} else if (!client.equals(other.client))
			return false;
		if (competences == null) {
			if (other.competences != null)
				return false;
		} else if (!competences.equals(other.competences))
			return false;
		if (dateDebut == null) {
			if (other.dateDebut != null)
				return false;
		} else if (!dateDebut.equals(other.dateDebut))
			return false;
		if (dateFin == null) {
			if (other.dateFin != null)
				return false;
		} else if (!dateFin.equals(other.dateFin))
			return false;
		if (dateModification == null) {
			if (other.dateModification != null)
				return false;
		} else if (!dateModification.equals(other.dateModification))
			return false;
		if (detailExperience == null) {
			if (other.detailExperience != null)
				return false;
		} else if (!detailExperience.equals(other.detailExperience))
			return false;
		if (id != other.id)
			return false;
		if (utilisateurs == null) {
			if (other.utilisateurs != null)
				return false;
		} else if (!utilisateurs.equals(other.utilisateurs))
			return false;
		if (version != other.version)
			return false;
		return true;
	}

}