package model.element;

import java.awt.Image;

public abstract class Element implements IElement {
	private Permeability	permeability;
	// private Sprite sprite;

	private Sprite sprite = new Sprite(null);

	public Element(Sprite sprite, Permeability permeability) {

		//met en place le sprite de l'élément

		//met en place la permeabilité
	}

	@Override
	public Image getImage() {
		return this.getSprite().getImage();
	}

	@Override
	public Permeability getPermeability() {
		return this.permeability;
	}

	@Override
	public Sprite getSprite() {
		return this.sprite;
	}

	private void setPermeability(Permeability permeability) {
		this.permeability = permeability;
	}

	protected void setSprite(Sprite sprite) {
		this.sprite = sprite;
	}

}
