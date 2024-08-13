package models;

import dao.IEleveDAO;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static com.etabv1_3.Main.afficherMenu;
import static com.etabv1_3.Main.quitter;

public class Eleve extends Personne {
    static Scanner champ = new Scanner(System.in);
    private static List<Eleve> eleves = new ArrayList<>();
    private static Instant debutSession = Instant.now();
    private String classe;
    private String matricule;

    public Eleve(int id, String dateNaissance, String ville, String prenom, String nom, String telephone, String classe, String matricule) {
        super(id, dateNaissance, ville, prenom, nom, telephone);
        this.classe = classe;
        this.matricule = matricule;
    }

    public Eleve(String classe, String matricule) {
        this.classe = classe;
        this.matricule = matricule;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public void afficherMenuGestionEleves(){}

}
