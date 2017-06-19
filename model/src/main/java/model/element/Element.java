package model.element;

import java.awt.Image;

public abstract class Element {
	private Permeability	permeability;
	// private Sprite sprite;

	private Sprite			sprite	= new Sprite(null);

	public Element(Sprite sprite, Permeability permeability) {

	}

	public Sprite getSprite() {
		return this.sprite;
	}

	public Permeability getPermeability() {
		return this.permeability;

	}

	public Image getImage() {
		return null;

	}

	protected void setSprite(Sprite sprite) {
		this.sprite = sprite;
	}

	private void setPermeability(Permeability permeability) {
		this.permeability = permeability;
	}
	// test
}
