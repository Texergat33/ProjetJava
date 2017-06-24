package model;

import java.sql.SQLException;
import java.util.ArrayList;
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

	private int                width;
	private int                height;
	private int                levelID;
	private IElement           onTheMap[][];
	private ArrayList<IMobile> mobiles;
	private int                diamondCounter;
	private IMobile            miner;
	private IMobile            mobile;

	public Map(final int levelID) {
		this.mobiles = new ArrayList<IMobile>();
		this.setLevelID(levelID);
		try {
			this.loadLevel();
		} catch (final SQLException e) {
			e.printStackTrace();
		}
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
	public IMobile getMiner() {
		return this.miner;
	}

	@Override
	public ArrayList<IMobile> getMobiles() {
		return this.mobiles;
	}

	@Override
	public IMobile getMobileXY(final int x, final int y) {
		return this.mobile;
	}

	@Override
	public Observable getObservable() {
		return this;
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
		this.setHeight(gamingMap.getHeight());
		this.setWidth(gamingMap.getWidth());
		this.onTheMap = new IElement[this.getHeight()][this.getWidth()];
		final List<FillingMap> objects = DAO.getMapFilledByID(gamingMap.getLevelID());
		for (final FillingMap fillingMap : objects) {
			consoleMapTable[fillingMap.getY()][fillingMap.getX()] = fillingMap.getObjectType();
		}
		for (int y = 0; y < gamingMap.getHeight(); y++) {
			for (int x = 0; x < gamingMap.getWidth(); x++) {
				final int currentCell = consoleMapTable[y][x];
				switch (currentCell) {
				case 1:
				case 2:
					this.setOnTheMapXY(MotionlessElementFactory.getElementFromFileSymbol(currentCell), x, y);
					break;
				case 3:
					this.getMobiles()
					.add(new Boulder(x, y, SpriteFactory.createBoulder(), this, Permeability.PUSHABLE));
					break;
				case 4:
					this.getMobiles()
					.add(new Boulder(x, y, SpriteFactory.createBoulder(), this, Permeability.PUSHABLE));
					break;
				case 5:
					this.getMobiles()
					.add(new Boulder(x, y, SpriteFactory.createBoulder(), this, Permeability.PUSHABLE));
					break;
				case 6:
					this.getMobiles().add(new SlowAndFollowTheWallsMonster(x, y,
							SpriteFactory.createMonster("monsterFAFTW"), this, Permeability.KILLABLE));
					break;
				case 7:
					this.getMobiles().add(new SlowAndRandomMonster(x, y, SpriteFactory.createMonster("monsterSAFTW"),
							this, Permeability.KILLABLE));
					break;
				case 8:
					this.setMiner(
							new Miner(x, y, SpriteFactory.createMiner("defaultMiner1"), this, Permeability.KILLABLE));
					this.getMobiles().add(this.getMiner());
					break;
				case 9:
					this.getMobiles()
					.add(new Diamond(x, y, SpriteFactory.createDiamond(), this, Permeability.COLLECTABLE));
					break;
				case 10:
					this.getMobiles().add(new FastAndRandomMonster(x, y, SpriteFactory.createMonster("monsterSAR"),
							this, Permeability.KILLABLE));
					break;
				case 11:
					this.getMobiles().add(new FastAndFollowTheWallsMonster(x, y,
							SpriteFactory.createMonster("monsterFAR"), this, Permeability.KILLABLE));
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

	private void setHeight(final int height) {
		this.height = height;
	}

	public void setLevelID(final int levelID) {
		this.levelID = levelID;
	}

	public void setMiner(final IMobile miner) {
		this.miner = miner;
	}

	@Override
	public void setMobileHasChanged() {
		this.setChanged();
		this.notifyObservers();
		// Met en place les changements qui sont dans le package mobile
		// Notifie l'Observer des changements

	}

	public void setMobiles(final ArrayList<IMobile> mobiles) {
		this.mobiles = mobiles;
	}

	private void setOnTheMapXY(final IElement element, final int x, final int y) {
		this.onTheMap[y][x] = element;
		// met l'élément dans le tableau de Map [x][y]
	}

	private void setWidth(final int width) {
		this.width = width;
	}

}
