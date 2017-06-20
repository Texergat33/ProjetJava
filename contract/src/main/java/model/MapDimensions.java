package model;

public class MapDimensions {
    private int id;
    public int  length;
    public int  width;

    public MapDimensions(final int id, final int length, final int width) {
        this.id = id;
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return this.length;
    }

    protected void setLength(final int length) {
        this.length = length;
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

}