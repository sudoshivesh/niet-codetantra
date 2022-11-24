package q11394;
public class CustomGenericClassExample {
	public static void main(String[] args) {
		A<String> a1 = new A<>("Ganga");
		System.out.println("a1.getValue() = " + a1.getValue());
		A<Boolean> a2 = new A<>(true);
		System.out.println("a2.getValue() = " + a2.getValue());
	}
}
class A<T> {
	private T t;
	public A(T t) {
		this.t = t;
	}
	public T getValue() {
		return t;
	}
	public void setValue(T t) {
		this.t = t;
	}
}
