package model;

import java.util.List;
import java.util.Observable;

import model.element.IElement;
import model.element.mobile.Boulder;
import model.element.mobile.Diamond;
import model.element.mobile.FastAndFollowTheWallsMonster;
import model.element.mobile.FastAndRandomMonster;
import model.element.mobile.IMobile;
import model.element.mobile.Miner;
import model.element.mobile.SlowAndFollowTheWallsMonster;
import model.element.mobile.SlowAndRandomMonster;
import model.element.motionless.MotionlessElementFactory;

public class Map extends Observable implements IMap {
	private int			width;
	private int			height;
	private int			level;
	private IElement	onTheMap[][];

	public Map(int level) {
		super();
		this.level = level;
		// r�cup�re les informations du constructeur de la classe Observable
		this.loadLevel();
		// lance la m�thode load level avec en param�tre le num�ro du niveau
	}

	@Override
	public int getHeight() {
		return this.height;
	}

	public IMobile getMobileXY(int x, int y) {
		return null;
	}

	@Override
	public Observable getObservable() {
		return null;
	}

	@Override
	public IElement getOnTheMapXY(int x, int y) {
		return null;
	}

	@Override
	public int getWidth() {
		return this.width;
	}

	private void loadLevel() {
		// r�cup�re les donn�es de la map s�lectionn�e dans la BDD
		// et transforme les caract�res en instances d'�l�ments
		MapDimensions mapDimensions = this.getModel().getMapSize(this.level);
		int ConsoleMapTable[][] = new int[mapDimensions.getWidth()][mapDimensions.getLength()];
		List<FillingMap> objects = this.getModel().getMapFilled(mapDimensions.getId());
		for (FillingMap fillingmap : objects){
			ConsoleMapTable[fillingmap.x][fillingmap.y] = fillingmap.type;
		}
		for(int x = 0; x<mapDimensions.getWidth(); x++){
			for(int y = 0; y<mapDimensions.getLength(); y++){
				int currentCell = ConsoleMapTable[x][y];
				switch(currentCell){
				case 1 :
				case 2 :
				case 3 :
				case 4 :
					this.setOnTheMapXY(MotionlessElementFactory.getElementFromFileSymbol(currentCell), x, y);
				case 5 :
					this.setOnTheMapXY(new Boulder(null, null, null, null), x, y);
				case 6 :
					this.setOnTheMapXY(new SlowAndFollowTheWallsMonster(null, null), x, y);
				case 7 :
					this.setOnTheMapXY(new SlowAndRandomMonster(null, null), x, y);
				case 8 :
					this.setOnTheMapXY(new Miner(null, null, null, null), x, y);
				case 9 :
					this.setOnTheMapXY(new Diamond(null, null, null, null), x, y);
				case 10 :
					this.setOnTheMapXY(new FastAndRandomMonster(null, null), x, y);
				case 11 :
					this.setOnTheMapXY(new FastAndFollowTheWallsMonster(null, null), x, y);
				default :
					this.setOnTheMapXY(MotionlessElementFactory.getElementFromFileSymbol(2), x, y);
				}
			}
		}
	}


	private void setHeight(int height) {
		this.height = height;
	}

	@Override
	public void setMobileHasChanged() {
		this.setChanged();
		this.notifyObservers();
		// Met en place les changements qui sont dans le package mobile
		// Notifie l'Observer des changements

	}

	private void setOnTheMapXY(IElement element, int x, int y) {
		this.onTheMap[x][y] = element;
		// met l'�l�ment dans le tableau de Map [x][y]
	}

	private void setWidth(int width) {
		this.width = width;
	}
}
