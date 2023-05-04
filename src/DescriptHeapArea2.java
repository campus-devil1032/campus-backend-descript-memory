import descript.MyClass;

/**
 * 
 * �� ������ ��ü�� �����Ǵ� ��������, new Ű���带 ����Ͽ� ������ ��ü�� �迭�� ����Ǵ� ���Դϴ�.
 * 
 * �� ������ JVM(Java Virtual Machine)�� ����Ǵ� ���� ����ؼ� �޸𸮸� �Ҵ��ϰ� �����մϴ�.
 * 
 * �� ������ �ڹ� ���α׷����� ����ϴ� ��� �����͸� �����ϴ� �߿��� �����Դϴ�.
 * 
 * �� ������ ũ�� Young ����(= Minor GC�� �Ͼ)�� Old ����(=Full GC�� �Ͼ)���� ���� �� �ֽ��ϴ�.
 * 
 * Young ������ ���� ������ ��ü���� ����Ǵ� ������, ��κ��� ��ü�� Young �������� �����˴ϴ�.
 * 
 * Old ������ Young �������� ��Ƴ��� ��ü���� ����Ǵ� ���Դϴ�.
 * 
 * �̷��� ��ü���� �������� ���� ���ɼ��� ���� ��ü���̸�, Old �������� GC(Garbage Collection)�� �Ͼ�ϴ�.
 * 
 * GC Time�� stop the world �� �θ��� �̸� ���̱� ���� �ϴ� ����� �ٷ� JVM Ʃ���Դϴ�.
 *
 */
public class DescriptHeapArea2 {

	public static void main(String[] args) {
		MyClass obj = new MyClass(1, "John");
		System.out.println(obj.getNum()); // 1
		System.out.println(obj.getName()); // John
	}
}
