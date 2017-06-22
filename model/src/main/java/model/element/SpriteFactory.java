package model.element;

public abstract class SpriteFactory {
	private static Sprite	monsterFAFTW = new Sprite(0, null);
	private static Sprite	monsterSAFTW = new Sprite(0, null);
	private static Sprite	monsterFAR = new Sprite(0, null);
	private static Sprite	monsterSAR = new Sprite(0, null);
	private static Sprite	boulder = new Sprite(5, "boulder.png");
	private static Sprite	diamondFront = new Sprite(9, "diamond.png");
	// private static Sprite diamondFront2 = new Sprite();
	private static Sprite	defaultMiner1 = new Sprite(8, "defaultMiner1.png");
	private static Sprite	defaultMiner2 = new Sprite(8, "defaultMiner2.png");
	private static Sprite	minerUp1 = new Sprite(8, "minerUp.png");
	// private static Sprite minerUp2 = new Sprite(minerUp2.png);
	private static Sprite	minerDown1 = new Sprite(8, "minerDown1.png");
	private static Sprite	minerDown2 = new Sprite(8, "minerDown2.png");
	private static Sprite	minerLeft1 = new Sprite(8, "minerLeft1.png");
	private static Sprite	minerLeft2 = new Sprite(8, "minerLeft2.png");
	private static Sprite	minerRight1 = new Sprite(8, "minerRight1.png");
	private static Sprite	minerRight2 = new Sprite(8, "minerRight2.png");
	private static Sprite	deadMiner1 = new Sprite(8, "deadMiner1");
	private static Sprite	deadMiner2 = new Sprite(8, "deadMiner2");

	public static Sprite createBoulder() {
		return boulder;
	}

	public static Sprite createDiamond(int front) {
		switch (front) {
		case 1:
			return diamondFront;
			/*
			 * case 2: return diamondFront2; break;
			 */
			/*
			 * default: return diamondFront2;
			 */
		default:
			return diamondFront;
		}
	}

	public static Sprite createMiner(String minerPosition) {
		switch (minerPosition) {
		case "defaultMiner1":
			return defaultMiner1;
		case "defaultMiner2":
			return defaultMiner2;
		case "minerUp1":
			return minerUp1;
			/*
			 * case "minerUp2": return minerUp2; break;
			 */
		case "minerDown1":
			return minerDown1;
		case "minerDown2":
			return minerDown2;
		case "minerLeft1":
			return minerLeft1;
		case "minerLeft2":
			return minerLeft2;
		case "minerRight1":
			return minerRight1;
		case "minerRight2":
			return minerRight2;
		case "deadMiner1":
			return deadMiner1;
		case "deadMiner2":
			return deadMiner2;
		default:
			return defaultMiner1;
		}
	}

	public static Sprite createMonster(String monsterName) {
		switch (monsterName) {
		case "monsterFAFTW":
			return monsterFAFTW;
		case "monsterSAFTW":
			return monsterSAFTW;
		case "monsterFAR":
			return monsterFAR;
		case "monsterSAR":
			return monsterSAR;
		default:
			return monsterSAR;
		}
	}

	public Sprite[] mobilesSprites = {monsterFAFTW, monsterSAFTW, monsterFAR, monsterSAR,
			boulder, diamondFront, defaultMiner1, defaultMiner2, minerUp1, minerDown1,
			minerDown2, minerLeft1, minerLeft2, minerRight1, minerRight2, deadMiner1, deadMiner2};
}
