package model.element.motionless;

import model.element.Permeability;
import model.element.Sprite;

public class Wall extends MotionlessElement {
	private static final Sprite SPRITE = new Sprite(/*MettreCaract�re*/, /*MettrenomImage*/);

	public Wall() {
		super(SPRITE, Permeability./*NOMPERMEABILITE*/); //mettre permeabilit�
		// TODO Auto-generated constructor stub
	}

}
