package factorypatterns;

public class ShapeFactoryDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShapeFactory sf = new ShapeFactory();
		Shape shape1 = sf.getShape("Circle");
		shape1.draw();
		Shape shape2 = sf.getShape("recTangle");
		shape2.draw();
		Shape shape3 = sf.getShape("SquAre");
		shape3.draw();
	}

}
