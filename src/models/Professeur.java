package models;
import com.etabv1_3.IEducation;
import dao.IProfesseurDAO;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static com.etabv1_3.Main.quitter;


public class Professeur extends Personne {

    private boolean vacant;
    private String matiereEnseigne;
    private String prochainCours;
    private String sujetProchaineReunion;
    private static List<Professeur> professeurs = new ArrayList<>();

    static Scanner champ = new Scanner(System.in);

    public Professeur(int id, String dateNaissance, String ville, String prenom, String nom, String telephone, boolean vacant, String matiereEnseigne, String prochainCours, String sujetProchaineReunion) {
        super(id, dateNaissance, ville, prenom, nom, telephone);
        this.vacant = vacant;
        this.matiereEnseigne = matiereEnseigne;
        this.prochainCours = prochainCours;
        this.sujetProchaineReunion = sujetProchaineReunion;
    }

    public Professeur(boolean vacant, String matiereEnseigne, String prochainCours, String sujetProchaineReunion) {
        this.vacant = vacant;
        this.matiereEnseigne = matiereEnseigne;
        this.prochainCours = prochainCours;
        this.sujetProchaineReunion = sujetProchaineReunion;
    }

    public Professeur(int id, String dateNaissance, String ville, String prenom, String nom, String vacant) {
    }

    public boolean isVacant() {
        return vacant;
    }

    public void setVacant(boolean vacant) {
        this.vacant = vacant;
    }

    public String getMatiereEnseigne() {
        return matiereEnseigne;
    }

    public void setMatiereEnseigne(String matiereEnseigne) {
        this.matiereEnseigne = matiereEnseigne;
    }

    public String getProchainCours() {
        return prochainCours;
    }

    public void setProchainCours(String prochainCours) {
        this.prochainCours = prochainCours;
    }

    public String getSujetProchaineReunion() {
        return sujetProchaineReunion;
    }

    public void setSujetProchaineReunion(String sujetProchaineReunion) {
        this.sujetProchaineReunion = sujetProchaineReunion;
    }



}
