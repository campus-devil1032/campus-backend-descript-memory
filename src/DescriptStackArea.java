
public class DescriptStackArea {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int result = add(a, b);
		System.out.println(result); // 30
	}

	public static int add(int a, int b) {
		/*
		 * �޼��尡 "ȣ��"�Ǵ� ���� ���������� �Ű������� ���� ������ ���� �˴ϴ�.
		 * 
		 * �޼��尡 ���� �Ǵ� ���� ���ÿ��� ���� �˴ϴ�.
		 * 
		 * ������ ����ϰ� ȣ��Ǹ� �޸𸮸� �ſ� ������ alloc(�Ҵ�)�ϰ� free(����) �� �� �ֽ��ϴ�.
		 * 
		 * add() ��� �� �Լ��� ȣ�� �Ǵ� ���� ���ο� ���� �������� ���� �˴ϴ�.
		 * 
		 * �� ���� �����ӿ��� "a", "b", "sum" �̶�� ������ ����ǰ� return �� �� �������� �Ҹ��մϴ�.
		 */
		int sum = a + b; // ���� ������ ����
		return sum; // ���� ������ �Ҹ�
	}
}
