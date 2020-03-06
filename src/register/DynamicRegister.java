package register;

public class DynamicRegister {
	native void dynamicFunc1();
	native String dynamicFunc2();
	static {
		System.load("F:/eclipse/JavaJniDynamic/src/libs/firstdylib.dll");
	}
	
	public static void main(String[] args) {
		DynamicRegister dynamicRegister = new DynamicRegister();
		dynamicRegister.dynamicFunc1();
		
		String result = dynamicRegister.dynamicFunc2();
		System.out.println("dynamicFunc2:"+result+"\n");
	}
}
