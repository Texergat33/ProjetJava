package model;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

import model.dao.NewDAO;
import model.element.mobile.IMobile;
import model.element.mobile.Miner;

public class BoulderDashModel extends Observable implements IBoulderDashModel {
	private IMobile miner; //vÈrifier utilitÈ
	private IMap map; //vÈrifier utilitÈ
	private ArrayList<Observer> observers;

	public BoulderDashModel(final int level, final int minerStartX, final int minerStartY) {
		this.observers = new ArrayList<Observer>();
		this.setMap(new Map(level));
		// met en place la route en cr√©ant la Map avec en param√®tre le num√©ro
		// de
		// Map
		this.setMiner(new Miner(minerStartY, minerStartY, this.getMap()));
		// met en place le mineur en le cr√©ant avec sa position X et Y de
		// d√©part, et r√©cup√®re la Map
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
