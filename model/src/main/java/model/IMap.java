package model;

import java.util.Observable;

import fr.exia.showboard.ISquare;

public interface IMap {
    public int getHeight();

    public Observable getObservable();

    public ISquare getOnTheMapXY(int x, int y);

    public int getWidth();

    public void setMobileHasChanged();
}
