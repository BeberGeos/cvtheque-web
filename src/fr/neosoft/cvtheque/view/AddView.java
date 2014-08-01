package fr.neosoft.cvtheque.view;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import org.dozer.DozerBeanMapperSingletonWrapper;
import org.dozer.Mapper;

import fr.neosoft.cvtheque.entities.Utilisateur;
import fr.neosoft.cvtheque.services.GererUtilisateurService;
import fr.neosoft.cvtheque.view.beans.UtilisateurView;

@ManagedBean(name="dtAddView")
@ViewScoped
public class AddView implements Serializable{
	
	private static final long serialVersionUID = 3799789277796250748L;

	@ManagedProperty("#{utilisateurView}")
	private UtilisateurView userView;
	
	@ManagedProperty("#{gererUtilisateurService}")
	private GererUtilisateurService gererUtilisateur;
	
	
	public void ajouterUtilisateur(){
		Mapper mapper = DozerBeanMapperSingletonWrapper.getInstance();
        Utilisateur user = (Utilisateur) mapper.map(userView, Utilisateur.class);
        gererUtilisateur.createUser(user);
	}

	public UtilisateurView getUserView() {
		return userView;
	}

	public void setUserView(UtilisateurView userView) {
		this.userView = userView;
	}

	public GererUtilisateurService getGererUtilisateur() {
		return gererUtilisateur;
	}

	public void setGererUtilisateur(GererUtilisateurService gererUtilisateur) {
		this.gererUtilisateur = gererUtilisateur;
	}
}
