package codeSoftTask2;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) 
    {
    Scanner scanner=new Scanner(System.in);
    System.out.println("Enter marks obtained in each subject out of 100");
    System.out.println("subject 1:");
    int subject1Marks=scanner.nextInt();
    System.out.println("subject 2:");
    int subject2Marks=scanner.nextInt();
    System.out.println("subject 3:");
    int subject3Marks=scanner.nextInt();
    int totalMarks=subject1Marks + subject2Marks +subject3Marks;
    double averagePercentage=(double) totalMarks /3;
    char grade;
    if(averagePercentage >=90)
    {
    	grade ='A';
    }
    else if(averagePercentage >=80)
    {
    	grade='B';
    }
    else if(averagePercentage >=70)
    {
    	grade='C';
    }
    else if(averagePercentage >=60)
    {
    	grade ='D';
    }
    else
    {
    	grade='F';
    }
    System.out.println("Results:");
    System.out.println("Total marks:" + totalMarks);
    System.out.println("Average Percentage:" + averagePercentage + "%");
    System.out.println("Grade: "+grade);
    }
}
