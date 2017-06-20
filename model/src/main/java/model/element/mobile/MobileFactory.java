package model.element.mobile;

public class MobileFactory {
	private static Monster	monsterFAFTW;
	private static Monster	monsterSAFTW;
	private static Monster	monsterFAR;
	private static Monster	monsterSAR;
	private static Boulder	boulder;
	private static Diamond	diamondFront;
	// private static Sprite diamondFront2 = new Sprite();
	private static Miner	defaultMiner1;
	private static Miner	defaultMiner2;
	private static Miner	minerUp1;
	// private static Sprite minerUp2 = new Sprite(minerUp2.png);
	private static Miner	minerDown1;
	private static Miner	minerDown2;
	private static Miner	minerLeft1;
	private static Miner	minerLeft2;
	private static Miner	minerRight1;
	private static Miner	minerRight2;
	private static Miner	deadMiner1;
	private static Miner	deadMiner2;

	private static Mobile[]	mobilesElements	= { monsterFAFTW, monsterSAFTW, monsterFAR, monsterSAR, boulder,
			diamondFront, /* diamondFront2, */ defaultMiner1, defaultMiner2, minerUp1, /* minerUp2, */ minerDown1,
			minerDown2, minerLeft1, minerLeft2, minerRight1, minerRight2, deadMiner1, deadMiner2 };

	public static Mobile createBoulder() {
		return boulder;
	}

	public static Mobile createDiamond(int front) {
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
			return null;

		}
	}

	public static Mobile createMiner(String minerPosition) {
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

	public static Mobile createMonster(String monsterName) {
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

	public static Mobile getElementFromFileSymbol(char fileSymbol) {
		for (Mobile mobileElement : mobilesElements) {
			if (mobileElement.getSprite().getConsoleImage() == fileSymbol) {
				return mobileElement;
			}
		}
		return null;
	}
}
