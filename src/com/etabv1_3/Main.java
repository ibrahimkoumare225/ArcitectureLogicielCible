package com.etabv1_3;

import models.Eleve;
import models.Professeur;
import models.Utilisateur;


import java.sql.SQLException;
import java.util.Date;
import java.util.Scanner;

public class Main {
    static Eleve eleve = new Eleve();
    static Professeur prof = new Professeur(true,"","","");
    static Utilisateur utili = new Utilisateur();
    public static void main(String[] args) throws SQLException {

        afficherPageConnexion();
        Utilisateur utilisateur = new Utilisateur();
        utilisateur.ajouterUtilisateurDefaut();
        utilisateur.authentification();

    }
    public static void afficherPageConnexion(){
        Date date = new Date();
        System.out.println("               " +
                ""+"******************************************************\n\n" +
                "               "+"       BIENVENU DANS L’APPLICATION ETAB v1.3    \n\n"+"               "+
                "******************************************************\n\n" +"                                      "+
                "C0NNEXION\n\n");
    }
    public static void afficherMenu() throws SQLException {

        Scanner choix = new Scanner(System.in);
        System.out.println("               " +
                ""+"******************************************************\n\n" +
                "               "+"       BIENVENU DANS L’APPLICATION ETAB v1.3     \n\n"+"               "+
                "******************************************************\n\n" +"          "+
                "MENU:\n\n"+"            "+
                "1: Gestion des élève\n" +"            "+
                "2: Gestion des professeurs\n" +"            "+
                "3: Gestion des utilisateurs\n" +"            "+
                "0:Quitter \n"+"Veuillez faire un choix :");
        int reponse = choix.nextInt();
        switch (reponse){
            case 0:
                quitter();
                break;
            case 1:
                eleve.afficherMenuGestionEleves();
                break;
            case 2:
               // prof.afficherMenu();
                break;
            case 3:
                System.out.println("Gestion des utilisateur");
                break;
            default:
                System.out.println("Option non géré");
                break;
        }
    }
    public static void quitter() {
        System.out.println("Au revoir !" );
        System.exit(0);

    }

}