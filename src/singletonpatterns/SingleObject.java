package singletonpatterns;

public class SingleObject {
	private static SingleObject instance = new SingleObject();
	//���췽����private���Σ���������Ͳ��ܱ�ʵ������
	private SingleObject(){
		
	}
	//��ȡΨһ���õĶ���
	public static SingleObject getInstance(){
		return instance;
	}
	public void getMessage(){
		System.out.println("Hello World ��");
	}
	
}
