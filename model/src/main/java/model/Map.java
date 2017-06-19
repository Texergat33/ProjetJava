import java.util.Observable;

import model.element.IElement;

public class Map implements IMap {
	private int width;
	private int height;
	private int level;
	private IElement onTheMap[][];

	public Map(int level){

	}

	@Override
	public int getHeight() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Observable getObservable() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IElement[][] getOnTheMapXY(int x, int y) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getWidth() {
		// TODO Auto-generated method stub
		return 0;
	}

	private void loadLevel(){

	}

	private void setHeight(int height) {
		this.height = height;
	}

	@Override
	public void setMobileHasChanged() {
		// TODO Auto-generated method stub

	}

	private void setOnTheMapXY(IElement[][] onTheMap) {
		this.onTheMap = onTheMap;
	}

	private void setWidth(int width) {
		this.width = width;
	}
}
