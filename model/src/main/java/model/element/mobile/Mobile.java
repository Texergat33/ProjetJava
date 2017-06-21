package model.element.mobile;

import java.awt.Point;

import fr.exia.showboard.IBoard;
import model.IMap;
import model.element.Element;
import model.element.Permeability;
import model.element.Sprite;

public abstract class Mobile extends Element implements IMobile {

	private Point				position;
	private boolean				alive	= true;
	private boolean				falling	= false;
	private IBoard				board;
	private IMap				map;
	private int					x;
	private int					y;
	private BehaviorDoSomething	behaviorDoSomething;

	public Mobile(Point position, Sprite sprite, IMap map, Permeability permeability) {
		super(sprite, permeability);
		this.setMap(map);
		this.position = new Point();
	}

	protected void die() {
		this.alive = false;
		this.setHasChanged();
		// statue alive est faux
		// informe du mouvement
	}

	@Override
	public void setFalling(boolean falling) {
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
		// r�cup�re la map, et quand le mineur et le rocher/monstre se trouve �
		// la m�me position lors d'une boucle,
	}

	@Override
	public void moveDown() {
		this.setY(this.getY() - 1);
		this.setHasChanged();
		// met en place la position de Y
		// montre que �a a boug�
	}

	@Override
	public void moveLeft() {
		this.setX(this.getX() - 1);
		this.setHasChanged();
		// met en place la position de X
		// montre que �a a boug�
	}

	@Override
	public void moveRight() {
		this.setX(this.getX() + 1);
		this.setHasChanged();
		// met en place la position de X
		// montre que �a a boug�
	}

	@Override
	public void moveUp() {
		this.setY(this.getY() + 1);
		this.setHasChanged();
		// met en place la position de Y
		// montre que �a a boug�
	}

	private void setHasChanged() {
		this.getMap().setMobileHasChanged();
	}

	private void setMap(IMap map) {
		this.map = map;
	}

	public void setPosition(Point position) {
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
	public Point getPosition() {
		return this.position;
	}

	@Override
	public int getX() {
		return this.x;
	}

	@Override
	public int getY() {
		return this.y;
	}

	private void setX(int x) {
		this.x = x;
	}

	private void setY(int y) {
		this.y = y;
	}

}
