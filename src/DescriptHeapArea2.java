import descript.MyClass;

/**
 * 
 * 힙 영역은 객체가 생성되는 영역으로, new 키워드를 사용하여 생성된 객체와 배열이 저장되는 곳입니다.
 * 
 * 이 영역은 JVM(Java Virtual Machine)이 실행되는 동안 계속해서 메모리를 할당하고 해제합니다.
 * 
 * 힙 영역은 자바 프로그램에서 사용하는 모든 데이터를 저장하는 중요한 영역입니다.
 * 
 * 힙 영역은 크게 Young 영역(= Minor GC가 일어남)과 Old 영역(=Full GC가 일어남)으로 나눌 수 있습니다.
 * 
 * Young 영역은 새로 생성된 객체들이 저장되는 곳으로, 대부분의 객체는 Young 영역에서 생성됩니다.
 * 
 * Old 영역은 Young 영역에서 살아남은 객체들이 저장되는 곳입니다.
 * 
 * 이러한 객체들은 오랫동안 사용될 가능성이 높은 객체들이며, Old 영역에서 GC(Garbage Collection)이 일어납니다.
 * 
 * GC Time을 stop the world 로 부르며 이를 줄이기 위해 하는 노력이 바로 JVM 튜닝입니다.
 *
 */
public class DescriptHeapArea2 {

	public static void main(String[] args) {
		MyClass obj = new MyClass(1, "John");
		System.out.println(obj.getNum()); // 1
		System.out.println(obj.getName()); // John
	}
}
