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
	private IMobile miner; //v�rifier utilit�
	private IMap map; //v�rifier utilit�
	private ArrayList<Observer> observers;

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
	public List<FillingMap> getAllPositionsById(final int levelID) throws SQLException {
		return DAO.getMapFilledByID(levelID);
	}

	@Override
	public GamingMap getLevelByID(int levelID) throws SQLException {
		return DAO.getLevelByID(levelID);
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

	private void setMap(final IMap map) {
		this.map = map;
	}

	public void setMiner(IMobile miner) {
		this.miner = miner;
	}
}
