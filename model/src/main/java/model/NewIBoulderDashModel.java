package model;

import java.sql.SQLException;
import java.util.List;

import model.element.mobile.IMobile;

public interface NewIBoulderDashModel {
	public List<FillingMap> getAllPositionsById(final int levelID) throws SQLException;

	public GamingMap getLevelByID(int levelID) throws SQLException;

	public IMap getMap();

	public IMobile getMiner();
}
