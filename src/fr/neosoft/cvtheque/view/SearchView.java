package fr.neosoft.cvtheque.view;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import fr.neosoft.cvtheque.dao.UtilisateurDao;
import fr.neosoft.cvtheque.entities.Utilisateur;

@ManagedBean(name="dtSearchView")
@ViewScoped
public class SearchView implements Serializable {
	
	private static final long serialVersionUID = 6084890189853253103L;
	
	private List<Utilisateur> users;
	private Utilisateur selectedUser;

	@ManagedProperty("#{utilisateurDao}")
	private UtilisateurDao userDao;
	
	@PostConstruct
    public void init() {
        users = userDao.findAllUtilisateurs();
    }
	
	public List<Utilisateur> getUsers() {
		return users;
	}

	public void setUsers(List<Utilisateur> users) {
		this.users = users;
	}

	public Utilisateur getSelectedUser() {
		return selectedUser;
	}

	public void setSelectedUser(Utilisateur selectedUser) {
		this.selectedUser = selectedUser;
	}

	public UtilisateurDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UtilisateurDao userDao) {
		this.userDao = userDao;
	}
}
