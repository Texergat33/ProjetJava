package model;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

import model.dao.DAO;
import model.element.mobile.IMobile;
import model.element.mobile.Miner;

public class BoulderDashModel extends Observable implements IBoulderDashModel {

	private IMobile miner;
	private IMap map;
	private final ArrayList<Observer> observers;

	public BoulderDashModel(final int level, final int minerStartX, final int minerStartY) {
		this.observers = new ArrayList<Observer>();
		this.setMap(new Map(level));
		// met en place la route en créant la Map avec en paramètre le numéro
		// de
		// Map
		this.setMiner(new Miner(minerStartY, minerStartY, this.getMap()));
		// met en place le mineur en le créant avec sa position X et Y de
		// départ, et récupère la Map
	}

	@Override
	public void addObserver(final Observer observer) {
		this.observers.add(observer);

	}

	@Override
	public void deleteObserver(final Observer observer) {
		this.observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for (final Observer observer : this.observers) {
			observer.notify();
		}

	}

	@Override
	public IMobile getMiner() {
		return this.miner;
	}

	@Override
	public IMap getMap() {
		return this.map;
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

	private void setMap(final IMap map) {
		this.map = map;
	}

	private void setMiner(final IMobile miner) {
		this.miner = miner;
	}

}
