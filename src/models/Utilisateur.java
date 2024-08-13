package models;


import com.etabv1_3.Main;
import dao.SingletonDataBase;
import services.IUtilisateurService;
import services.impl.UtilisateurServiceImpl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Utilisateur {

    static Scanner champ = new Scanner(System.in);

    public Utilisateur(int id, String pseudo, String motDePass) {
    }

    public Utilisateur() {

    }
    public void ajouterUtilisateurDefaut() {
        try {
            // Vérification si l'utilisateur "admin" existe déjà
            String checkQuery = "SELECT COUNT(*) FROM Utilisateur WHERE pseudo = ? AND motDePasse = ?";
            PreparedStatement checkStatement = SingletonDataBase.getInstance().prepareStatement(checkQuery);
            checkStatement.setString(1, "admin");
            checkStatement.setString(2, "admin");
            ResultSet resultSet = checkStatement.executeQuery();

            // Si l'utilisateur n'existe pas, on procède à l'insertion
            if (((ResultSet) resultSet).next() && resultSet.getInt(1) == 0) {
                String insertQuery = "INSERT INTO Utilisateur (pseudo, motDePasse, dateCreation, id) VALUES (?, ?, CURDATE(), 1)";
                PreparedStatement insertStatement = SingletonDataBase.getInstance().prepareStatement(insertQuery);
                insertStatement.setString(1, "admin");
                insertStatement.setString(2, "admin");
                insertStatement.executeUpdate();
            } else {
                System.out.println("L'utilisateur 'admin' existe déjà.");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    static public void authentification() throws SQLException {
        boolean auth ;
        System.out.println("Identifiant :");
        String username = champ.nextLine();
        System.out.println("Mot de passe :");
        String motDePasse = champ.nextLine();
        IUtilisateurService utilisateurService = new UtilisateurServiceImpl();
        auth = utilisateurService.authentification(username, motDePasse);
        if (auth){
            Main.afficherMenu(); //
        }
        else{
            System.out.println("Identifiant incorecte");
            System.out.println("Voulez-vous ressayer (O/N)");
            String rep = champ.nextLine();
            if(rep.equalsIgnoreCase("oui")){
                ressayer();
            }else if(rep.equalsIgnoreCase("non")){
                System.exit(0);
            }else{
                System.out.println("Option non géré");
            }

        }

    }
    static public void ressayer() throws SQLException {
        authentification();
    }

}
