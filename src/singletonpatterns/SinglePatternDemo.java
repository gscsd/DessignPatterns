package singletonpatterns;

public class SinglePatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//不合法的构造函数
		//编译时错误：构造函数SingleObject()是不可见的
//		SingleObject so =new SingleObject();
		//获取唯一可用的对象
		SingleObject so =SingleObject.getInstance();
		//显示消息
		so.getMessage();
	}

}
