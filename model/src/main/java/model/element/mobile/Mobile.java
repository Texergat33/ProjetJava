package model.element.mobile;

import java.awt.Point;

import model.IMap;
import model.element.Element;
import model.element.Permeability;
import model.element.Sprite;
//import model.element.SpriteFactory;

public abstract class Mobile extends Element implements IMobile {

	private Point	position;
	private boolean	alive	= true;
	private IBoard	board;
	private IMap	map;
	// private SpriteFactory spriteFactory;
	private int		x;
	private int		y;

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
	public void doNothing() {
		this.setHasChanged();
		// informe du mouvement
	}

	protected IBoard getBoard() {
		return this.board;
	}

	private IMap getMap() {
		return this.map;
	}

	@Override
	public Point getPosition() {
		return this.position;
	}

	private int getX() {
		return this.x;
	}

	private int getY() {
		return this.y;
	}

	@Override
	public boolean isALive() {
		return this.alive;
	}

	@Override
	public boolean isKilled() {
		return this.alive;
		// récupère la map, et quand le mineur et le rocher/monstre se trouve à
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

	private void setMap(IMap map) {
		this.map = map;
	}

	public void setPosition(Point position) {
		this.position = position;
	}

	private void setX(int x) {
		this.x = x;
	}

	private void setY(int y) {
		this.y = y;
	}

}
