import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

             intFact();
             longFact();

    }


    public static void intFact(){

        int i  = 1;
        int fact = 1;
        while (true)
        {
            System.out.printf("The factorial of %1$d is %2$d.\n", i, fact);
            if (Integer.MAX_VALUE / fact < (i+1)) {
                System.out.printf("The factorial of %d is out of range.\n", (i+1));
                break;
            }
            i++;
            fact *= i;
        }
    }
    private static void longFact()
    {
        long i  = 1L;
        long fact = 1L;
        while (true)
        {
            System.out.printf("The factorial of %1$d is is %2$d.\n", i, fact);
            if (Long.MAX_VALUE / fact < (i+1)) {
                System.out.printf("The factorial of %d is out of range.\n", (i+1));
                break;
            }
            i++;
            fact *= i;
        }
    }
}





