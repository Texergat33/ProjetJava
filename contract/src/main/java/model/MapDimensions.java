package model;

public class MapDimensions {
    private int id;
    public int  height;
    public int  width;

    public MapDimensions(final int id, final int height, final int width) {
        this.id = id;
        this.height = height;
        this.width = width;
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

}