/**
 * This class represents a traffic light (say, hanging above an intersection).
 *
 * @author Rex Kenyon
 */
public class TrafficLight {

    //defining a "small" (enumerated) data type
    public enum LightColor {
        RED,
        GREEN,
        YELLOW
    }

    // Field(s)
    private LightColor currentColor; // the current color can be red, green, or yellow

    public TrafficLight(LightColor startingColor) {
        // validateLightColor(startingColor);
        this.currentColor = startingColor;
    }

    public void setCurrentColor(LightColor newColor) {
        // validateLightColor(newColor);
        this.currentColor = newColor;
    }

    // Mutator Method
    public void gotoNextColor() {
        // "Red" -> "Green"
        // "Yellow" -> "Red"
        // "Green" -> "Yellow"

        currentColor = switch (currentColor) {
            case RED -> LightColor.GREEN;
            case YELLOW -> LightColor.RED;
            case GREEN -> LightColor.YELLOW;
        };
    }

    public LightColor getCurrentColor() {
        return currentColor;
    }

//    private void validateLightColor(String color) {
//        if (!(color.equalsIgnoreCase("red") ||
//                color.equalsIgnoreCase("green") ||
//                color.equalsIgnoreCase("yellow"))) {
//            // stop the program and tell the developer
//            // that they passed in an illegal traffic light color
//            throw new IllegalArgumentException("Invalid traffic light color");
//        }
//    }

    public String toString() {
        return "a traffic light: " + currentColor;
    }
}
