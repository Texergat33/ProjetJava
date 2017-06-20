package main;

import java.sql.SQLException;

import controller.BoulderDashController;
import model.BoulderDashModel;
import view.BoulderDashView;

/**
 * <h1>The Class Main.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public abstract class Main {

    /**
     * The main method.
     *
     * @param args
     *            the arguments
     */
    public static void main(final String[] args) {
        final BoulderDashController controller = new BoulderDashController(new BoulderDashView(),
                new BoulderDashModel(1, 2, 3));

        try {
            controller.play();
        } catch (final SQLException exception) {
            exception.printStackTrace();
        }
    }

}
