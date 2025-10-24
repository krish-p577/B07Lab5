public class Rectangle {
    double length;
    double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    public double getArea() {
    	return this.length * this.width;
    }

    public double getPeremeter(){
        return 2 * (length + width);
    }

}
