package model.element.motionless;

import model.element.Permeability;
import model.element.Sprite;

public class Wall extends MotionlessElement {
	private static final Sprite SPRITE = new Sprite(/*MettreCaractère*/, /*MettrenomImage*/);

	public Wall() {
		super(SPRITE, Permeability./*NOMPERMEABILITE*/); //mettre permeabilité
		// TODO Auto-generated constructor stub
	}

}
