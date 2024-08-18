package services.impl;

import dao.IEleveDAO;
import dao.IUtilisateurDAO;
import dao.impl.EleveDaoImpl;
import dao.impl.UtilisateurDaoImpl;
import models.Eleve;
import models.Utilisateur;
import services.IEleveService;

import java.sql.SQLException;
import java.util.List;

public class EleveServiceImpl implements IEleveService {
    private IEleveDAO eleveDAO;

    public EleveServiceImpl() {
        this.eleveDAO = new EleveDaoImpl();
    }
    @Override
    public Eleve save(Eleve eleve) throws SQLException {
        Eleve savedEleve = eleveDAO.ajouter();
        if (savedEleve != null) {
            return savedEleve;
        } else {
            return null;
        }
    }


    @Override
    public Eleve update(Eleve eleve) {
        return null;
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public List<Eleve> getAll() {
        return null;
    }

    @Override
    public Eleve getOne(int id) {
        return null;
    }
}
