
public class Client2 {
	public static void main(String args[]) {
		System.out.println("�Ҷ������յ���Ʒ��"+order());
	}

	private static String order(){
		IFactory factory = new FactoryB();
		return factory.prodLine();
	}
}
