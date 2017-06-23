package model.dao;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.FillingMap;
import model.GamingMap;

public abstract class DAO extends AbstractDAO {
    /** The sql query which give us the map's size */
    private static String sqlMapSize = "{call MapSize(?)}";

    /** The sql query which the different object of fill the map */
    private static String sqlFillMap = "{call FillMap(?)}";

    /** The id column index. */
    private static int IDColumnIndex             = 1;
    private static int HeightColumnIndex         = 2;
    private static int WidthColumnIndex          = 3;
    private static int DiamondCounterColumnIndex = 5;
    private static int XColumnIndex              = 1;
    private static int YColumnIndex              = 2;
    private static int TypeColumnIndex           = 4;
    private static int IDMAPColumnIndex          = 3;

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
