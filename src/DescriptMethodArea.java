
/**
 * 
 * 메서드 영역은 자바 클래스 파일을 읽어들여 클래스별로 공유되는 정보를 저장하는 영역입니다.
 * 
 * 이 영역에는 클래스 변수, 상수, static 메서드 등의 정보가 저장됩니다.
 * 
 * 메서드 영역은 JVM이 시작될 때 생성되며, 프로그램이 종료될 때까지 유지됩니다.
 *
 */
public class DescriptMethodArea {
	// 스태틱이 붙어있는 모든 코드와 클래스들은 메서드 영역으로 올라간다.
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

		// 스태틱 클래스는 Heap 영역에서 참조하지 않으므로 괄호가 없다.
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
