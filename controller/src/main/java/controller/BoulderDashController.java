package controller;

import model.IBoulderDashModel;
import view.IBoulderDashView;
import controller.UserOrder;

/**
 * <h1>The Class ControllerFacade provides a facade of the Controller
 * component.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public class BoulderDashController implements IBoulderDashController, IOrderPerformer {

    /** The view. */
    private IBoulderDashView  view;

    /** The model. */
    private IBoulderDashModel model;

    /* this is the speed of all the mobile element */
    private int                     speed;

    /*
     * this attribute is the order that the controller receive from the view and
     * will send to the model. This is the aggregation with the enum UserOrder
     */
    private UserOrder               OrderPile;

    /**
     * Instantiates a new controller facade.
     *
     * @param view
     *            the view
     * @param model
     *            the model
     */
  
    /*
     * the main only call the controller who instanciate the view and the model
     */
    public BoulderDashController(IBoulderDashView view, IBoulderDashModel model) {
        this.setView(view);
        this.setModel(model);
        this.emptyOrderPile();
    }

    private void setModel(IBoulderDashModel model) {
		// TODO Auto-generated method stub
    	  this.model = model;
	}

	private void setView(IBoulderDashView view) {
		// TODO Auto-generated method stub
		  this.view = view;
	}

	/**
     * Start.
     *
     * @throws SQLException
     *             the SQL exception
     */
    /*
     * the method start is call in the main. It call the view for the display
     * the view call the model who call the query
     */
    /*
     * public void start() throws SQLException {
     * this.getView().displayMessage(this.getModel().getExampleById(1).toString(
     * )); // Display exemple 1, by ID, We call the view and we display the
     * message // We send a id
     *
     * this.getView().displayMessage(this.getModel().
     * getExampleByName("Example 2").toString()); // Display exemple 2, by Name,
     * We call the view and we display the // message
     *
     * final List<Example> examples = this.getModel().getAllExamples(); // we
     * put in a arraylist the result of the exemple 3 final StringBuilder
     * message = new StringBuilder(); // create a string list of 16 caractere
     * empty // a.append(" bar); for (final Example example : examples) {
     * message.append(example); message.append('\n'); }
     * this.getView().displayMessage(message.toString()); }
     */

    /**
     * Gets the view.
     *
     * @return the view
     */
    public IBoulderDashView getView() {
        return this.view;
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
     * play is the methode who is going to start the game. This is the methode
     * who is called in the main
     */
    @Override
    public void play() throws InterruptedException {
        // TODO Auto-generated method stub
    	while (this.getModel().getMiner().isALive()){
    		Thread.sleep(speed);
    		switch(this.getOrderPile()){
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
    				this.getModel().getMiner().doNothing();;
    			break;
    		}
    		this.emptyOrderPile();
    	}
    }

    @Override
    public IOrderPerformer getOrderPerformer() {
        // TODO Auto-generated method stub
        return this;
    }

    @Override
    public void orderPerform(UserOrder orderPile) {
        // TODO Auto-generated method stub
    	this.setOrderPile(orderPile);
    }

    public UserOrder getOrderPile() {
    	return this.OrderPile;
    }

    public void setOrderPile(UserOrder orderPile) {
    	this.OrderPile = orderPile;
    }

    public void emptyOrderPile() {
    	this.OrderPile = UserOrder.NOP;
    }
}