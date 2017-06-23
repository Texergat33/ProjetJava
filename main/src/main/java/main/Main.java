package main;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import controller.BoulderDashController;
import model.BoulderDashModel;
import model.Map;
import model.element.IElement;
import model.element.Permeability;
import model.element.Sprite;
import model.element.mobile.Miner;
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
	 * @throws IOException
	 * @throws InterruptedException
	 */
	public static void main(final String[] args) throws IOException, InterruptedException, SQLException {
		final BoulderDashController controller = new BoulderDashController(new BoulderDashView(new Map(1),
				new Miner(0, 0, new Sprite(1, "defaultMiner1"), new Map(1), Permeability.KILLABLE),
				new ArrayList<IElement>()), new BoulderDashModel(1, 2, 3));

		controller.play();
	}

}
