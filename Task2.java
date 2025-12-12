import java.util.Scanner;

public class Task2{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of Subjects:");
        int n = sc.nextInt();

        int totalMarks = 0;

        for(int i=1; i<=n; i++){
            System.out.print("Enter marks of subjects" +i+ "(out of 100):");
            int marks = sc.nextInt();
            totalMarks+=marks;
        }
        double average = (double) totalMarks / n;

        char grade;

        if(average>=90)
            grade = 'A';
        else if(average>=80)
            grade = 'B';
        else if(average>=70)
            grade = 'C';
        else if(average>=60)
            grade = 'D';
        else
            grade = 'F';

        System.out.println("\n---Results---");
        System.out.println("Total Marks:"+totalMarks);
        System.out.println("Average Percentage:"+average+"%");
        System.out.println("Grade:"+grade);

        sc.close();
        
    }
}