package model;

import model.element.mobile.Miner;

public class BoulderDashModel implements IBoulderDashModel {
    private IMobile miner;
    private IMap    map;

    public BoulderDashModel(final int level, final int minerStartX, final int minerStartY) {
        this.setMap(new Map(level));
        // met en place la route en créant la Map avec en paramètre le numéro de
        // Map
        this.setMiner(new Miner(minerStartY, minerStartY, this.getMap()));
        // met en place le mineur en le créant avec sa position X et Y de
        // départ, et récupère la Map
    }

    @Override
    public IMap getMap() {
        return this.map;
    }

    @Override
    public IMobile getMiner() {
        return this.miner;
    }

    private void setMap(final IMap map) {
        this.map = map;
    }

    private void setMiner(final IMobile miner) {
        this.miner = miner;
    }
}
