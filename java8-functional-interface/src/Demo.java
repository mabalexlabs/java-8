import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

@FunctionalInterface
interface Square {
	int calculate(int x);
}

public class Demo {

	public static void main(String[] args) {
		Square square = (int x) -> x * x;
		System.out.println(square.calculate(5));

		Predicate<String> predicate = name -> name.startsWith("temp");
		System.out.println(predicate.test("tempVariable"));

		Function<String, Integer> function = name -> name.length();
		System.out.println(function.apply("temp"));

		UnaryOperator<String> unaryOperator = name -> name + "Varaible";
		System.out.println(unaryOperator.apply("temp"));

		BinaryOperator<String> binaryOperator = (a, b) -> a + b;
		System.out.println(binaryOperator.apply("temp", "Variable"));

		Consumer<String> consumer = System.out::println;
		consumer.accept("demo");

		Supplier<Integer> supplier = () -> 50;
		System.out.println(supplier.get());
	}

}
