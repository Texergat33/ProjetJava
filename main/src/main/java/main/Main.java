package main;

import java.io.IOException;
import java.sql.SQLException;

import controller.BoulderDashController;
import model.BoulderDashModel;
import model.IBoulderDashModel;
import view.BoulderDashView;
import view.IBoulderDashView;

public abstract class Main {
	private static int LEVELID = 1;

	public static void main(final String[] args) throws IOException, InterruptedException, SQLException {
		final IBoulderDashModel model = new BoulderDashModel(Main.LEVELID);
		final IBoulderDashView view = new BoulderDashView(model.getMap());
		final BoulderDashController controller = new BoulderDashController(view, model);
		view.setOrderPerformer(controller.getOrderPerformer());
		controller.play();
	}
}
