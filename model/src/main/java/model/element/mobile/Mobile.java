package model.element.mobile;

import java.awt.Point;

import model.IMap;
import model.element.Element;
import model.element.Permeability;
import model.element.Sprite;
import model.element.SpriteFactory;

public abstract class Mobile extends Element implements IMobile {

	private Point			position;
	private boolean			alive	= true;
	private IBoard			board;
	private IMap			map;
	private SpriteFactory	spriteFactory;
	private int				x;
	private int				y;

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
