package model;

public class FillingMap {
	private int pictureID;
	public int x;
	public int y;
	public int objectType;

	public FillingMap(final int x, final int y, final int pictureID, final int objectType) {
		this.pictureID = pictureID;
		this.x = x;
		this.y = y;
		this.objectType = objectType;
	}

	public int getObjectType() {
		return this.objectType;
	}

	public int getPictureID() {
		return this.pictureID;
	}

	public int getX() {
		return this.x;
	}

	public int getY() {
		return this.y;
	}

	public void setObjectType(int objectType) {
		this.objectType = objectType;
	}

	public void setPictureID(int pictureID) {
		this.pictureID = pictureID;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}
}
