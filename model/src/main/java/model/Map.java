package model;

import java.util.List;
import java.util.Observable;

import model.element.IElement;
import model.element.mobile.MobileFactory;
import model.element.motionless.MotionlessElementFactory;

public class Map extends Observable implements IMap {
	private int			width;
	private int			height;
	private int			level;
	private IElement	onTheMap[][];

	public Map(int level) {
		super();
		this.level = level;
		// récupère les informations du constructeur de la classe Observable
		this.loadLevel();
		// lance la méthode load level avec en paramètre le numéro du niveau
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

	@Override
	public int getWidth() {
		return this.width;
	}

	private void loadLevel() {
		// récupère les données de la map sélectionnée dans la BDD
		// et transforme les caractères en instances d'éléments
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
		// met l'élément dans le tableau de Map [x][y]
	}

	private void setWidth(int width) {
		this.width = width;
	}
}
