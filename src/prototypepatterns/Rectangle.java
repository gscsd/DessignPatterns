package prototypepatterns;

public class Rectangle extends Shape {

	public Rectangle() {
		super();
		// TODO Auto-generated constructor stub
		type="Rectangle";
	}

	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("Inside Rectangle::draw() method.");
	}

}
