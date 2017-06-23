package model.element;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Sprite {
    private Image   image;
    private String  imageName;
    private boolean imageLoaded;
    private int     databaseIDImage;

    public Sprite(final int databaseIDImage, final String imageName) {
        this.setDatabaseIDImage(databaseIDImage);
        this.setImageName(imageName);
        // met en place le nom de l'image
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
            this.setImage(ImageIO.read(new File("images/" + this.getImageName())));
        } catch (final IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        // met l'image lue en paramètre grâce à la récupération du nom de
        // celle-ci
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
