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
		//récupère les informations du constructeur de la classe Observable

		//lance la méthode load level avec en paramètre le numéro du niveau
	}

	@Override
	public int getHeight() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Observable getObservable() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IElement[][] getOnTheMapXY(int x, int y) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getWidth() {
		// TODO Auto-generated method stub
		return 0;
	}

	private void loadLevel(){
		//récupère les données de la map sélectionnée dans la BDD
		//et transforme les caractères en instances d'éléments
	}

	private void setHeight(int height) {
		this.height = height;
	}

	@Override
	public void setMobileHasChanged() {
		// Met en place les changements qui sont dans le package mobile
		// Notifie l'Observer des changements

	}

	private void setOnTheMapXY(IElement[][] onTheMap) {
		this.onTheMap = onTheMap;
		//met l'élément dans le tableau de Map [x][y]
	}

	private void setWidth(int width) {
		this.width = width;
	}
}
