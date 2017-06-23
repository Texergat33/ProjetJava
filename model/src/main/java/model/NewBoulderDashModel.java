package model;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

import model.dao.DAO;
import model.element.mobile.IMobile;

public class NewBoulderDashModel {
	private IMobile                   miner;
	private IMap                      map;
	private final ArrayList<Observer> observers;

	public List<ElementPositionEntry> getAllPositionsById(final int levelID) throws SQLException {
		return DAO.getAllPositionsByID(levelID);
	}

	public LevelEntry getLevelByName(final String levelName) throws SQLException {
		return DAO.getLevelByID(levelName);
	}

	@Override
	public List<FillingMap> getMapFilled(final int id) {
		try {
			return DAO.getMapFilled(id);
		} catch (final SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public MapDimensions getMapSize(final int id) {
		try {
			return DAO.getMapSize(id);
		} catch (final SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
