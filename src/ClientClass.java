/**
 * Contains client code testing Shape interface along with its children and grandchildren.
 * @author : Jason Parker, Quinn Davidson
 * @since : 02/09/2023
 * @version : 1.0
 */

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.text.DecimalFormat;
public class ClientClass {

    //Quinn's super cool research idea to round decimals to the nearest hundredth without truncating them.
    public static final DecimalFormat df = new DecimalFormat("0.00");
    public static void main(String[] args) {
            System.out.println("Hello Dr. J, Welcome to our shapes project, this is our client class, and it " +
                "from here, you can find the volume of almost any 3-D shape.\nWe have examples below. Enjoy! \n");

        //Cube:
        //Cube only takes one parameter called side, because all the side of a cube are equal. No need for redundancy
            Cube cu = new Cube(4);
            System.out.println("Volume of Cube 'cu': " + df.format(cu.volume()) + " units cubed.");
            System.out.println("Surface Area of Cube 'cu': " + df.format(cu.surfaceArea()) + " units squared.");
            System.out.println();


        //Cone:
            Cone b = new Cone(5, 5);
            System.out.println("Volume of Cone 'b':  " + df.format(b.volume()) + " units squared.");
            System.out.println("Surface Area of cone 'b': " + df.format(b.surfaceArea()) + " units cubed.");
            System.out.println();

        //Sphere:
        //NOTE: Sphere only takes radius, because you only need the radius to find the volume & SA of a sphere!
            Sphere s = new Sphere(6);
            System.out.println("Surface Area of Sphere 's': " + df.format(s.surfaceArea()) + " units squared.");
            System.out.println("Volume of Sphere 's': " + df.format(s.volume()) + " units cubed.");
            System.out.println();

        //Cylinder:
            Cylinder c = new Cylinder(7, 6);
            System.out.println("Volume of Cylinder 'c': " + df.format(c.volume()) + " units cubed.");
            System.out.println("Surface Area of Cylinder 'c': " + df.format(c.surfaceArea()) + " units squared.");
            System.out.println();

        //Rectangular Prism:
        RectangularPrism rp = new RectangularPrism(6, 7, 4);
            System.out.println("Volume of Rectangular prism 'rp':  " + df.format(rp.volume()) + "units cubed");
            System.out.println("Surface Area of Rectangular Prism 'rp': " + df.format(rp.surfaceArea()) + " units squared.");
            System.out.println();

        //Triangular Prism:
            TriangularPrism tp = new TriangularPrism(7, 3, 6);
            System.out.println("Volume of Triangular prism 'tp': " + df.format(tp.volume()) + " units cubed");
            System.out.println("Surface Area of Triangular Prism 'tp': " + df.format(tp.surfaceArea()) + " units squared.");
            System.out.println();

        }

    }
