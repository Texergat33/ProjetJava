package model.element.mobile;

import java.awt.Point;

import model.IMap;
import model.element.Element;
import model.element.Permeability;
import model.element.Sprite;
import showboard.IBoard;

public abstract class Mobile extends Element implements IMobile {

	private boolean alive = true;
	private boolean falling = false;
	private IBoard board;
	private IMap map;
	protected Point position;
	protected BehaviorDoSomething doSomething;
	private int x;
	private int y;
	
	public Mobile(final int x, final int y, final Sprite sprite, final IMap map, final Permeability permeability) {
		super(sprite, permeability);
		this.setMap(map);
		this.setPosition(new Point(x, y));

	}

  @Override
	public Point getPosition() {
		return this.position;
	}

	@Override
	public void collect() {
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
  
	public void ruin() {
		this.getMap().getOnTheMapXY(this.position.x, this.position.y).createBackground();
	}

	@Override
	public void doNothing() {
		this.setHasChanged();
		// informe du mouvement
	}

	@Override
	public void doSomething() {
		this.doSomething.doSomething();
	}

	@Override
	public boolean isAlive() {
		return this.alive;
	}

	public boolean isKilled() {
		return this.alive;
		// récupère la map, et quand le mineur et le rocher/monstre se trouve
		// à
		// la même position lors d'une boucle,
	}

	@Override
	public void moveDown() {
		this.setY(this.getY() + 1);

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
    
	protected void setHasChanged() {
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
		return this.position.x;

	}

	@Override
	public int getY() {
		return this.position.y;
	}

	protected void setX(final int x) {
		this.position.x = x;
	}

	protected void setY(final int y) {
		this.position.y = y;

  }
}
