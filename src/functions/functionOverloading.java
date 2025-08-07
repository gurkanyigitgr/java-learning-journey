package functions;

public class functionOverloading {
    static int add(int a, int b ) {
        return a+b;
    }

    static int add(int a, int b, int c) {
        return a+b+c;
    }

    static double add (int a, int b, double c){
        return a+b+c;
    }
    public static void main(String[] args) {
        System.out.println(add(1,2));
        System.out.println(add(2,3,3));
        System.out.println(add(1,5,5.4));
    }
}
