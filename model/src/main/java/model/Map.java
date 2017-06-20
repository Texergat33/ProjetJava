package model;

import java.util.Observable;

import model.element.IElement;

public class Map extends Observable implements IMap {
	private int width;
	private int height;
	private int level;
	private IElement onTheMap[][];

	public Map(int level){
		super();
		//r�cup�re les informations du constructeur de la classe Observable
		this.loadLevel();
		//lance la m�thode load level avec en param�tre le num�ro du niveau
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
	public IElement[][] getOnTheMapXY(int x, int y) {
		return null;
	}

	@Override
	public int getWidth() {
		return this.width;
	}

	private void loadLevel(){
		//r�cup�re les donn�es de la map s�lectionn�e dans la BDD
		//et transforme les caract�res en instances d'�l�ments
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
		//met l'�l�ment dans le tableau de Map [x][y]
	}

	private void setWidth(int width) {
		this.width = width;
	}
}
