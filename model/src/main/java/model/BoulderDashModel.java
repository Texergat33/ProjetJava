package model;

import model.element.mobile.IMobile;
import model.element.mobile.Miner;

public class BoulderDashModel implements IBoulderDashModel{
	private IMobile miner;
	private IMap map;
	public BoulderDashModel(int level, int minerStartX, int minerStartY){
		this.setMap(new Map(level));
		//met en place la route en cr�ant la Map avec en param�tre le num�ro de Map
		this.setMiner(new Miner(minerStartY, minerStartY, this.getMap()));
		//met en place le mineur en le cr�ant avec sa position X et Y de d�part, et r�cup�re la Map
	}

	@Override
	public IMap getMap() {
		return this.map;
	}

	@Override
	public IMobile getMiner() {
		return this.miner;
	}

	private void setMap(IMap map){
		this.map = map;
	}

	private void setMiner(IMobile miner){
		this.miner = miner;
	}
}
