package model;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

import model.element.mobile.IMobile;

public class BoulderDashModel extends Observable implements IBoulderDashModel {
    private IMobile                   miner;
    private IMap                      map;
    private final ArrayList<Observer> observers;

    public BoulderDashModel(final int level, final int minerStartX, final int minerStartY) {
        this.observers = new ArrayList<Observer>();
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
            observer.perform();
        }

    }

    @Override
    public void getMap() {
        // TODO Auto-generated method stub

    }

    @Override
    public IMobile getMiner() {
        // TODO Auto-generated method stub
        return null;
    }

    private void setMap(final IMap map) {

    }

    private void setMiner(final IMobile miner) {

    }

}
