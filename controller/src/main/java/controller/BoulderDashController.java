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
    private final IBoulderDashView  view;

    /** The model. */
    private final IBoulderDashModel model;

    /* this is the speed of all the mobile element */
    private int                     speed;

    /*
     * this attribut is the order that the controler receive from the view and
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
    public BoulderDashController(final IBoulderDashView view, final IBoulderDashModel model) {
        super();
        this.view = view;
        this.model = model;
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
    public void play() {
        // TODO Auto-generated method stub
    	while (this.getModel().getMiner().isALive()){
    		Thread.sleep(speed);
    		switch(this.getOrderPile()){
    		case UP:
    			
    			break;
    			
    		case DOWN:
    			
    			break;
    			
    		case RIGHT:
    			
    			break;
    			
    		case LEFT:
    			
    			break;
    			
    		case NOP:
    			default:
    				
    			break;
    		}
    	}
    }

    @Override
    public IOrderPerformer getOrderPerformer() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void orderPerform(UserOrder userOrder) {
        // TODO Auto-generated method stub

    }

    public UserOrder getOrderPile() {
    	return null;
    }

    public void setOrderPile(UserOrder orderPile) {

    }

    public void emptyOrderPile() {

    }
}