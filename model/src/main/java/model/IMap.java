package model;

import java.util.ArrayList;
import java.util.Observable;

import model.element.IElement;
import model.element.mobile.IMobile;

// TODO: Auto-generated Javadoc
/**
 * The Interface IMap.
 */
public interface IMap {

    /**
     * Gets the diamond counter.
     *
     * @return the diamond counter
     */
    public int getDiamondCounter();

    /**
     * Gets the height.
     *
     * @return the height
     */
    public int getHeight();

    /**
     * Gets the miner.
     *
     * @return the miner
     */
    public IMobile getMiner();

    /**
     * Gets the mobiles.
     *
     * @return the mobiles
     */
    public ArrayList<IMobile> getMobiles();

    /**
     * Gets the mobile XY.
     *
     * @param x
     *            the x
     * @param y
     *            the y
     * @return the mobile XY
     */
    public IMobile getMobileXY(int x, int y);

    /**
     * Gets the observable.
     *
     * @return the observable
     */
    public Observable getObservable();

    /**
     * Gets the on the map XY.
     *
     * @param x
     *            the x
     * @param y
     *            the y
     * @return the on the map XY
     */
    public IElement getOnTheMapXY(int x, int y);

    /**
     * Gets the width.
     *
     * @return the width
     */
    public int getWidth();

    /**
     * Sets the diamond counter.
     *
     * @param diamondCounter
     *            the new diamond counter
     */
    public void setDiamondCounter(final int diamondCounter);

    /**
     * Sets the mobile has changed.
     */
    public void setMobileHasChanged();

}
