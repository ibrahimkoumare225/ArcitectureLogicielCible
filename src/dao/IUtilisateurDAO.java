package dao;

import models.Utilisateur;

import java.sql.SQLException;
import java.util.List;

public interface IUtilisateurDAO {

   Utilisateur getUser(String identifiant,String motDePasse) throws SQLException;
   Utilisateur addCompte(String identifiant ,String motDePasse);
   Utilisateur updateUser(String identifiant ,String motDePasse);
   void deleteUser(String identifiant ,String motDePasse);
   List <Utilisateur>listerUtilisateur();
}
