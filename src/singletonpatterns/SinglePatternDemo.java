package singletonpatterns;

public class SinglePatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���Ϸ��Ĺ��캯��
		//����ʱ���󣺹��캯��SingleObject()�ǲ��ɼ���
//		SingleObject so =new SingleObject();
		//��ȡΨһ���õĶ���
		SingleObject so =SingleObject.getInstance();
		//��ʾ��Ϣ
		so.getMessage();
	}

}
