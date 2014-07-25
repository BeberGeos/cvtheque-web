package fr.neosoft.cvtheque.view;

import javax.annotation.PostConstruct;
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
public class AddView {
	@ManagedProperty("#{utilisateurView}")
	private UtilisateurView userView;
	
	@ManagedProperty("#{gererUtilisateurService}")
	private GererUtilisateurService gererUtilisateur;
	
	@PostConstruct
    public void init() {
//		userView = new UtilisateurView();
//        Mapper mapper = DozerBeanMapperSingletonWrapper.getInstance();
//        mapper.map(userView, Utilisateur.class);
    }
	
	public void ajouterUtilisateur(){
		Mapper mapper = DozerBeanMapperSingletonWrapper.getInstance();
        Utilisateur user = (Utilisateur) mapper.map(userView, Utilisateur.class);
        gererUtilisateur.createUser(user);
	}
}
