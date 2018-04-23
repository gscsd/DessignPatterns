package prototypepatterns;

public class Circle extends Shape {

	public Circle() {
		super();
		// TODO Auto-generated constructor stub
		type="Circle";
	}

	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("Inside Circle::draw() method.");
	}

}
