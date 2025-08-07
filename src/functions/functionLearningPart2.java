package functions;

public class functionLearningPart2 {
 public static void main(String[] args) {
    int r2 = power(10,2);
    System.out.println(r2);
 }

 static int power(int num1 , int num2) {
    int result = 1;
    for (int i = 0; i < num2; i++) {
        result *= num1;
    }
    return result;
 }
}
