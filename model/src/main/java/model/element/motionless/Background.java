package model.element.motionless;

import model.element.Permeability;
import model.element.Sprite;

public class Background extends MotionlessElement {
	private static final Sprite SPRITE = new Sprite(/*MettreCaract�re*/, /*MettrenomImage*/);

	public Background() {
		super(SPRITE, Permeability./*NOMPERMEABILITE*/); //mettre permeabilit�
		// TODO Auto-generated constructor stub
	}

}
