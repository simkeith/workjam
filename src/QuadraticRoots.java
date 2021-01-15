/**
 * @author Simar Preet
 */

/**
 * Implement the function findRoots to find the roots of the quadratic equation: ax2 + bx + c = 0. If the equation has only one solution, the function should return that solution as both elements of the Roots. The equation will always have at least one solution.
 *
 * The roots of the quadratic equation can be found with the following formula: x 1,2 = -b +- under root(b^2 + 2ac) / 2a
 *
 * For example, the roots of the equation 2x2 + 10x + 8 = 0 are -1 and -4.
 */
public class QuadraticRoots {
    public static Roots findRoots(double a, double b, double c) {
        double root1 =0;
        double root2 =0;
        double determinant = b * b - 4 * a * c;

        // condition for real and different roots
        if(determinant > 0) {
            root1 = (-b + Math.sqrt(determinant)) / (2 * a);
            root2 = (-b - Math.sqrt(determinant)) / (2 * a);
        }
        // Condition for real and equal roots
        else if(determinant == 0) {
            root1 = root2 = -b / (2 * a);
        }
        return new Roots(root1, root2);
    }

    public static void main(String[] args) {
        Roots roots = QuadraticRoots.findRoots(2, 10, 8);
        System.out.println("Roots: " + roots.x1 + ", " + roots.x2);
    }
}

class Roots {
    public final double x1, x2;

    public Roots(double x1, double x2) {
        this.x1 = x1;
        this.x2 = x2;
    }
}
