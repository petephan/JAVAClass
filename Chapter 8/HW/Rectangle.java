/*
 * 8.4: Calculate Perimeter and Area of Rectangle
 * Peter Phan 10/25/14
 */
package Chapter8;

public class Rectangle {

    private double length, width;

    public Rectangle() {
        setLength(1.0);
        setWidth(1.0);
    }

    public Rectangle(double sideLength, double sideWidth) {
        setLength(sideLength);
        setWidth(sideWidth);
    }

    public void setLength(double sideLength) {
        if (sideLength > 0.0 && sideLength < 20.0) {
            length = sideLength;
        } else {
            length = 1.0;
        }
    }

    public void setWidth(double sideWidth) {
        if (sideWidth > 0.0 && sideWidth < 20.0) {
            length = sideWidth;
        } else {
            length = 1.0;
        }
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getPerimeter() {
        return 2 * length + 2 * width;
    }

    public double getArea() {
        return length * width;
    }
    
    public String toString() {
        
        return String.format ("Length: %.2f\n" +  "Width: %.2f\n" +  
                "Perimeter: %.2f\n" +  "Area: %.2f\n", getLength(), getWidth(), getPerimeter(), getArea());
    }
}
