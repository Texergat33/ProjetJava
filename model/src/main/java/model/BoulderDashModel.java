package model;

public class BoulderDashModel implements IBoulderDashModel{
	private IMobile miner;
	private IMap map;
	public BoulderDashModel(int level, int minerStartX, int minerStartY){

		//met en place la route en créant la Map avec en paramètre le numéro de Map

		//met en place le mineur en le créant avec sa position X et Y de départ, et récupère la Map
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
