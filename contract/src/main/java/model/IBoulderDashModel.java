package model;

import java.sql.SQLException;
import java.util.List;

import model.element.mobile.IMobile;

public interface IBoulderDashModel {
    public void getMap();

    public IMobile getMiner();

    MapDimensions getMapSize(final int id) throws SQLException;

    List<FillingMap> getMapFilled(final int id) throws SQLException;
}
