package controller;

import model.IBoulderDashModel;
import view.IBoulderDashView;

public class BoulderDashController implements IBoulderDashController, IOrderPerformer {
	private IBoulderDashView view;
	private IBoulderDashModel model;
	private int speed = 350;
	private UserOrder OrderPile;

	public BoulderDashController(final IBoulderDashView view, final IBoulderDashModel model) {

		this.setView(view);
		this.setModel(model);
		this.emptyOrderPile();
	}

	public void emptyOrderPile() {
		this.OrderPile = UserOrder.NOP;
	}

	public IBoulderDashModel getModel() {
		return this.model;
	}

	@Override
	public IOrderPerformer getOrderPerformer() {
		return this;
	}

	public UserOrder getOrderPile() {
		return this.OrderPile;
	}

	public IBoulderDashView getView() {
		return this.view;
	}

	@Override
	public void orderPerform(final UserOrder orderPile) {
		this.setOrderPile(orderPile);
	}

	@Override
	public void play() throws InterruptedException {
		while (this.getModel().getMiner().isAlive()) {
			Thread.sleep(this.speed);
			switch (this.getOrderPile()) {
			case UP:
				this.getModel().getMiner().moveUp();
				break;

			case DOWN:
				this.getModel().getMiner().moveDown();
				break;

			case RIGHT:
				this.getModel().getMiner().moveRight();
				break;

			case LEFT:
				this.getModel().getMiner().moveLeft();
				break;

			case NOP:
			default:
				this.getModel().getMiner().doNothing();
				;
				break;
			}
			this.emptyOrderPile();
			this.getView().notify();
		}

		this.getView().displayMessage("Game over");
	}

	private void setModel(final IBoulderDashModel model) {
		this.model = model;
	}

	public void setOrderPile(final UserOrder orderPile) {
		this.OrderPile = orderPile;
	}

	private void setView(final IBoulderDashView view) {
		this.view = view;
	}
}