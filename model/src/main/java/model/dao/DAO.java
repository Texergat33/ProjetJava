package model.dao;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.FillingMap;
import model.MapDimensions;

/**
 * <h1>The Class ExampleDAO.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public abstract class DAO extends AbstractDAO {
	/** The sql query which give us the map's size */
	private static String sqlMapSize = "{call MapSize(?)}";

	/** The sql query which the different object of fill the map */
	private static String sqlFillMap = "{call FillMap(?)}";

	/** The id column index. */
	private static int idColumnIndex     = 1;
	private static int HeightColumnIndex = 2;
	private static int WidthColumnIndex  = 3;
	private static int XColumnIndex      = 1;
	private static int YColumnIndex      = 2;
	private static int TypeColumnIndex   = 4;
	private static int IDMAPColumnIndex  = 3;

	/*
	 * Once we have the length and the width of our map, we can use the method
	 * who will give us the position x and y with the type.
	 */
	public static List<FillingMap> getMapFilled(final int id) throws SQLException {

		final List<FillingMap> objects = new ArrayList<FillingMap>();
		final CallableStatement callStatement = prepareCall(sqlFillMap);
		callStatement.setInt(1, id);
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

	/**
	 * This first method will send us the width and the length of the map. We
	 * get this values in a Array list. The Array list type is a Map.
	 *
	 */
	public static MapDimensions getMapSize(final int id) throws SQLException {
		final CallableStatement callStatement = prepareCall(sqlMapSize);
		MapDimensions dimension = null;
		callStatement.setInt(1, id);
		if (callStatement.execute()) {
			final ResultSet result = callStatement.getResultSet();
			if (result.first()) {
				dimension = new MapDimensions(result.getInt(idColumnIndex), result.getInt(HeightColumnIndex),
						result.getInt(WidthColumnIndex));
			}
			result.close();
		}
		return dimension;
	}

}
