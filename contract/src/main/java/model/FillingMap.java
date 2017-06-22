package model;

public class FillingMap {
    private int idimage;
    public int  x;
    public int  y;

    public int type;

    public FillingMap(final int x, final int y, final int idimage, final int type) {
        this.idimage = idimage;
        this.x = x;
        this.y = y;
        this.type = type;
    }

    protected int getX() {
        return this.x;
    }

    protected void setX(final int x) {
        this.x = x;
    }

    protected int getY() {
        return this.y;
    }

    protected void setY(final int y) {
        this.y = y;
    }

    protected int getType() {
        return this.type;
    }

    protected void setType(final int type) {
        this.type = type;
    }

    protected int getIdimage() {
        return this.idimage;
    }

    protected void setIdimage(final int idimage) {
        this.idimage = idimage;
    }

}