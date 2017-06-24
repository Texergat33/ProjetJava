package model;

// TODO: Auto-generated Javadoc
/**
 * The Class GamingMap.
 */
public class GamingMap {

    /** The level ID. */
    private int levelID;

    /** The height. */
    public int height;

    /** The width. */
    public int width;

    /** The diamond counter. */
    public int diamondCounter;

    /**
     * Instantiates a new gaming map.
     *
     * @param levelID
     *            the level ID
     * @param height
     *            the height
     * @param width
     *            the width
     * @param diamondCounter
     *            the diamond counter
     */
    public GamingMap(final int levelID, final int height, final int width, final int diamondCounter) {
        this.setLevelID(levelID);
        this.height = height;
        this.width = width;
        this.setDiamondCounter(diamondCounter);
    }

    /**
     * Gets the diamond counter.
     *
     * @return the diamond counter
     */
    public int getDiamondCounter() {
        return this.diamondCounter;
    }

    /**
     * Gets the height.
     *
     * @return the height
     */
    public int getHeight() {
        return this.height;
    }

    /**
     * Gets the level ID.
     *
     * @return the level ID
     */
    public int getLevelID() {
        return this.levelID;
    }

    /**
     * Gets the width.
     *
     * @return the width
     */
    public int getWidth() {
        return this.width;
    }

    /**
     * Sets the diamond counter.
     *
     * @param diamondCounter
     *            the new diamond counter
     */
    public void setDiamondCounter(final int diamondCounter) {
        this.diamondCounter = diamondCounter;
    }

    /**
     * Sets the height.
     *
     * @param height
     *            the new height
     */
    public void setHeight(final int height) {
        this.height = height;
    }

    /**
     * Sets the level ID.
     *
     * @param levelID
     *            the new level ID
     */
    public void setLevelID(final int levelID) {
        this.levelID = levelID;
    }

    /**
     * Sets the width.
     *
     * @param width
     *            the new width
     */
    public void setWidth(final int width) {
        this.width = width;
    }

}
