import java.util.ArrayList;
import java.util.Scanner;

public class Main {

public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
ArrayList<Integer> numbers = new ArrayList<>();

System.out.println("=== Integer Sum Calculator ===");
System.out.println("Enter integers (type 'done' to finish):");

while (true) {
System.out.print("Enter an integer: ");
String input = scanner.nextLine();

if (input.equalsIgnoreCase("done")) {
break;
}

try {
int primitiveInt = Integer.parseInt(input);
numbers.add(primitiveInt);
System.out.println("Added: " + primitiveInt + " (autoboxed to Integer)");

} catch (NumberFormatException e) {
System.out.println("Invalid input! Please enter a valid integer or 'done' to finish.");
}
}

int sum = 0;
System.out.println("\nCalculating sum...");

for (Integer integerObj : numbers) {
int primitiveValue = integerObj;
System.out.println("Unboxing: " + integerObj + " → " + primitiveValue);
sum += primitiveValue;
}

System.out.println("\n=== Results ===");
System.out.println("Numbers entered: " + numbers);
System.out.println("Total sum: " + sum);

demonstrateAutoboxingUnboxing();

scanner.close();
}

private static void demonstrateAutoboxingUnboxing() {
System.out.println("\n=== Autoboxing/Unboxing Demonstration ===");

Integer obj1 = 100;
Integer obj2 = 200;
int primitive1 = obj1;
int primitive2 = obj2;

System.out.println("Autoboxing: 100 → Integer(" + obj1 + ")");
System.out.println("Autoboxing: 200 → Integer(" + obj2 + ")");
System.out.println("Unboxing: Integer(" + obj1 + ") → " + primitive1);
System.out.println("Unboxing: Integer(" + obj2 + ") → " + primitive2);

Integer result = obj1 + obj2;
System.out.println("Arithmetic: " + obj1 + " + " + obj2 + " = " + result);
}
}
