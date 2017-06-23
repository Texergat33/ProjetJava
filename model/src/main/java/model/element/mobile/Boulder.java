package model.element.mobile;

import java.awt.Point;

import model.IMap;
import model.element.Permeability;
import model.element.Sprite;

public class Boulder extends Mobile {
    private static final Sprite SPRITE = new Sprite(5, "boulder.png");

    public Boulder(final Point position, final Sprite sprite, final IMap map, final Permeability permeability) {
        super(position, SPRITE, map, permeability);
        // TODO Auto-generated constructor stub
    }

    private void shift(final int direction) {
        int test = 0;
        switch (direction) {
        case 1:
            test = this.getX() + 1;

        case 2:
            test = this.getX() - 1;
        }
        if ((this.getMap().getOnTheMapXY(test, this.getY()).getPermeability() == Permeability.PENETRABLEFORBOULDER)) {
            switch (direction) {
            case 1:
                this.moveRight();
            case 2:
                this.moveLeft();
            }

        }

    }

}
