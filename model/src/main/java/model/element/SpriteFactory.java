package model.element;

import model.element.mobile.Monster;

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

	}

	public Sprite createDiamond(){

	}

	public Sprite createMiner(){

	}

	public Sprite createMonster(){
		switch()
	}
}
