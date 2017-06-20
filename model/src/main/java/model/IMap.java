package model;

import java.util.Observable;

import model.element.IElement;

public interface IMap {
    public int getHeight();

    public Observable getObservable();

    public IElement[][] getOnTheMapXY(int x, int y);

    public int getWidth();

    public void setMobileHasChanged();
}
