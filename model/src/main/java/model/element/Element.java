package model.element;

import java.awt.Image;

// TODO: Auto-generated Javadoc
/**
 * The Class Element.
 */
public abstract class Element implements IElement {

    /** The permeability. */
    private Permeability permeability;

    /** The sprite. */
    private Sprite sprite;

    /**
     * Instantiates a new element.
     *
     * @param sprite
     *            the sprite
     * @param permeability
     *            the permeability
     */
    public Element(final Sprite sprite, final Permeability permeability) {
        this.setSprite(sprite);
        this.setPermeability(permeability);
    }

    /*
     * (non-Javadoc)
     * 
     * @see model.element.IElement#getImage()
     */
    @Override
    public Image getImage() {
        return this.getSprite().getImage();
    }

    /*
     * (non-Javadoc)
     * 
     * @see model.element.IElement#getPermeability()
     */
    @Override
    public Permeability getPermeability() {
        return this.permeability;
    }

    /*
     * (non-Javadoc)
     * 
     * @see model.element.IElement#getSprite()
     */
    @Override
    public Sprite getSprite() {
        return this.sprite;
    }

    /**
     * Sets the permeability.
     *
     * @param permeability
     *            the new permeability
     */
    private void setPermeability(final Permeability permeability) {
        this.permeability = permeability;
    }

    /**
     * Sets the sprite.
     *
     * @param sprite
     *            the new sprite
     */
    protected void setSprite(final Sprite sprite) {
        this.sprite = sprite;
    }

}
