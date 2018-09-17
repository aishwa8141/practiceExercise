import java.util.Scanner;

public class Power {


    public static void main(String [] args){
        Scanner number=new Scanner(System.in);
        System.out.println("enter a number to check whether it is power of 4 or not");
        int num=number.nextInt();
        boolean found=powerof4(num);
        if(found){
            System.out.println("the given number "+num +" is power of 4");
        }
        else {
            System.out.println("the given number "+num +" is not a power of 4");

        }

    }
    public static boolean powerof4(int n){
        if(n==0) {
            return false;
        }
        while(n != 1)
        {
            if(n % 4 != 0)
                return false;
            n = n / 4;
        }

     return true;

    }


}
