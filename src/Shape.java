/**
 * Is the interface containing guidelines for all shape objects.
 * @author : Jason Parker, Quinn Davidson
 * @since : 02/09/2023
 */

public interface Shape {
    /**
     * Calculates volume of shape.
     * @return double containing volume.
     */
    public double volume();

    /**
     * Calculates surface area of shape.
     * @return double containing surface area.
     */
    public double surfaceArea();
}
