package model.element;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Sprite {
	private Image	image;
	private String	imageName;
	private boolean	imageLoaded;
	private int		databaseIDImage;

	public Sprite(final int databaseIDImage, final String imageName) {
		this.setDatabaseIDImage(databaseIDImage);
		this.setImageName(imageName);
	}

	public int getDatabaseIDImage() {
		return this.databaseIDImage;
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

	public void loadImage() {
		try {
			this.setImage(ImageIO.read(new File("Sprites/" + this.getImageName())));
		} catch (final IOException e) {
			e.printStackTrace();
		}
	}

	public void setDatabaseIDImage(final int databaseIDImage) {
		this.databaseIDImage = databaseIDImage;
	}

	public void setImage(final Image image) {
		this.image = image;
	}

	public void setImageLoaded(final boolean imageLoaded) {
		this.imageLoaded = imageLoaded;
	}

	public void setImageName(final String imageName) {
		this.imageName = imageName;
	}
}
