package model;

import java.util.List;

import model.element.mobile.IMobile;

public interface IBoulderDashModel {
	public IMap getMap();

	public List<FillingMap> getMapFilled(final int id);

	public MapDimensions getMapSize(final int id);

	public IMobile getMiner();
}
