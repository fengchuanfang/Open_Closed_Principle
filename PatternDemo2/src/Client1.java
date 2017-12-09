
public class Client1 {
	public static void main(String args[]) {
		System.out.println("我订购并收到产品："+order());
	}

	private static String order(){
		Factory factory = new Factory();
		return factory.prodLine(0);
	}
}
