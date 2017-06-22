package model.element.mobile;

import java.awt.Point;

import fr.exia.showboard.IBoard;
import model.IMap;
import model.IMobile;
import model.element.Element;
import model.element.Permeability;
import model.element.Sprite;

public abstract class Mobile extends Element implements IMobile {

    private Point         position;
    private final boolean alive = true;
    private IBoard        board;
    private IMap          map;
    private int           x;
    private int           y;


    public Mobile(final Sprite sprite, final Permeability permeability) {
        super(sprite, permeability);
        // TODO Auto-generated constructor stub
    }

    private void setMobileHasChanged() {

    }

    @Override
    public void moveUp() {

    }

    @Override
    public void moveDown() {

    }

    @Override
    public void moveRight() {

    }

    @Override
    public void moveLeft() {

    }

    @Override
    public void doNothing() {

    }

    @Override
    public boolean isALive() {
        return this.alive;
    }

    @Override
    public boolean isKilled() {
        return this.alive;
    }

    @Override
    public Point getPosition() {
        return this.position;
    }

    public void setPosition(final Point position) {
        this.position = position;
    }

    protected IBoard getBoard() {
        return this.board;

    }

    protected void die() {

    }

    @Override
    public int getX() {
        return this.x;
    }

    public void setX(final int x) {
        this.x = x;
    }

    @Override
    public int getY() {
        return this.y;
    }

    public void setY(final int y) {
        this.y = y;
    }
}
