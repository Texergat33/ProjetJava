package model.element.mobile;

import model.element.Permeability;

public class BehaviorMiner extends BehaviorDoSomething {
    @Override
    public void doSomething() {
        final int x = this.mobile.getX();
        final int y = this.mobile.getY();

        switch (getOrderPile) {
        case UP:
            if (this.mobile.getMap().getOnTheMapXY(x + 1, y).getPermeability() == Permeability.PENETRABLEFOREVERYONE) {
                this.mobile.moveUp();
            } else if (this.mobile.getMap().getOnTheMapXY(x + 1, y)
                    .getPermeability() == Permeability.BLOCKINGFOREVERYONE) {
                this.mobile.doNothing();
            } else if (this.mobile.getMap().getOnTheMapXY(x + 1, y).getPermeability() == Permeability.COLLECTABLE) {
                this.mobile.position(x + 1, y).collect();
                this.mobile.moveUp();
            } else if (this.mobile.getMap().getOnTheMapXY(x + 1, y).getPermeability() == Permeability.KILLABLE) {
                this.mobile.die();

            } else {
                this.mobile.doNothing();
            }
            break;
        case Down:
            if (this.mobile.getMap().getOnTheMapXY(x - 1, y).getPermeability() == Permeability.PENETRABLEFOREVERYONE) {
                this.mobile.moveDown();
            } else if (this.mobile.getMap().getOnTheMapXY(x - 1, y)
                    .getPermeability() == Permeability.BLOCKINGFOREVERYONE) {
                this.mobile.doNothing();
            } else if (this.mobile.getMap().getOnTheMapXY(x - 1, y).getPermeability() == Permeability.COLLECTABLE) {
                this.mobile.position(x - 1, y).collect();
                this.mobile.moveDown();

            } else if (this.mobile.getMap().getOnTheMapXY(x - 1, y).getPermeability() == Permeability.KILLABLE) {
                this.mobile.die();

            } else {
                this.mobile.doNothing();
            }
            break;
        case Right:
            if (this.mobile.getMap().getOnTheMapXY(x, y + 1).getPermeability() == Permeability.PENETRABLEFOREVERYONE) {
                this.mobile.moveRight();
            } else if (this.mobile.getMap().getOnTheMapXY(x, y + 1)
                    .getPermeability() == Permeability.BLOCKINGFOREVERYONE) {
                this.mobile.doNothing();
            } else if (this.mobile.getMap().getOnTheMapXY(x, y + 1).getPermeability() == Permeability.COLLECTABLE) {
                this.mobile.position(x, y + 1).collect();
                this.mobile.moveRight();

            } else if (this.mobile.getMap().getOnTheMapXY(x, y + 1).getPermeability() == Permeability.KILLABLE) {
                this.mobile.die();

            } else if (this.mobile.getMap().getOnTheMapXY(x, y + 1).getPermeability() == Permeability.PUSHABLE) {
                this.mobile.position(x, y + 1).shift(1);
                this.mobile.moveRight();
            } else {
                this.mobile.doNothing();
            }
            break;
        case Left:
            if (this.mobile.getMap().getOnTheMapXY(x, y - 1).getPermeability() == Permeability.PENETRABLEFOREVERYONE) {
                this.mobile.moveLeft();
            } else if (this.mobile.getMap().getOnTheMapXY(x, y - 1)
                    .getPermeability() == Permeability.BLOCKINGFOREVERYONE) {
                this.mobile.doNothing();
            } else if (this.mobile.getMap().getOnTheMapXY(x, y - 1).getPermeability() == Permeability.COLLECTABLE) {
                this.mobile.position(x, y - 1).collect();
                this.mobile.moveLeft();

            } else if (this.mobile.getMap().getOnTheMapXY(x, y - 1).getPermeability() == Permeability.KILLABLE) {
                this.mobile.die();

            } else if (this.mobile.getMap().getOnTheMapXY(x, y - 1).getPermeability() == Permeability.PUSHABLE) {
                this.mobile.position(x, y - 1).shift(2);
                this.mobile.moveLeft();
            } else {
                this.mobile.doNothing();
            }
            break;

        }

    }
}
