
@FunctionalInterface
interface Square {
	int calculate(int x);
}

public class Demo {

	public static void main(String[] args) {
		Square square = (int x) -> x * x;
		System.out.println(square.calculate(5));
	}

}
