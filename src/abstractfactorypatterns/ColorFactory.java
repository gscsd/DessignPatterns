package abstractfactorypatterns;

public class ColorFactory extends AbstractFactory {

	@Override
	Color getColor(String colorType) {
		// TODO Auto-generated method stub
		if(colorType==null){
			return  null;
		}
		if("GREEN".equalsIgnoreCase(colorType)){
			return new Green();
		}else if("red".equalsIgnoreCase(colorType)){
			return new Red();
		}else if("Bule".equalsIgnoreCase(colorType)){
			return new Bule();
		}
		return null;
	}

	@Override
	Shape getShape(String shapeType) {
		// TODO Auto-generated method stub
		return null;
	}

}
