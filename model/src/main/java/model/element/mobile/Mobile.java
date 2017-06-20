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

	public Mobile(Sprite sprite, Permeability permeability) {
		super(sprite, permeability);
		// TODO Auto-generated constructor stub
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
	public Point getPosition() {
		return this.position;
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

	public void setPosition(Point position) {
		this.position = position;
	}

}
