package controller;

import model.IBoulderDashModel;
import view.IBoulderDashView;

// TODO: Auto-generated Javadoc
/**
 * The Class BoulderDashController.
 */
public class BoulderDashController implements IBoulderDashController, IOrderPerformer {

	/** The view. */
	private IBoulderDashView view;

	/** The model. */
	private IBoulderDashModel model;

	/** The speed. */
	private final int speed = 350;

	/** The Order pile. */
	private UserOrder OrderPile;

	/**
	 * Instantiates a new boulder dash controller.
	 *
	 * @param view
	 *            the view
	 * @param model
	 *            the model
	 */
	public BoulderDashController(final IBoulderDashView view, final IBoulderDashModel model) {

		this.setView(view);
		this.setModel(model);
		this.emptyOrderPile();
	}

	/**
	 * Empty order pile.
	 */
	public void emptyOrderPile() {
		this.OrderPile = UserOrder.NOP;
	}

	/**
	 * Gets the model.
	 *
	 * @return the model
	 */
	public IBoulderDashModel getModel() {
		return this.model;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see controller.IBoulderDashController#getOrderPerformer()
	 */
	@Override
	public IOrderPerformer getOrderPerformer() {
		return this;
	}

	/**
	 * Gets the order pile.
	 *
	 * @return the order pile
	 */
	public UserOrder getOrderPile() {
		return this.OrderPile;
	}

	/**
	 * Gets the view.
	 *
	 * @return the view
	 */
	public IBoulderDashView getView() {
		return this.view;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see controller.IOrderPerformer#orderPerform(controller.UserOrder)
	 */
	@Override
	public void orderPerform(final UserOrder orderPile) {
		this.setOrderPile(orderPile);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see controller.IBoulderDashController#play()
	 */
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
			// this.getView().notify();
		}

		this.getView().displayMessage("Game over");
	}

	/**
	 * Sets the model.
	 *
	 * @param model
	 *            the new model
	 */
	private void setModel(final IBoulderDashModel model) {
		this.model = model;
	}

	/**
	 * Sets the order pile.
	 *
	 * @param orderPile
	 *            the new order pile
	 */
	public void setOrderPile(final UserOrder orderPile) {
		this.OrderPile = orderPile;
	}

	/**
	 * Sets the view.
	 *
	 * @param view
	 *            the new view
	 */
	private void setView(final IBoulderDashView view) {
		this.view = view;
	}
}