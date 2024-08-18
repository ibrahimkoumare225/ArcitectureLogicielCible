package dao;

import models.Eleve;

import java.sql.SQLException;
import java.util.List;

public interface IEleveDAO {
   Eleve ajouter() throws SQLException;
   Eleve modifier(Eleve eleve);
    void supprimer(int id);
    List <Eleve>obtenirEleves();
    Eleve obtenir(int id);
}
