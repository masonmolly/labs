
public interface Shape {
	
	interface TwoDShape extends Shape{
		abstract double getPerimeter();
		abstract double getArea();
	}
	
	interface ThreeDShape extends Shape {
		abstract double getVolume();
		
	}
	
	class Circle implements TwoDShape {
		public double getArea() {
			return 0;
		}

		public double getPerimeter() {
			return 0;
		}
	}
	
	class Rectangle implements TwoDShape {
		public double getArea() {
			return 0;
		}

		public double getPerimeter() {
			return 0;
		}
	}
	
	class Cylinder implements ThreeDShape {
		public double getVolume() {
			return 0;
		}
	}
}
