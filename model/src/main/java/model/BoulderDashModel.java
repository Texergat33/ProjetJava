package model;

import java.sql.SQLException;
import java.util.List;

import model.dao.DAO;
import model.element.mobile.IMobile;

public class BoulderDashModel implements IBoulderDashModel {
    private IMap map;

    /**
     * Instantiates a new boulder dash model.
     *
     * @param level
     *            the level
     */
    public BoulderDashModel(final int level) {
        System.out.println("cc2");
        this.setMap(new Map(level));
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
