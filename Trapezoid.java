
public class Trapezoid {
	double long_base;
	double short_base;
	double side_1;
	double side_2;
	double height;
	
	public Trapezoid(double long_base, double short_base, double side_1, double side_2, double height) {
		this.long_base = long_base;
		this.short_base = short_base;
		this.side_1 = side_1;
		this.side_2 = side_2;
		this.height = height;
	}
	
	public double getPerimeter() {
		return this.long_base + this.short_base + this.side_1 + this.side_2;
	}
	
	public double getArea() {
		return ((this.long_base + this.short_base) * this.height) / 2;
	}
}
