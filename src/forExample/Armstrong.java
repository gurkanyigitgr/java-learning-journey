package forExample;

public class Armstrong {
    public static void main(String[] args) {
        // Program to find Armstrong numbers
        int temp, units, tens, hundreds, total;

        for(int i = 100; i <=999 ; i++) {
            temp = i ;

            units = temp %10;
            temp /= 10;

            tens = temp % 10;
            temp /= 10;

            hundreds = temp % 10;

            total = (units * units * units) + (tens * tens * tens) + (hundreds * hundreds * hundreds);

            if(total == i) {
                System.out.println(i + " is an Armstrong number.");
            }
        }
    }
}
