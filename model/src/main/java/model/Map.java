package model;

import java.sql.SQLException;
import java.util.List;
import java.util.Observable;

import model.dao.DAO;
import model.element.IElement;
import model.element.Permeability;
import model.element.SpriteFactory;
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
	private int			levelID;
	private IElement	onTheMap[][];
	private int			diamondCounter;
	private IMobile		miner;

	public Map(final int levelID) {
		// super();
		System.out.println("bjr");
		this.setLevelID(levelID);
		// récupère les informations du constructeur de la classe Observable
		try {
			this.loadLevel();
		} catch (final SQLException e) {
			System.out.println("sql bug");
			e.printStackTrace();
		}
		// lance la méthode load level avec en paramètre le numéro du niveau
	}

	@Override
	public int getDiamondCounter() {
		return this.diamondCounter;
	}

	@Override
	public int getHeight() {
		return this.height;
	}

	public int getLevelID() {
		return this.levelID;
	}

	@Override
	public IMobile getMobileXY(final int x, final int y) {
		return null;
	}

	@Override
	public Observable getObservable() {
		return null;
	}

	@Override
	public IElement getOnTheMapXY(final int x, final int y) {
		return this.onTheMap[y][x];
	}

	@Override
	public int getWidth() {
		return this.width;
	}

	public void loadLevel() throws SQLException {
		final GamingMap gamingMap = DAO.getLevelByID(this.levelID);
		final int consoleMapTable[][] = new int[gamingMap.getHeight()][gamingMap.getWidth()];
		this.onTheMap = new IElement[this.getHeight()][this.getWidth()];
		final List<FillingMap> objects = DAO.getMapFilledByID(gamingMap.getLevelID());
		for (final FillingMap fillingMap : objects) {
			consoleMapTable[fillingMap.getY()][fillingMap.getX()] = fillingMap.getObjectType();
		}
		for (int y = 0; y < gamingMap.getHeight(); y++) {
			for (int x = 0; x < gamingMap.getWidth(); x++) {
				final int currentCell = consoleMapTable[y][x];
				System.out.println(x + ":" + y + ":" + currentCell);
				switch (currentCell) {
				case 1:
				case 2:
				case 3:
				case 4:
					this.setOnTheMapXY(MotionlessElementFactory.getElementFromFileSymbol(currentCell), x, y);
					break;
				case 5:
					this.setOnTheMapXY(new Boulder(x, y, SpriteFactory.createBoulder(), this, Permeability.PUSHABLE), x,
							y);
					break;
				case 6:
					this.setOnTheMapXY(new SlowAndFollowTheWallsMonster(x, y,
							SpriteFactory.createMonster("monsterFAFTW"), this, Permeability.KILLABLE), x, y);
					break;
				case 7:
					this.setOnTheMapXY(new SlowAndRandomMonster(x, y, SpriteFactory.createMonster("monsterSAFTW"), this,
							Permeability.KILLABLE), x, y);
					break;
				case 8:
					this.setMiner(
							new Miner(x, y, SpriteFactory.createMiner("defaultMiner1"), this, Permeability.KILLABLE));
					this.setOnTheMapXY(this.getMiner(), x, y);

					break;
				case 9:
					this.setOnTheMapXY(new Diamond(x, y, SpriteFactory.createDiamond(), this, Permeability.COLLECTABLE),
							x, y);
					break;
				case 10:
					this.setOnTheMapXY(new FastAndRandomMonster(x, y, SpriteFactory.createMonster("monsterSAR"), this,
							Permeability.KILLABLE), x, y);
					break;
				case 11:
					this.setOnTheMapXY(new FastAndFollowTheWallsMonster(x, y, SpriteFactory.createMonster("monsterFAR"),
							this, Permeability.KILLABLE), x, y);
					break;
				default:
					this.setOnTheMapXY(MotionlessElementFactory.getElementFromFileSymbol(2), x, y);
					break;
				}
			}
		}
	}

	@Override
	public void setDiamondCounter(final int diamondCounter) {
		this.diamondCounter = diamondCounter;
	}

	public void setHeight(final int height) {
		this.height = height;
	}

	public void setLevelID(final int levelID) {
		this.levelID = levelID;
	}

	@Override
	public void setMobileHasChanged() {
		this.setChanged();
		this.notifyObservers();
		// Met en place les changements qui sont dans le package mobile
		// Notifie l'Observer des changements

	}

	private void setOnTheMapXY(final IElement element, final int x, final int y) {
		this.onTheMap[y][x] = element;
		// met l'élément dans le tableau de Map [x][y]
	}

	public void setWidth(final int width) {
		this.width = width;
	}

	@Override
	public IMobile getMiner() {
		return this.miner;
	}

	public void setMiner(final IMobile miner) {
		this.miner = miner;
	}
}
