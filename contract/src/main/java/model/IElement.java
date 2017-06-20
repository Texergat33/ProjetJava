package model;

import java.awt.Image;

import model.element.Permeability;
import model.element.Sprite;

public interface IElement {
	public Sprite getSprite();

	public Permeability getPermeability();

	public Image getImage();
}
