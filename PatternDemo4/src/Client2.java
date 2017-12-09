
public class Client2 {
	public static void main(String args[]) {
		System.out.println("我订购并收到产品："+order());
	}

	private static String order(){
		IFactory factory = new FactoryB();
		return factory.prodLine();
	}
}
