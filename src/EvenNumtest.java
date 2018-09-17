import java.util.Scanner;

public class EvenNumtest {

   /* public static void main(String[] args) {
        Scanner num=new Scanner(System.in);
        System.out.println("enter a number");
        int number=num.nextInt();
        boolean found=isEven(number);
        if(found){
            System.out.println("entered number is even");
        }
        else{
            System.out.println("entered number is not an even ");
        }
    }*/
    public static boolean isEven(int number){
       if(number%2==0){
           return true;
       }
       else {
           return false;
       }

    }
}
