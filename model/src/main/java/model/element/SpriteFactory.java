package model.element;

public class SpriteFactory {
	private static Sprite monsterFAFTW = new Sprite();
	private static Sprite monsterSAFTW = new Sprite();
	private static Sprite monsterFAR = new Sprite();
	private static Sprite monsterSAR = new Sprite();
	private static Sprite boulder = new Sprite();
	private static Sprite diamondFront1 = new Sprite();
	private static Sprite diamondFront2 = new Sprite();
	private static Sprite defaultMiner1 = new Sprite();
	private static Sprite defaultMiner2 = new Sprite();
	private static Sprite minerUp1 = new Sprite();
	private static Sprite minerUp2 = new Sprite();
	private static Sprite minerDown1 = new Sprite();
	private static Sprite minerDown2 = new Sprite();
	private static Sprite minerLeft1 = new Sprite();
	private static Sprite minerLeft2 = new Sprite();
	private static Sprite minerRight1 = new Sprite();
	private static Sprite minerRight2 = new Sprite();
	private static Sprite deadMiner1 = new Sprite();
	private static Sprite deadMiner2 = new Sprite();

	private static Sprite[] sprites = {
			monsterFAFTW, monsterSAFTW, monsterFAR, monsterSAR,
			boulder,
			diamondFront1, diamondFront2,
			defaultMiner1, defaultMiner2,
			minerUp1, minerUp2, minerDown1, minerDown2,
			minerLeft1, minerLeft2, minerRight1, minerRight2,
			deadMiner1, deadMiner2
	};

	public Sprite createBoulder(){
		return boulder;
	}

	public Sprite createDiamond(int front){
		switch(front){
		case 1:
			return diamondFront1;
			break;
		case 2:
			return diamondFront2;
			break;
		default :
			return diamondFront1;
		}
	}

	public Sprite createMiner(String minerPosition){
		switch(minerPosition)
	case "defaultMiner1":
		return defaultMiner1;
		break;
	case "defaultMiner2":
		return defaultMiner2;
		break;
	case "minerUp1":
		return minerUp1;
		break;
	case "minerUp2":
		return minerUp2;
		break;
	case "minerDown1":
		return minerDown1;
		break;
	case "minerDown2":
		return minerDown2;
		break;
	case "minerLeft1":
		return minerLeft1;
		break;
	case "minerLeft2":
		return minerLeft2;
		break;
	case "minerRight1":
		return minerRight1;
		break;
	case "minerRight2":
		return minerRight2;
		break;
	case "deadMiner1":
		return deadMiner1;
		break;
	case "deadMiner2":
		return deadMiner2;
		break;
	default:
		return defaultMiner1;
	}

	public Sprite createMonster(String monsterName){
		switch(monsterName){
		case "monsterFAFTW":
			return monsterFAFTW;
			break;
		case "monsterSAFTW":
			return monsterSAFTW;
			break;
		case "monsterFAR":
			return monsterFAR;
			break;
		case "monsterSAR":
			return monsterSAR;
			break;
		default:
			return monsterSAR;
			break;
		}
	}
}
