package model;

import java.sql.SQLException;
import java.util.List;

import model.dao.DAO;
import model.element.mobile.IMobile;

public class BoulderDashModel implements IBoulderDashModel {
    private IMap map; // v�rifier utilit�

    public BoulderDashModel(final int level) {
        System.out.println("cc2");
        this.setMap(new Map(level));
        // met en place la route en créant la Map avec en paramètre le numéro
        // de
        // Map

        // met en place le mineur en le créant avec sa position X et Y de
        // départ, et récupère la Map
    }

    @Override
    public List<FillingMap> getAllPositionsById(final int levelID) throws SQLException {
        return DAO.getMapFilledByID(levelID);
    }

    @Override
    public GamingMap getLevelByID(final int levelID) throws SQLException {
        return DAO.getLevelByID(levelID);
    }

    @Override
    public IMap getMap() {
        return this.map;
    }

    @Override
    public IMobile getMiner() {
        return this.getMap().getMiner();
    }

    private void setMap(final IMap map) {
        this.map = map;
    }

}
