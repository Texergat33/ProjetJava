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
import model.element.motionless.Background;
import model.element.motionless.MotionlessElementFactory;

// TODO: Auto-generated Javadoc
/**
 * The Class Map.
 */
public class Map extends Observable implements IMap {

	/** The width. */
	private int width;

	/** The height. */
	private int height;

	/** The level ID. */
	private int levelID;

	/** The on the map. */
	private IElement onTheMap[][];

	/** The mobiles. */
	private ArrayList<IMobile> mobiles;

	/** The diamond counter. */
	private int diamondCounter;

	/** The miner. */
	private IMobile miner;

	/** The mobile. */
	private IMobile mobile;

	/**
	 * Instantiates a new map.
	 *
	 * @param levelID
	 *            the level ID
	 */
	public Map(final int levelID) {
		this.mobiles = new ArrayList<IMobile>();
		this.setLevelID(levelID);
		try {
			this.loadLevel();
		} catch (final SQLException e) {
			e.printStackTrace();
		}
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see model.IMap#getDiamondCounter()
	 */
	@Override
	public int getDiamondCounter() {
		return this.diamondCounter;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see model.IMap#getHeight()
	 */
	@Override
	public int getHeight() {
		return this.height;
	}

	/**
	 * Gets the level ID.
	 *
	 * @return the level ID
	 */
	public int getLevelID() {
		return this.levelID;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see model.IMap#getMiner()
	 */
	@Override
	public IMobile getMiner() {
		return this.miner;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see model.IMap#getMobiles()
	 */
	@Override
	public ArrayList<IMobile> getMobiles() {
		return this.mobiles;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see model.IMap#getMobileXY(int, int)
	 */
	@Override
	public IMobile getMobileXY(final int x, final int y) {
		for (final IMobile mobile : this.getMobiles()) {
			if ((mobile.getX() == x) && (mobile.getY() == y)) {
				return mobile;
			}
		}
		return null;
	}

	//
	/*
	 * (non-Javadoc)
	 *
	 * @see model.IMap#getObservable()
	 */
	@Override
	public Observable getObservable() {
		return this;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see model.IMap#getOnTheMapXY(int, int)
	 */
	@Override
	public IElement getOnTheMapXY(final int x, final int y) {
		if (this.getMobileXY(x, y) != null) {
			return this.getMobileXY(x, y);
		} else {
			return this.onTheMap[y][x];
		}
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see model.IMap#getWidth()
	 */
	@Override
	public int getWidth() {
		return this.width;
	}

	/**
	 * Load level.
	 *
	 * @throws SQLException
	 *             the SQL exception
	 */
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
				System.out.println(currentCell);
				switch (currentCell) {
				case 1:
				case 2:
				case 3:
				case 4:
					this.setOnTheMapXY(MotionlessElementFactory.getElementFromFileSymbol(currentCell), x, y);
					break;
				case 5:
					this.getMobiles()
							.add(new Boulder(x, y, SpriteFactory.createBoulder(), this, Permeability.PUSHABLE));
					this.setOnTheMapXY(
							new Background(SpriteFactory.createBackground(), Permeability.PENETRABLEFOREVERYONE), x, y);
					break;
				case 6:
					this.getMobiles().add(new SlowAndFollowTheWallsMonster(x, y,
							SpriteFactory.createMonster("monsterFAFTW"), this, Permeability.KILLABLE));
					this.setOnTheMapXY(
							new Background(SpriteFactory.createBackground(), Permeability.PENETRABLEFOREVERYONE), x, y);
					break;
				case 7:
					this.getMobiles().add(new SlowAndRandomMonster(x, y, SpriteFactory.createMonster("monsterSAFTW"),
							this, Permeability.KILLABLE));
					this.setOnTheMapXY(
							new Background(SpriteFactory.createBackground(), Permeability.PENETRABLEFOREVERYONE), x, y);
					break;
				case 8:
					this.setMiner(
							new Miner(x, y, SpriteFactory.createMiner("defaultMiner1"), this, Permeability.KILLABLE));
					this.getMobiles().add(this.getMiner());
					this.setOnTheMapXY(
							new Background(SpriteFactory.createBackground(), Permeability.PENETRABLEFOREVERYONE), x, y);
					break;
				case 9:
					this.getMobiles()
							.add(new Diamond(x, y, SpriteFactory.createDiamond(), this, Permeability.COLLECTABLE));
					this.setOnTheMapXY(
							new Background(SpriteFactory.createBackground(), Permeability.PENETRABLEFOREVERYONE), x, y);
					;
					break;
				case 10:
					this.getMobiles().add(new FastAndRandomMonster(x, y, SpriteFactory.createMonster("monsterSAR"),
							this, Permeability.KILLABLE));
					this.setOnTheMapXY(
							new Background(SpriteFactory.createBackground(), Permeability.PENETRABLEFOREVERYONE), x, y);
					break;
				case 11:
					this.getMobiles().add(new FastAndFollowTheWallsMonster(x, y,
							SpriteFactory.createMonster("monsterFAR"), this, Permeability.KILLABLE));
					this.setOnTheMapXY(
							new Background(SpriteFactory.createBackground(), Permeability.PENETRABLEFOREVERYONE), x, y);
					break;
				default:
					this.setOnTheMapXY(
							new Background(SpriteFactory.createBackground(), Permeability.PENETRABLEFOREVERYONE), x, y);
					break;
				}
			}
		}

		System.out.println(this.onTheMap);

		for (int i = 0; i < this.onTheMap.length; i++) {

			for (int j = 0; j < this.onTheMap.length; j++) {
				System.out.println("(" + this.onTheMap[i][j] + ") [" + i + ", " + j + "]");
			}
		}
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see model.IMap#setDiamondCounter(int)
	 */
	@Override
	public void setDiamondCounter(final int diamondCounter) {
		this.diamondCounter = diamondCounter;
	}

	/**
	 * Sets the height.
	 *
	 * @param height
	 *            the new height
	 */
	private void setHeight(final int height) {
		this.height = height;
	}

	/**
	 * Sets the level ID.
	 *
	 * @param levelID
	 *            the new level ID
	 */
	public void setLevelID(final int levelID) {
		this.levelID = levelID;
	}

	/**
	 * Sets the miner.
	 *
	 * @param miner
	 *            the new miner
	 */
	public void setMiner(final IMobile miner) {
		this.miner = miner;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see model.IMap#setMobileHasChanged()
	 */
	@Override
	public void setMobileHasChanged() {
		this.setChanged();
		this.notifyObservers();
	}

	/**
	 * Sets the mobiles.
	 *
	 * @param mobiles
	 *            the new mobiles
	 */
	public void setMobiles(final ArrayList<IMobile> mobiles) {
		this.mobiles = mobiles;
	}

	/**
	 * Sets the on the map XY.
	 *
	 * @param element
	 *            the element
	 * @param x
	 *            the x
	 * @param y
	 *            the y
	 */
	private void setOnTheMapXY(final IElement element, final int x, final int y) {
		this.onTheMap[y][x] = element;
	}

	/**
	 * Sets the width.
	 *
	 * @param width
	 *            the new width
	 */
	private void setWidth(final int width) {
		this.width = width;
	}

}
