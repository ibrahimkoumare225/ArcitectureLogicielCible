package services.impl;

import dao.IUtilisateurDAO;
import dao.impl.UtilisateurDaoImpl;
import models.Utilisateur;
import services.IUtilisateurService;

import java.sql.SQLException;
import java.util.List;

public class UtilisateurServiceImpl implements IUtilisateurService {

    private IUtilisateurDAO utilisateurDao;

    public UtilisateurServiceImpl() {
        this.utilisateurDao = new UtilisateurDaoImpl();
    }

    @Override
    public boolean authentification(String identifiant, String motDePasse) throws SQLException {
        Utilisateur user = utilisateurDao.getUser(identifiant,motDePasse);
        return user!=null;
    }

    @Override
    public Utilisateur ajouterCompte(String identifiant, String motDePasse) {
        return null;
    }

    @Override
    public Utilisateur modifierMotDePasse(String identifiant, String motDePasse) {
        return null;
    }

    @Override
    public boolean supprimerCompte(String identifiant, String motDePasse) {
        return false;
    }

    @Override
    public List<Utilisateur> listerUtilisateur() {
        return null;
    }
}
