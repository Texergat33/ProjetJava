package main;

import java.io.IOException;
import java.sql.SQLException;

import controller.BoulderDashController;
import model.BoulderDashModel;
import model.IBoulderDashModel;
import view.BoulderDashView;
import view.IBoulderDashView;

/**
 * <h1>The Class Main.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public abstract class Main {
    private static int LEVELNAME = 1;

    /**
     * The main method.
     *
     * @param args
     *            the arguments
     * @throws IOException
     * @throws InterruptedException
     */
    public static void main(final String[] args) throws IOException, InterruptedException, SQLException {
        final IBoulderDashModel model = new BoulderDashModel(Main.LEVELNAME);
        System.out.println("cc");
        final IBoulderDashView view = new BoulderDashView(model.getMap());
        final BoulderDashController controller = new BoulderDashController(view, model);
        view.setOrderPerformer(controller.getOrderPerformer());

        controller.play();
    }

}
