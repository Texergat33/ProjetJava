package model.element;

// TODO: Auto-generated Javadoc
/**
 * A factory for creating Sprite objects.
 */
public abstract class SpriteFactory {

    /** The monster FAFTW. */
    private static Sprite monsterFAFTW = new Sprite(11, "monster1.png");

    /** The monster SAFTW. */
    private static Sprite monsterSAFTW = new Sprite(6, "monster2.png");

    /** The monster FAR. */
    private static Sprite monsterFAR = new Sprite(10, "monster3.png");

    /** The monster SAR. */
    private static Sprite monsterSAR = new Sprite(7, "monster4.png");

    /** The boulder. */
    private static Sprite boulder = new Sprite(5, "boulder.png");

    /** The diamond front. */
    private static Sprite diamondFront = new Sprite(9, "diamond.png");

    /** The default miner 1. */
    private static Sprite defaultMiner1 = new Sprite(8, "defaultMiner1.png");

    /** The default miner 2. */
    private static Sprite defaultMiner2 = new Sprite(81, "defaultMiner2.png");

    /** The miner up. */
    private static Sprite minerUp = new Sprite(82, "minerUp.png");

    /** The miner up 2. */
    private static Sprite minerUp2 = new Sprite(8, "minerUp2.png");

    /** The miner down 1. */
    private static Sprite minerDown1 = new Sprite(83, "minerDown1.png");

    /** The miner down 2. */
    private static Sprite minerDown2 = new Sprite(84, "minerDown2.png");

    /** The miner left 1. */
    private static Sprite minerLeft1 = new Sprite(85, "minerLeft1.png");

    /** The miner left 2. */
    private static Sprite minerLeft2 = new Sprite(86, "minerLeft2.png");

    /** The miner right 1. */
    private static Sprite minerRight1 = new Sprite(87, "minerRight1.png");

    /** The miner right 2. */
    private static Sprite minerRight2 = new Sprite(88, "minerRight2.png");

    /** The dead miner 1. */
    private static Sprite deadMiner1 = new Sprite(89, "deadMiner1.png");

    /** The dead miner 2. */
    private static Sprite deadMiner2 = new Sprite(810, "deadMiner2.png");

    /** The background. */
    private static Sprite background = new Sprite(2, "background.png");

    /** The ground. */
    private static Sprite ground = new Sprite(3, "ground.png");

    /** The wall. */
    private static Sprite wall = new Sprite(4, "wall.png");

    /** The iron wall. */
    private static Sprite ironWall = new Sprite(1, "IronWall.png");

    /**
     * Creates a new Sprite object.
     *
     * @return the sprite
     */
    public static Sprite createBoulder() {
        boulder.loadImage();
        return boulder;
    }

    /**
     * Creates a new Sprite object.
     *
     * @return the sprite
     */
    public static Sprite createBackground() {
        background.loadImage();
        return background;
    }

    /**
     * Creates a new Sprite object.
     *
     * @return the sprite
     */
    public static Sprite createGround() {
        ground.loadImage();
        return ground;
    }

    /**
     * Creates a new Sprite object.
     *
     * @return the sprite
     */
    public static Sprite createWall() {
        wall.loadImage();
        return wall;
    }

    /**
     * Creates a new Sprite object.
     *
     * @return the sprite
     */
    public static Sprite createDiamond() {
        diamondFront.loadImage();
        return diamondFront;

    }

    /**
     * Creates a new Sprite object.
     *
     * @return the sprite
     */
    public static Sprite createIronWall() {
        ironWall.loadImage();
        return ironWall;

    }

    /**
     * Creates a new Sprite object.
     *
     * @param minerPosition
     *            the miner position
     * @return the sprite
     */
    public static Sprite createMiner(final String minerPosition) {

        switch (minerPosition) {
        case "defaultMiner1":
            defaultMiner1.loadImage();
            return defaultMiner1;
        case "defaultMiner2":
            defaultMiner2.loadImage();
            return defaultMiner2;
        case "minerUp":
            minerUp.loadImage();
            return minerUp;

        case "minerUp2":
            minerUp2.loadImage();
            return minerUp2;

        case "minerDown1":
            minerDown1.loadImage();
            return minerDown1;
        case "minerDown2":
            minerDown2.loadImage();
            return minerDown2;
        case "minerLeft1":
            minerLeft1.loadImage();
            return minerLeft1;
        case "minerLeft2":
            minerLeft2.loadImage();
            return minerLeft2;
        case "minerRight1":
            minerRight1.loadImage();
            return minerRight1;
        case "minerRight2":
            minerRight2.loadImage();
            return minerRight2;
        case "deadMiner1":
            deadMiner1.loadImage();
            return deadMiner1;
        case "deadMiner2":
            deadMiner2.loadImage();
            return deadMiner2;
        default:
            defaultMiner1.loadImage();
            return defaultMiner1;
        }
    }

    /**
     * Creates a new Sprite object.
     *
     * @param monsterName
     *            the monster name
     * @return the sprite
     */
    public static Sprite createMonster(final String monsterName) {
        switch (monsterName) {
        case "monsterFAFTW":
            monsterFAFTW.loadImage();
            return monsterFAFTW;
        case "monsterSAFTW":
            monsterSAFTW.loadImage();
            return monsterSAFTW;
        case "monsterFAR":
            monsterFAR.loadImage();
            return monsterFAR;
        case "monsterSAR":
            monsterSAR.loadImage();
            return monsterSAR;
        default:
            monsterSAR.loadImage();
            return monsterSAR;
        }
    }

    /** The mobiles sprites. */
    public Sprite[] mobilesSprites = { monsterFAFTW, monsterSAFTW, monsterFAR, monsterSAR, boulder, diamondFront,
            defaultMiner1, defaultMiner2, minerUp, minerDown1, minerDown2, minerLeft1, minerLeft2, minerRight1,
            minerRight2, deadMiner1, deadMiner2 };
}
