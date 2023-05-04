
public class DescriptHeapArea {

	public static void main(String[] args) {
		// 문자열 "Hello, World!"를 생성하여 heap 영역에 저장합니다.
		String str = new String("Hello, World!");
		System.out.println(str);

		// 배열을 생성하여 heap 영역에 저장합니다.
		int[] array = new int[10]; // 크기가 10인 int 배열
		for (int i = 0; i < array.length; i++) {
			array[i] = i;
		}

		/**
		 * 위 코드에서는 문자열 "Hello, World!"와 크기가 10인 int 배열이 힙 영역에 저장됩니다.
		 * 이러한 객체들은 JVM이 실행되는 동안 메모리를 계속해서 할당하고 해제합니다.
		 * GC는 미사용되는 객체들의 메모리를 알아서 해제합니다.
		 */
	}
}
