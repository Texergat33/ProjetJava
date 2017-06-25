package main;

import java.io.IOException;
import java.sql.SQLException;

import controller.BoulderDashController;
import model.BoulderDashModel;
import model.IBoulderDashModel;
import view.BoulderDashView;
import view.IBoulderDashView;

// TODO: Auto-generated Javadoc
/**
 * The Class Main.
 */
public abstract class Main {

    /** The levelid. */
    private static int LEVELID = 1;

    /**
     * The main method.
     *
     * @param args
     *            the arguments
     * @throws IOException
     *             Signals that an I/O exception has occurred.
     * @throws InterruptedException
     *             the interrupted exception
     * @throws SQLException
     *             the SQL exception
     */
    public static void main(final String[] args) throws IOException, InterruptedException, SQLException {
        final IBoulderDashModel model = new BoulderDashModel(Main.LEVELID);
        final IBoulderDashView view = new BoulderDashView(model.getMap());
        final BoulderDashController controller = new BoulderDashController(view, model);
        view.setOrderPerformer(controller.getOrderPerformer());
        controller.play();
    }
}
