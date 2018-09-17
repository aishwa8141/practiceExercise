import java.util.Scanner;

public class Palindrome {

  /*  public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.println("enter a string");
        String str1 = str.next();
        String revered = reverse(str1);
        System.out.println(revered);
        if (revered.equals(str1)){
            System.out.println("given input is a palindrome");
        }
        else{
            System.out.println("given input is not a palindrome");
        }


    }*/
      public static boolean reverse(String str2){

            String rev = "";

            for(int i = str2.length() - 1; i >= 0; i--)
            {
                rev = rev + str2.charAt(i);

            }
            if(rev.equals(str2))return true;

            return false;
        }

}
