package model.element;

import java.awt.Image;

public class Sprite {
	private Image	image;
	private String	imageName;
	private boolean	imageLoaded;

	public Sprite(String imageName) {

	}

	public void loadImage() {

	}

	public String getImageName() {
		return this.imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	public Image getImage() {
		return this.image;
	}

	public void setImage(Image image) {
		this.image = image;
	}

	public boolean getImageLoaded() {
		return this.imageLoaded;
	}

	public void setImageLoaded(boolean imageLoaded) {
		this.imageLoaded = imageLoaded;
	}
	// test
}
