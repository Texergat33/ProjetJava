package model;

import java.util.List;
import java.util.Observable;

import model.element.IElement;
<<<<<<< HEAD
import model.element.mobile.IMobile;
=======
import model.element.mobile.MobileFactory;
import model.element.motionless.MotionlessElementFactory;
>>>>>>> branch 'Model' of https://github.com/Texergat33/ProjetJava

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

	@Override
	public Observable getObservable() {
		return null;
	}

	@Override
	public IElement getOnTheMapXY(int x, int y) {
		return null;
	}

	public IMobile getMobileXY(int x, int y) {
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
<<<<<<< HEAD
		for (int x = 0; x < mapDimensions.getWidth(); x++) {
			for (int y = 0; y < mapDimensions.getLength(); y++) {
				int j = ConsoleMapTable[x][y];
=======
		for(int x = 0; x<mapDimensions.getWidth(); x++){
			for(int y = 0; y<mapDimensions.getLength(); y++){
				int currentCell = ConsoleMapTable[x][y];
				switch(currentCell){
				case 1 :
				case 2 :
				case 3 :
				case 4 :
					this.setOnTheMapXY(MotionlessElementFactory.getElementFromFileSymbol(currentCell), x, y);
					break;
				case 5 :
				case 6 :
				case 7 :
				case 8 :
				case 9 :
				case 10 :
				case 11 :
					this.setOnTheMapXY(MobileFactory.getElementFromFileSymbol(currentCell), x, y);
					break;
				}
>>>>>>> branch 'Model' of https://github.com/Texergat33/ProjetJava
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
