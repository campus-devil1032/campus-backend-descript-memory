
public class DescriptHeapArea {

	public static void main(String[] args) {
		// ���ڿ� "Hello, World!"�� �����Ͽ� heap ������ �����մϴ�.
		String str = new String("Hello, World!");
		System.out.println(str);

		// �迭�� �����Ͽ� heap ������ �����մϴ�.
		int[] array = new int[10]; // ũ�Ⱑ 10�� int �迭
		for (int i = 0; i < array.length; i++) {
			array[i] = i;
		}

		/**
		 * �� �ڵ忡���� ���ڿ� "Hello, World!"�� ũ�Ⱑ 10�� int �迭�� �� ������ ����˴ϴ�.
		 * �̷��� ��ü���� JVM�� ����Ǵ� ���� �޸𸮸� ����ؼ� �Ҵ��ϰ� �����մϴ�.
		 * GC�� �̻��Ǵ� ��ü���� �޸𸮸� �˾Ƽ� �����մϴ�.
		 */
	}
}
