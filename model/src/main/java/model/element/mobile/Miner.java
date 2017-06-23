package model.element.mobile;

import java.awt.Point;

import model.IMap;
import model.element.Permeability;
import model.element.Sprite;
import model.element.SpriteFactory;
import showboard.IBoard;

public class Miner extends Mobile {
	
    private int     x;
    private int     y;
    
    public Miner(int x, int y, final Sprite sprite, final IMap map, final Permeability permeability) {
        super(x, y, sprite, map, permeability);
        // TODO Auto-generated constructor stub
    }
 
	@Override
	public void die() {
		super.die();
		while (true) {
			this.setSprite(SpriteFactory.createMiner("deadMiner1"));
			try {
				Thread.sleep(350);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			this.setSprite(SpriteFactory.createMiner("deadMiner2"));
			try {
				Thread.sleep(350);
			} catch (InterruptedException e) {
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
			this.setSprite(SpriteFactory.createMiner("minerDown1"));
		if (this.getMap().getOnTheMapXY(this.getY(), this.getY() + 1).getPermeability() == Permeability.PENETRABLEFORMINER) {
			 this.setY(this.getY() + 1);
		        this.setHasChanged();
		}
	}

	@Override
	public void moveLeft() {
		super.moveLeft();
		while (true) {
			this.setSprite(SpriteFactory.createMiner("minerLeft1"));

		}
	}

	@Override
	public void moveRight() {
		super.moveRight();
		while (true) {
			this.setSprite(SpriteFactory.createMiner("minerRight1"));

		}
	}

	@Override
	public void moveUp() {
		super.moveUp();
		while (true) {
			this.setSprite(SpriteFactory.createMiner("minerUp1"));
		}
	}

}
