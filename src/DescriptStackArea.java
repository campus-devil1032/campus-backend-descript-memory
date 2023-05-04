
public class DescriptStackArea {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int result = add(a, b);
		System.out.println(result); // 30
	}

	public static int add(int a, int b) {
		/*
		 * 메서드가 "호출"되는 순간 지역변수와 매개변수가 스택 영역에 생성 됩니다.
		 * 
		 * 메서드가 종료 되는 순간 스택에서 제거 됩니다.
		 * 
		 * 굉장히 빈번하게 호출되며 메모리를 매우 빠르게 alloc(할당)하고 free(해제) 할 수 있습니다.
		 * 
		 * add() 라는 이 함수가 호출 되는 순간 새로운 스택 프레임이 생성 됩니다.
		 * 
		 * 이 스택 프레임에는 "a", "b", "sum" 이라는 변수가 저장되고 return 될 때 프레임이 소멸합니다.
		 */
		int sum = a + b; // 스택 프레임 생성
		return sum; // 스택 프레임 소멸
	}
}
