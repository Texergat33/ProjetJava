package model;

public class MapDimensions {
    private int id;
    public int  height;
    public int  width;
    public int  counterDiamond;

    public MapDimensions(final int id, final int height, final int width, final int counterDiamond) {
        this.id = id;
        this.height = height;
        this.width = width;
        this.setCounterDiamond(counterDiamond);
    }

    public int getLength() {
        return this.height;
    }

    protected void setLength(final int height) {
        this.height = height;
    }

    public int getWidth() {
        return this.width;
    }

    protected void setWidth(final int width) {
        this.width = width;
    }

    public int getId() {
        return this.id;
    }

    protected void setId(final int id) {
        this.id = id;
    }

    public int getCounterDiamond() {
        return this.counterDiamond;
    }

    public void setCounterDiamond(final int counterDiamond) {
        this.counterDiamond = counterDiamond;
    }

}