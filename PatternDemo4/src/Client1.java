
public class Client1 {
	public static void main(String args[]) {
		System.out.println("�Ҷ������յ���Ʒ��"+order());
	}

	private static String order(){
		IFactory factory = new FactoryA();
		return factory.prodLine();
	}
}
