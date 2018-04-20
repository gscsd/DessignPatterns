package abstractfactorypatterns;

public class AbstractFactoryDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractFactory shapeFactory =FactoryProducer.getFactory("shape");
		Shape circle = shapeFactory.getShape("CIrcle");
		circle.draw();
		AbstractFactory colorFactory =FactoryProducer.getFactory("Color");
		Color red = colorFactory.getColor("Red");
		red.fill();
	}

}
