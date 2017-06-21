package model.dao;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * <h1>The Class ExampleDAO.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public abstract class DAO extends AbstractDAO {

	/** The sql query which give us the map's size */
	private static String sqlMapSize      = "{call FillMap(?)}";

	/** The sql query which the different object of fill the map */
	private static String sqlFillMap      = "{call FillMap(?)}";

	/** The id column index. */
	private static int    idColumnIndex   = 1;

	/** The name column index. */
	private static int    nameColumnIndex = 2;

	/**
	 * This first method will send us the wight and the lenght of the map. We
	 * get this values in a Array list. The Array list type is a Map.
	 *
	 */
	public static List<Map> getMapSize(int id) throws SQLException {
		final ArrayList<Map> map = new ArrayList<Map>();
		final CallableStatement callStatement = prepareCall(sqlMapSize);
		callStatement.setInt(1, id);
		if (callStatement.execute()) {
			final ResultSet result = callStatement.getResultSet();

			for (boolean isResultLeft = result.first(); isResultLeft; isResultLeft = result.next()) {
				map.add(new Map (result.getInt(idColumnIndex), result.getString(nameColumnIndex)));
			}
			result.close();
		}
		return map;
	}
}
