
public class DescriptStackArea2 {
	public static void main(String[] args) {
		int x = 10;
		int y = 5;
		// subtract (return 2) <- multiply (return 17) <- add (return 34) <- main
		// �� �ڵ忡�� main �޼��忡�� add �޼��带 ȣ���ϸ� add �޼��忡�� multiply �޼��带 ȣ���ϰ�
		// multiply �޼��忡�� subtract �޼��带 ȣ���մϴ�.
		// ������ �޼��尡 ȣ��� ������ �ش� �޼����� ���� �������� ���ÿ� ���� �˴ϴ�.
		// �޼��尡 ��ȯ�Ǹ� �ش� �޼����� ���� �������� ���ŵ˴ϴ�.
		int z = add(x, y);
		System.out.println(z);
	}

	public static int add(int a, int b) {
		int c = a + b;
		int d = multiply(c, 2);
		return d;
	}

	public static int multiply(int a, int b) {
		int c = a * b;
		int d = subtract(c, 3);
		return d;
	}

	public static int subtract(int a, int b) {
		int c = a - b;
		return c;
	}
}
