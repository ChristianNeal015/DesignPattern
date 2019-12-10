package creationaldesignpattern.abstractFactory;

public class Main {
    public static void main(String[] args) {
        WoodenDoorFactory woodenDoorFactory = new WoodenDoorFactory();
        Door d1 = woodenDoorFactory.makeDoor();
        DoorFittingExpert doorFittingExpert = woodenDoorFactory.makeFittingExpert();
        d1.getDescription();
        doorFittingExpert.getDescription();


        IronDoorFactory ironDoorFactory = new IronDoorFactory();
        Door d2 = ironDoorFactory.makeDoor();
        DoorFittingExpert doorFittingExpert1 = ironDoorFactory.makeFittingExpert();
        d2.getDescription();
        doorFittingExpert1.getDescription();
    }
}
