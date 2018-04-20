package abstractfactorypatterns;

public class ShapeFactory extends AbstractFactory {

	@Override
	Color getColor(String colorType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	Shape getShape(String shapeType) {
		// TODO Auto-generated method stub
		if(shapeType==null){
			return null;
		}
		if("CIRCLE".equalsIgnoreCase(shapeType)){
			return new Circle();
		}else if("Rectangle".equalsIgnoreCase(shapeType)){
			return new Rectangle();
		}else if("SQUARE".equalsIgnoreCase(shapeType)){
			return new Square();
		}
			
		return null;
	}


}
