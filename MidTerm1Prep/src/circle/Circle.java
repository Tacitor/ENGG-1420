/* Lukas K
 * Feb 14 2023
 * A representation of a circle. This code was written on paper, and then transcribed here for compilation and testing.
 */
package circle; //guess the package

public class Circle {
    private int r;
    private String name; private static int instanceCount = 0;
    
    public Circle(int r) {
        setRad(r);
        instanceCount ++;
        name = "Circle" + instanceCount;
    }
    
    public String getName() {
        return name;
    }
    public int getRad() {
        return r;
    }
    public void setRad(int r) {
        if (r == 0) {
            this.r = 1;
        } else {
            this.r = Math.abs(r);
        }
    }
    public static void main(String[] agrs) {
        Circle myC = new Circle(-5);
        
        System.out.println(myC.getName());
    }
}
