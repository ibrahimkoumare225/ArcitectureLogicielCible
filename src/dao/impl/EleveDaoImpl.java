package dao.impl;

import dao.IEleveDAO;
import dao.SingletonDataBase;
import models.Eleve;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class EleveDaoImpl implements IEleveDAO {

    @Override
    public Eleve ajouter() throws SQLException {
        Eleve eleve = new Eleve();
        // Assurez-vous que la requête SQL est correcte
        String insertQuery = "INSERT INTO eleve (nom, prenom, dateNaissance, classe, matricule, ville, telephone) VALUES (?, ?, ?, ?, ?, ?, ?)";

        // Préparez la déclaration SQL
        PreparedStatement insertStatement = SingletonDataBase.getInstance().prepareStatement(insertQuery);

        // Remplissez les champs avec les valeurs de l'objet 'eleve'
        insertStatement.setString(1, eleve.getNom());
        insertStatement.setString(2, eleve.getPrenom());
        insertStatement.setString(3, eleve.getDateNaissance());
        insertStatement.setString(4, eleve.getClasse());
        insertStatement.setString(5, eleve.getMatricule());
        insertStatement.setString(6, eleve.getVille());
        insertStatement.setString(7, eleve.getTelephone());

        // Exécutez la mise à jour
        int rowsAffected = insertStatement.executeUpdate();

        // Vérifiez si l'insertion a réussi et renvoyez l'objet Eleve
        if (rowsAffected > 0) {
            return eleve;
        } else {
            // Si aucune ligne n'a été affectée, retournez null ou gérez l'exception selon vos besoins
            return null;
        }
    }


    @Override
    public Eleve modifier(Eleve eleve) {
        return null;
    }

    @Override
    public void supprimer(int id) {

    }

    @Override
    public List<Eleve> obtenirEleves() {
        return null;
    }

    @Override
    public Eleve obtenir(int id) {
        return null;
    }
}
