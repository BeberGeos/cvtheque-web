package fr.neosoft.cvtheque.view.beans;

import java.io.Serializable;
import java.util.Calendar;
import java.util.List;

import javax.faces.bean.ManagedBean;

/**
 * The persistent class for the adresse database table.
 * 
 */
@ManagedBean
public class AdresseView implements Serializable {
	private static final long serialVersionUID = 1L;

	private int id;

	private int codePostal;

	private Calendar dateModification;

	private String rue;

	private int version;

	private String ville;

	private List<ClientView> clients;

	private List<UtilisateurView> utilisateurs;

	public AdresseView() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCodePostal() {
		return this.codePostal;
	}

	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}

	public Calendar getDateModification() {
		return this.dateModification;
	}

	public void setDateModification(Calendar dateModification) {
		this.dateModification = dateModification;
	}

	public String getRue() {
		return this.rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	public int getVersion() {
		return this.version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public String getVille() {
		return this.ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public List<ClientView> getClients() {
		return this.clients;
	}

	public void setClients(List<ClientView> clients) {
		this.clients = clients;
	}

	public List<UtilisateurView> getUtilisateurs() {
		return utilisateurs;
	}

	public void setUtilisateurs(List<UtilisateurView> utilisateurs) {
		this.utilisateurs = utilisateurs;
	}

	@Override
	public String toString() {
		return "Adresse [id=" + id + ", codePostal=" + codePostal
				+ ", dateModification=" + dateModification + ", rue=" + rue
				+ ", version=" + version + ", ville=" + ville + ", clients="
				+ clients + ", utilisateurs=" + utilisateurs + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((clients == null) ? 0 : clients.hashCode());
		result = prime * result + codePostal;
		result = prime
				* result
				+ ((dateModification == null) ? 0 : dateModification.hashCode());
		result = prime * result + id;
		result = prime * result + ((rue == null) ? 0 : rue.hashCode());
		result = prime * result
				+ ((utilisateurs == null) ? 0 : utilisateurs.hashCode());
		result = prime * result + version;
		result = prime * result + ((ville == null) ? 0 : ville.hashCode());
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
		AdresseView other = (AdresseView) obj;
		if (clients == null) {
			if (other.clients != null)
				return false;
		} else if (!clients.equals(other.clients))
			return false;
		if (codePostal != other.codePostal)
			return false;
		if (dateModification == null) {
			if (other.dateModification != null)
				return false;
		} else if (!dateModification.equals(other.dateModification))
			return false;
		if (id != other.id)
			return false;
		if (rue == null) {
			if (other.rue != null)
				return false;
		} else if (!rue.equals(other.rue))
			return false;
		if (utilisateurs == null) {
			if (other.utilisateurs != null)
				return false;
		} else if (!utilisateurs.equals(other.utilisateurs))
			return false;
		if (version != other.version)
			return false;
		if (ville == null) {
			if (other.ville != null)
				return false;
		} else if (!ville.equals(other.ville))
			return false;
		return true;
	}
}