package model.element;

import java.awt.Image;

import model.IElement;

public abstract class Element implements IElement {
	private Permeability	permeability;
	// private Sprite sprite;

	private Sprite			sprite	= new Sprite(null);

	public Element(Sprite sprite, Permeability permeability) {

	}

	@Override
	public Sprite getSprite() {
		return this.sprite;
	}

	@Override
	public Permeability getPermeability() {
		return this.permeability;

	}

	@Override
	public Image getImage() {
		return null;

	}

	protected void setSprite(Sprite sprite) {
		this.sprite = sprite;
	}

	private void setPermeability(Permeability permeability) {
		this.permeability = permeability;
	}

}
