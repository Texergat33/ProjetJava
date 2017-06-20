package model.element;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Sprite {
	private Image	image;
	private String	imageName;
	private boolean	imageLoaded;
	private char consoleImage;

	public Sprite(String imageName) {
		this.setImageName(imageName);
		// met en place le nom de l'image
	}

	public char getConsoleImage() {
		return this.consoleImage;
	}

	public Image getImage() {
		return this.image;
	}

	public boolean getImageLoaded() {
		return this.imageLoaded;
	}

	public String getImageName() {
		return this.imageName;
	}

	public void loadImage() throws IOException {
		this.setImage(ImageIO.read(new File("images/" + this.getImageName())));
		// met l'image lue en paramètre grâce à la récupération du nom de celle-ci
	}

	public void setImage(Image image) {
		this.image = image;
	}

	public void setImageLoaded(boolean imageLoaded) {
		this.imageLoaded = imageLoaded;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}
}
