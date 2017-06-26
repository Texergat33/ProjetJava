package model.dao;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.FillingMap;
import model.GamingMap;

// TODO: Auto-generated Javadoc
/**
 * The Class DAO.
 */
public abstract class DAO extends AbstractDAO {
	
	/** The sql map size. */
	private static String sqlMapSize = "{call MapSize(?)}";
	
	/** The sql fill map. */
	private static String sqlFillMap = "{call FillMap(?)}";

	/** The ID column index. */
	private static int IDColumnIndex             = 1;
	
	/** The Height column index. */
	private static int HeightColumnIndex         = 2;
	
	/** The Width column index. */
	private static int WidthColumnIndex          = 3;
	
	/** The Diamond counter column index. */
	private static int DiamondCounterColumnIndex = 4;
	
	/** The X column index. */
	private static int XColumnIndex              = 1;
	
	/** The Y column index. */
	private static int YColumnIndex              = 2;
	
	/** The Type column index. */
	private static int TypeColumnIndex           = 4;
	
	/** The IDMAP column index. */
	private static int IDMAPColumnIndex          = 3;

	/**
	 * Gets the level by ID.
	 *
	 * @param levelID the level ID
	 * @return the level by ID
	 * @throws SQLException the SQL exception
	 */
	public static GamingMap getLevelByID(final int levelID) throws SQLException {
		final CallableStatement callStatement = prepareCall(sqlMapSize);
		GamingMap gamingMap = null;

		callStatement.setInt(1, levelID);
		if (callStatement.execute()) {
			final ResultSet result = callStatement.getResultSet();
			if (result.first()) {
				gamingMap = new GamingMap(result.getInt(IDColumnIndex), result.getInt(HeightColumnIndex),
						result.getInt(WidthColumnIndex), result.getInt(DiamondCounterColumnIndex));
			}
			result.close();
		}
		return gamingMap;
	}

	/**
	 * Gets the map filled by ID.
	 *
	 * @param levelID the level ID
	 * @return the map filled by ID
	 * @throws SQLException the SQL exception
	 */
	public static List<FillingMap> getMapFilledByID(final int levelID) throws SQLException {
		final List<FillingMap> objects = new ArrayList<FillingMap>();
		final CallableStatement callStatement = prepareCall(sqlFillMap);
		callStatement.setInt(1, levelID);
		if (callStatement.execute()) {
			final ResultSet result = callStatement.getResultSet();
			for (boolean isResultLeft = result.first(); isResultLeft; isResultLeft = result.next()) {
				objects.add(new FillingMap(result.getInt(XColumnIndex), result.getInt(YColumnIndex),
						result.getInt(IDMAPColumnIndex), result.getInt(TypeColumnIndex)));
			}
			result.close();
		}
		return objects;
	}

}
