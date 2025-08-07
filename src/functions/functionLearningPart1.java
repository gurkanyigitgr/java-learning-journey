package functions;

public class functionLearningPart1 {
    public static void main(String[] args) {
//        f(10);
//        System.out.println("Second method");
//        f(20);
        power(2,3);
    }

    static void f(int x) {
        int result = (x+2) * 6;
        System.out.println(result);
    }

    static void power(int num1, int num2){
        int result= 1;
        for(int c = 1; c<= num2 ; c++) {
            result *= num1;
        }
        System.out.println(result);
    }
}
