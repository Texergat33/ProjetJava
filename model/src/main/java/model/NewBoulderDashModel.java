package model;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

import model.dao.NewDAO;
import model.element.mobile.IMobile;

public class NewBoulderDashModel implements NewIBoulderDashModel {
	private IMobile miner; //vérifier utilité
	private IMap map; //vérifier utilité
	private ArrayList<Observer> observers;

	public void addObserver(final Observer observer) {
		this.observers.add(observer);
	}

	public void deleteObserver(final Observer observer) {
		this.observers.remove(observer);
	}

	@Override
	public List<FillingMap> getAllPositionsById(final int levelID) throws SQLException {
		return NewDAO.getMapFilledByID(levelID);
	}

	@Override
	public GamingMap getLevelByID(int levelID) throws SQLException {
		return NewDAO.getLevelByID(levelID);
	}

	@Override
	public IMap getMap() {
		return this.map;
	}

	@Override
	public IMobile getMiner() {
		return this.miner;
	}

	public void setMap(IMap map) {
		this.map = map;
	}

	public void setMiner(IMobile miner) {
		this.miner = miner;
	}
}
