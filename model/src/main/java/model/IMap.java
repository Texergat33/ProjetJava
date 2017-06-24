package model;

import java.util.ArrayList;
import java.util.Observable;

import model.element.IElement;
import model.element.mobile.IMobile;

public interface IMap {
	public int getDiamondCounter();

	public int getHeight();

	public IMobile getMiner();


	public ArrayList<IMobile> getMobiles();




	public IMobile getMobileXY(int x, int y);

	public Observable getObservable();

	public IElement getOnTheMapXY(int x, int y);

	public int getWidth();

	public void setDiamondCounter(final int diamondCounter);

	public void setMobileHasChanged();

}
