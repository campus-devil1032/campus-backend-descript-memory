
/**
 * 
 * �޼��� ������ �ڹ� Ŭ���� ������ �о�鿩 Ŭ�������� �����Ǵ� ������ �����ϴ� �����Դϴ�.
 * 
 * �� �������� Ŭ���� ����, ���, static �޼��� ���� ������ ����˴ϴ�.
 * 
 * �޼��� ������ JVM�� ���۵� �� �����Ǹ�, ���α׷��� ����� ������ �����˴ϴ�.
 *
 */
public class DescriptMethodArea {
	// ����ƽ�� �پ��ִ� ��� �ڵ�� Ŭ�������� �޼��� �������� �ö󰣴�.
	static class MyClass {
		private static int count = 0;

		public static int getCount() {
			return count;
		}

		public static void increaseCount() {
			count++;
		}
	}

	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int c = 2;
		int d = 3;

		// ����ƽ Ŭ������ Heap �������� �������� �����Ƿ� ��ȣ�� ����.
		MyClass.increaseCount();
		MyClass.increaseCount();
		MyClass.increaseCount();
		MyClass.increaseCount();
		MyClass.increaseCount();
		MyClass.increaseCount();
		MyClass.increaseCount();
		MyClass.increaseCount();
		MyClass.increaseCount();
		MyClass.increaseCount();
		MyClass.increaseCount();
		System.out.println(MyClass.getCount()); // output -> "2"
	}
}
