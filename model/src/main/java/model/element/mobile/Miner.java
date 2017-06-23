package model.element.mobile;

import java.awt.Point;

import model.IMap;
import model.element.Permeability;
import model.element.Sprite;
import model.element.SpriteFactory;
import model.element.motionless.MotionlessElement;

public class Miner extends Mobile {

    public Miner(final Point position, final Sprite sprite, final IMap map, final Permeability permeability) {
        super(position, sprite, map, permeability);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void die() {
        super.die();
        while (true) {
            this.setSprite(SpriteFactory.createMiner("deadMiner1"));
            try {
                Thread.sleep(350);
            } catch (final InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            this.setSprite(SpriteFactory.createMiner("deadMiner2"));
            try {
                Thread.sleep(350);
            } catch (final InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

    @Override
    public void doNothing() {
        super.doNothing();
        while (true) {
            this.setSprite(SpriteFactory.createMiner("defaultMiner1"));
            this.setSprite(SpriteFactory.createMiner("defaultMiner1"));
        }
    }

    /*- Pour le déplacement, dans chaque méthode, il faut tester la permeabilité de l'objet dans la direction dans laquelle on veut 
     * aller. Ca va beaucoup ressembler aux déplacement des monstres. 
     * Pour pousser un rocher, il faut faire plusieurs tests (CHEZ LE MINEUR, PAS LE ROCHER, ou alors il faut appeller une fonction du rocher depuis le 
     * mineur, c'est chiant). Le premier test, c'est celle de la perméabilité de l'objet en face. Encore. Si c'est celle d'un rocher, faut tester celle 
     * de la case juste après. Si le tout est faisable, tu bouges le rocher d'une case dans la direction voulue, puis le mineur, puis tu lances
     * les méthodes fall et glide du rocher (qui ne font rien si ce n'est pas possible). 
     * VOILA VOILA. Encore désolé pour mes conneries les filles ^^'
     * (non-Javadoc)
     * @see model.element.mobile.Mobile#moveDown()
     */
    @Override
    public void moveDown() {
        super.moveDown();
        while (true) {
            this.setSprite(SpriteFactory.createMiner("minerDown1"));
            this.setSprite(SpriteFactory.createMiner("minerDown2"));
        }
    }

    @Override
    public void moveLeft() {
        super.moveLeft();
        while (true) {
            this.setSprite(SpriteFactory.createMiner("minerLeft1"));
            this.setSprite(SpriteFactory.createMiner("minerLeft2"));
        }
    }

    @Override
    public void moveRight() {
        super.moveRight();
        while (true) {
            this.setSprite(SpriteFactory.createMiner("minerRight1"));
            this.setSprite(SpriteFactory.createMiner("minerRight2"));
        }
    }

    @Override
    public void moveUp() {
        super.moveUp();
        while (true) {
            this.setSprite(SpriteFactory.createMiner("minerUp1"));
        }
    }

    @Override
    public void collect() {
        // TODO Auto-generated method stub

    }

    @Override
    public Point getPosition() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public IMobile position(final int i, final int y) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void shift(final int i) {
        // TODO Auto-generated method stub

    }

    @Override
    public MotionlessElement createBackground() {
        // TODO Auto-generated method stub
        return null;
    }

}
