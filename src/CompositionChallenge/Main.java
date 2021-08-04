package CompositionChallenge;
// Create a single room of a house using composition.
// Think about the things that should be included in the room.
// Maybe physical parts of the house but furniture as well.
// Add at least one method to access an object via a getter and
// then that objects public method to hide the object e.g. not using a getter
// but to access the object used in composition within the main class

public class Main {
    public static void main(String[] args) {
        Wall Wall1 = new Wall("West");
        Wall Wall2 = new Wall("East");
        Wall Wall3 = new Wall("South");
        Wall Wall4 = new Wall("North");

        Ceiling ceiling = new Ceiling(12,55);

        Bed bed = new Bed("Modern", 4, 3 ,2 ,1);

        Lamp lamp = new Lamp("Classic", false, 75);

        Bedroom bedroom = new Bedroom("Ryan's",Wall1, Wall2, Wall3, Wall4, ceiling, bed, lamp);
        bedroom.makeBed();

        bedroom.getLamp().turnOn();
    }
}
