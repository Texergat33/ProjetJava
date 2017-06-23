package model;

import java.sql.SQLException;
import java.util.List;
import java.util.Observable;

import model.dao.NewDAO;
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

public class NewMap {

	private int width;
	private int height;
	private int levelID;
	private IElement onTheMap[][];
	private int diamondCounter;

	public NewMap(final int levelID) {
		super();
		this.setLevelID(levelID);
		// récupère les informations du constructeur de la classe Observable
		this.loadLevel();
		// lance la méthode load level avec en paramètre le numéro du niveau
	}

	public int getDiamondCounter() {
		return this.diamondCounter;
	}

	public int getHeight() {
		return this.height;
	}

	public int getLevelID() {
		return this.levelID;
	}

	public IMobile getMobileXY(final int x, final int y) {
		return null;
	}

	public Observable getObservable() {
		return null;
	}

	public IElement getOnTheMapXY(final int x, final int y) {
		return null;
	}

	public int getWidth() {
		return this.width;
	}

	public void loadLevel() throws SQLException {
		final GamingMap gamingMap = NewDAO.getLevelByID(this.levelID);
		final int consoleMapTable[][] = new int[gamingMap.getWidth()][gamingMap.getHeight()];
		this.onTheMap = new IElement[this.getHeight()][this.getWidth()];
		final List<FillingMap> objects = NewDAO.getMapFilledByID(gamingMap.getLevelID());
		for (final FillingMap fillingMap : objects) {
			consoleMapTable[fillingMap.getY()][fillingMap.getX()] = fillingMap
					.getObjectType();
		}
		for (int y = 0; y < this.getHeight(); y++) {
			for (int x = 0; x < this.getWidth(); x++) {
				final int currentCell = consoleMapTable[x][y];
				switch (currentCell) {
				case 1:
				case 2:
				case 3:
				case 4:
					this.setOnTheMapXY(MotionlessElementFactory.getElementFromFileSymbol(currentCell), x, y);
				case 5:
					this.setOnTheMapXY(new Boulder(null, null, null, null), x, y);
				case 6:
					this.setOnTheMapXY(new SlowAndFollowTheWallsMonster(null, null), x, y);
				case 7:
					this.setOnTheMapXY(new SlowAndRandomMonster(null, null), x, y);
				case 8:
					this.setOnTheMapXY(new Miner(null, null, null, null), x, y);
				case 9:
					this.setOnTheMapXY(new Diamond(null, null, null, null), x, y);
				case 10:
					this.setOnTheMapXY(new FastAndRandomMonster(null, null), x, y);
				case 11:
					this.setOnTheMapXY(new FastAndFollowTheWallsMonster(null, null), x, y);
				default:
					this.setOnTheMapXY(MotionlessElementFactory.getElementFromFileSymbol(2), x, y);
				}
			}
		}
	}

	public void setDiamondCounter(final int diamondCounter) {
		this.diamondCounter = diamondCounter;
	}

	private void setHeight(final int height) {
		this.height = height;
	}

	public void setLevelID(int levelID) {
		this.levelID = levelID;
	}

	public void setMobileHasChanged() {
		this.setChanged();
		this.notifyObservers();
		// Met en place les changements qui sont dans le package mobile
		// Notifie l'Observer des changements

	}

	private void setOnTheMapXY(final IElement element, final int x, final int y) {
		this.onTheMap[x][y] = element;
		// met l'élément dans le tableau de Map [x][y]
	}

	private void setWidth(final int width) {
		this.width = width;
	}
}
