public class ThrowDemo {
static void checkAge(int age) {
if(age < 18) {
throw new ArithmeticException("Access denied: Must be 18 or o
}
System.out.println("Access granted!");
}
public static void main(String[] args) {
checkAge(15); // Throws exception manually
}
}
