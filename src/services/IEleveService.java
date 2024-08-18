package services;

import models.Eleve;

import java.sql.SQLException;
import java.util.List;

public interface IEleveService {

    Eleve save(Eleve eleve) throws SQLException;
    Eleve update(Eleve eleve);
    void delete(int id);
    List<Eleve> getAll();
    Eleve getOne(int id);
}
