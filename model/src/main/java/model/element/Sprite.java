package model.element;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

// TODO: Auto-generated Javadoc
/**
 * The Class Sprite.
 */
public class Sprite {

    /** The image. */
    private Image image;

    /** The image name. */
    private String imageName;

    /** The image loaded. */
    private boolean imageLoaded;

    /** The database ID image. */
    private int databaseIDImage;

    /**
     * Instantiates a new sprite.
     *
     * @param databaseIDImage
     *            the database ID image
     * @param imageName
     *            the image name
     */
    public Sprite(final int databaseIDImage, final String imageName) {
        this.setDatabaseIDImage(databaseIDImage);
        this.setImageName(imageName);
    }

    /**
     * Gets the database ID image.
     *
     * @return the database ID image
     */
    public int getDatabaseIDImage() {
        return this.databaseIDImage;
    }

    /**
     * Gets the image.
     *
     * @return the image
     */
    public Image getImage() {
        return this.image;
    }

    /**
     * Gets the image loaded.
     *
     * @return the image loaded
     */
    public boolean getImageLoaded() {
        return this.imageLoaded;
    }

    /**
     * Gets the image name.
     *
     * @return the image name
     */
    public String getImageName() {
        return this.imageName;
    }

    /**
     * Load image.
     */
    public void loadImage() {
        try {
            this.setImage(ImageIO.read(new File("Sprites/" + this.getImageName())));
        } catch (final IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Sets the database ID image.
     *
     * @param databaseIDImage
     *            the new database ID image
     */
    public void setDatabaseIDImage(final int databaseIDImage) {
        this.databaseIDImage = databaseIDImage;
    }

    /**
     * Sets the image.
     *
     * @param image
     *            the new image
     */
    public void setImage(final Image image) {
        this.image = image;
    }

    /**
     * Sets the image loaded.
     *
     * @param imageLoaded
     *            the new image loaded
     */
    public void setImageLoaded(final boolean imageLoaded) {
        this.imageLoaded = imageLoaded;
    }

    /**
     * Sets the image name.
     *
     * @param imageName
     *            the new image name
     */
    public void setImageName(final String imageName) {
        this.imageName = imageName;
    }
}
