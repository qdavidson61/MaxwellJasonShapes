/**
 * Contains client code testing Shape interface along with its children and grandchildren.
 * @author : Jason Parker, Quinn Davidson
 * @since : 02/09/2023
 */

public class ClientClass {
    public static void main(String[] args) {
        System.out.println("Hello Group Project");

        Cube c = new Cube(6);
        System.out.println(c.surfaceArea());
    }
}
