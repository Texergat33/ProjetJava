package model.element;

import model.element.mobile.Boulder;
import model.element.mobile.Diamond;
import model.element.mobile.Miner;

public class SpriteFactory {
	private static Monster monster = new Monster();
	private static Boulder boulder = new Boulder(null, null, null, null);
	private static Miner miner = new Miner(null, null, null, null);
	private static Diamond diamond = new Diamond(null, null, null, null);

	private static Sprite[] sprites = {
			monster,
			boulder,
			miner,
			diamond
	};
}
