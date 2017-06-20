package model;

import java.util.Observable;

public interface IMap {
    public int getHeight();

    public Observable getObservable();

    public IElement[][] getOnTheMapXY(int x, int y);

    public int getWidth();

    public void setMobileHasChanged();
}
