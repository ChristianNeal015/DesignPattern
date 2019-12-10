package creationaldesignpattern.simpleFactory;

import creationaldesignpattern.simpleFactory.Door;

public class WoodenDoor implements Door {
    protected float width;
    protected float height;

    public WoodenDoor (float width, float height){
        this.height = height;
        this.width = width;
    }
    public float getWidth() {
        return this.width;
    }

    public float getHeight() {
        return this.height;
    }
}
