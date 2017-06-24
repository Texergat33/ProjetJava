package model;

import java.sql.SQLException;
import java.util.List;

import model.element.mobile.IMobile;

// TODO: Auto-generated Javadoc
/**
 * The Interface IBoulderDashModel.
 */
public interface IBoulderDashModel {

    /**
     * Gets the all positions by id.
     *
     * @param levelID
     *            the level ID
     * @return the all positions by id
     * @throws SQLException
     *             the SQL exception
     */
    public List<FillingMap> getAllPositionsById(final int levelID) throws SQLException;

    /**
     * Gets the level by ID.
     *
     * @param levelID
     *            the level ID
     * @return the level by ID
     * @throws SQLException
     *             the SQL exception
     */
    public GamingMap getLevelByID(int levelID) throws SQLException;

    /**
     * Gets the map.
     *
     * @return the map
     */
    public IMap getMap();

    /**
     * Gets the miner.
     *
     * @return the miner
     */
    public IMobile getMiner();
}
