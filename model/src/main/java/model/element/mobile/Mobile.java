package model.element.mobile;

import java.awt.Point;

import model.IMap;
import model.element.Element;
import model.element.Permeability;
import model.element.Sprite;

public abstract class Mobile extends Element implements IMobile {

	private Point	position;
	private boolean	alive	= true;
	private IBoard	board;
	private IMap	map;
	private Sprite	sprite;
	private int		x;
	private int		y;

	public Mobile(Point position, Sprite sprite, IMap map, Permeability permeability) {
		super(sprite, permeability);
		this.setMap(map);
		this.position = new Point();
	}

	protected void die() {
		// statue alive est faux
		// informe du mouvement
	}

	@Override
	public void doNothing() {
		// informe du mouvement
	}

	protected IBoard getBoard() {
		return this.board;
	}

	@Override
	public boolean isALive() {
		return this.alive;
	}

	@Override
	public boolean isKilled() {
		// récupère la map, et quand le mineur et le rocher/monstre se trouve à
		// la même position lors d'une boucle,
	}

	@Override
	public void moveDown() {

		// met en place la position de Y
		// montre que ça a bougé
	}

	@Override
	public void moveLeft() {
		// met en place la position de X
		// montre que ça a bougé
	}

	@Override
	public void moveRight() {
		// met en place la position de X
		// montre que ça a bougé
	}

	@Override
	public void moveUp() {
		// met en place la position de Y
		// montre que ça a bougé
	}

	private void setHasChanged() {
		this.getMap().setMobileHasChanged();
	}

	@Override
	public Point getPosition() {
		return this.position;
	}

	public void setPosition(Point position) {
		this.position = position;
	}

	private IMap getMap() {
		return this.map;
	}

	private void setMap(IMap map) {
		this.map = map;
	}

	private int getX() {
		return this.x;
	}

	private void setX(int x) {
		this.x = x;
	}

	private int getY() {
		return this.y;
	}

	private void setY(int y) {
		this.y = y;
	}

}
