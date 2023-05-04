
public class DescriptStackArea2 {
	public static void main(String[] args) {
		int x = 10;
		int y = 5;
		// subtract (return 2) <- multiply (return 17) <- add (return 34) <- main
		// 위 코드에서 main 메서드에서 add 메서드를 호출하면 add 메서드에서 multiply 메서드를 호출하고
		// multiply 메서드에서 subtract 메서드를 호출합니다.
		// 각각의 메서드가 호출될 때마다 해당 메서드의 지역 변수들이 스택에 저장 됩니다.
		// 메서드가 반환되면 해당 메서드의 스택 프레임이 제거됩니다.
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
