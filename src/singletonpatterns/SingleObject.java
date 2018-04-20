package singletonpatterns;

public class SingleObject {
	private static SingleObject instance = new SingleObject();
	//构造方法用private修饰，这样该类就不能被实例化了
	private SingleObject(){
		
	}
	//获取唯一可用的对象
	public static SingleObject getInstance(){
		return instance;
	}
	public void getMessage(){
		System.out.println("Hello World ！");
	}
	
}
