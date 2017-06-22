package model.element.mobile;

import java.awt.Point;

import model.IMap;
import model.element.Element;
import model.element.Permeability;
import model.element.Sprite;
import showboard.IBoard;

public abstract class Mobile extends Element implements IMobile {

    private Point   position;
    private boolean alive   = true;
    private boolean falling = false;
    private IBoard  board;
    private IMap    map;
    private int     x;
    private int     y;

    public Mobile(final Point position, final Sprite sprite, final IMap map, final Permeability permeability) {
        super(sprite, permeability);
        this.setMap(map);
        this.position = new Point();
    }

    @Override
    public void die() {
        this.alive = false;
        this.setHasChanged();
        // statue alive est faux
        // informe du mouvement
    }

    @Override
    public void setFalling(final boolean falling) {
        this.falling = falling;
    }

    @Override
    public boolean isFalling() {
        return this.falling;
    }

    @Override
    public void doNothing() {
        this.setHasChanged();
        // informe du mouvement
    }

    public void doSomething() {

    }

    @Override
    public boolean isAlive() {
        return this.alive;
    }

    @Override
    public boolean isKilled() {
        return this.alive;
        // récupère la map, et quand le mineur et le rocher/monstre se trouve
        // à
        // la même position lors d'une boucle,
    }

    @Override
    public void moveDown() {
        this.setY(this.getY() - 1);
        this.setHasChanged();
        // met en place la position de Y
        // montre que ça a bougé
    }

    @Override
    public void moveLeft() {
        this.setX(this.getX() - 1);
        this.setHasChanged();
        // met en place la position de X
        // montre que ça a bougé
    }

    @Override
    public void moveRight() {
        this.setX(this.getX() + 1);
        this.setHasChanged();
        // met en place la position de X
        // montre que ça a bougé
    }

    @Override
    public void moveUp() {
        this.setY(this.getY() + 1);
        this.setHasChanged();
        // met en place la position de Y
        // montre que ça a bougé
    }

    private void setHasChanged() {
        this.getMap().setMobileHasChanged();
    }

    private void setMap(final IMap map) {
        this.map = map;
    }

    public void setPosition(final Point position) {
        this.position = position;
    }

    protected IBoard getBoard() {
        return this.board;
    }

    @Override
    public IMap getMap() {
        return this.map;
    }

    @Override
    public int getX() {
        return this.x;
    }

    @Override
    public int getY() {
        return this.y;
    }

    private void setX(final int x) {
        this.x = x;
    }

    private void setY(final int y) {
        this.y = y;
    }

}
