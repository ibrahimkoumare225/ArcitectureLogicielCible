package services;

import models.Utilisateur;

import java.sql.SQLException;
import java.util.List;

public interface IUtilisateurService {
    boolean authentification(String identifiant,String motDePasse) throws SQLException;
    Utilisateur ajouterCompte(String identifiant ,String motDePasse);
   Utilisateur modifierMotDePasse(String identifiant ,String motDePasse);
    boolean supprimerCompte(String identifiant ,String motDePasse);
    List <Utilisateur>listerUtilisateur();
}
