package models;

import dao.IEleveDAO;
import services.impl.EleveServiceImpl;

import java.sql.SQLException;
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
    EleveServiceImpl eleveSI = new EleveServiceImpl();

     Eleve eleve ;
    public Eleve(int id, String dateNaissance, String ville, String prenom, String nom, String telephone, String classe, String matricule) {
        super(id, dateNaissance, ville, prenom, nom, telephone);
        this.classe = classe;
        this.matricule = matricule;
    }

    public Eleve() {
        this.classe = "";
        this.matricule = "";
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

    public void afficherMenuGestionEleves() throws SQLException {
        int choix;

        do {
            System.out.println("     * * * * * * * * * * * * * * * * * * * * * * * * * * * * \n" +
                    "     GESTION DES ELEVES \n" +
                    "     * * * * * * * * * * * * * * * * * * * * * * * * * * * * \n" +
                    "\n\n" +
                    "  MENU: \n\n" +
                    "    1: Ajouter un élève \n" +
                    "    2: Supprimer un élève \n" +
                    "    3: Modifier les informations de l'élève\n" +
                    "    4: Lister les élèves \n" +
                    "    5: Obtenir le dernier élève ajouté \n" +
                    "    6: Retour \n" +
                    "    0: Quitter\n");

            choix = champ.nextInt();

            switch (choix) {
                case 1:
                    eleveSI.save(eleve);
                    break;
                case 2:
                    System.out.print("Veuillez entrer l'ID de l'élève à supprimer : ");
                  /*  int idASupprimer = scanner.nextInt();
                    scanner.nextLine();
                   supprimer(idASupprimer);
                   */ break;
                case 3:
                   // modifier(null);
                    break;
                case 4:
                  //  obtenirEleves(); // Appeler la méthode obtenirEleves pour lister les élèves
                    break;
                case 5:
                  //  obtenirDernierEleveAjoute();
                    break;
                case 6:
                  //  new MenuPrincipal().afficherMenu(); // Retourner au menu principal
                    break;
                case 0:
                    quitter();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Choix invalide.");
            }
        } while (choix != 0&&choix != 1&&choix != 2&&choix != 3&&choix != 4&&choix != 5&&choix != 6);
    }


}
