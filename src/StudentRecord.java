import java.util.Scanner;

public class StudentRecord {

   /* public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number of students");
        int no_of_students = scanner.nextInt();


        int student_grade[] = new int[no_of_students];
        System.out.println("enter students grade between 1 and 100");
        for (int i = 0; i < no_of_students; i++) {
            System.out.print("enter grade for student " + (i + 1) + " :");
            student_grade[i] = scanner.nextInt();
        }
        float avg=average(student_grade);
        System.out.println("the average is: "+avg);
        int min=minimum(student_grade);
        System.out.println("the minimum is: "+min);
        int max=maximum(student_grade);
        System.out.println("the maximum is: "+max);

    }*/
       public  float average(int stdGrade[]){

        float sum=0;
        for(int i=0;i<stdGrade.length;i++) {
            sum += stdGrade[i];
        }
            float avg=sum/stdGrade.length;
        return avg;

    }

    public  int minimum(int stdGrade[]){
        int min=stdGrade[0];
        for (int i=1;i<stdGrade.length;i++){
            if(stdGrade[i]<min)
                min=stdGrade[i];
        }
        return min;
    }

    public static int maximum(int stdGrade[]){
        int max=stdGrade[0];
        for (int i=1;i<stdGrade.length;i++){
            if(stdGrade[i]>max)
                max=stdGrade[i];
        }
        return max;
    }





}
