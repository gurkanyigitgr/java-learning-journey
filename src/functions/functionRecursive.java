package functions;

public class functionRecursive {
    static int r(int x) {
        if(x == 1){
            return 1;
        }
        return x + r(x-1);
    }

    static int fibo(int n){
        if(n==1 || n==2) {
            return 1;
        }

        return fibo(n-1)+ fibo(n-2);
    }
    public static void main(String[] args) {
        System.out.println(r(10));

        System.out.println(fibo(5));

    }
}
