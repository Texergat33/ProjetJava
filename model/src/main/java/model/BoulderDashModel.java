package model;

import java.sql.SQLException;
import java.util.List;

import model.dao.DAO;

public class BoulderDashModel implements IBoulderDashModel, IModel {
    private IMobile miner;
    private IMap    map;

    public BoulderDashModel(final int level, final int minerStartX, final int minerStartY) {

    }

    @Override
    public void getMap() {
        // TODO Auto-generated method stub

    }

    @Override
    public IMobile getMiner() {
        // TODO Auto-generated method stub
        return null;
    }

    private void setMap(final IMap map) {

    }

    private void setMiner(final IMobile miner) {

    }

    @Override
    public MapDimensions getMapSize(final int id) throws SQLException {
        return DAO.getMapSize(id);

    }

    @Override
    public List<FillingMap> getMapFilled(final int id) throws SQLException {
        return DAO.getMapFilled(id);

    }
}
