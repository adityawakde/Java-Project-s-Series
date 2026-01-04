import java.util.*;

class GradeCalculator{
    public static void main(String args[]){

    Scanner sc = new Scanner(System.in);
    
    System.out.println("Welcome to Grade Calculator\n");
    System.out.println("Grade System");
    System.out.println("A+ = 90 to 100");
    System.out.println("A = 80 to 89");
    System.out.println("B+ = 70 to 79");
    System.out.println("B = 60 to 69");
    System.out.println("C+ = 50 to 59");
    System.out.println("C = 40 to 49");
    System.out.println("F = 0 to 39");
    System.out.println("Enter Marks(0-100)");
    int marks = sc.nextInt();
    
    if ( marks < 0 ||  marks > 100){
        System.out.println("Invalid Marks");
    } else if (marks >= 90){
        System.out.println("A+ Grade");
    } else if (marks >= 80){
        System.out.println("A Grade"); 
    } else if (marks >= 70){
        System.out.println("B+ Grade");
    } else if (marks >=60){
        System.out.println("B Grade");
    } else if (marks >= 50){
        System.out.println("C+ Grade");
    } else if (marks >= 40){
        System.out.println("C Grade");
    } else {
        System.out.println("F Grade");
    }
    sc.close();
}
}