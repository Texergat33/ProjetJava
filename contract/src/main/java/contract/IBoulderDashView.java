package contract;
import controller.IBoulderDashController;

public interface IBoulderDashView {
	public void displayMessage(String message);
	public void ControllerFacade(IBoulderDashView view, IBoulderDashModel model);
}
