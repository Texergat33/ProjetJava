package model;

import java.util.ArrayList;
import java.util.Observable;

import model.element.IElement;
import model.element.mobile.IMobile;

public interface IMap {
    public int getHeight();

    public Observable getObservable();

    public IElement getOnTheMapXY(int x, int y);

    public int getWidth();

    public void setMobileHasChanged();

    public IMobile getMobileXY(int x, int y);

    public int getDiamondCounter();

    public void setDiamondCounter(final int diamondCounter);

    public IMobile getMiner();

    public ArrayList<IMobile> getMobiles();

}
