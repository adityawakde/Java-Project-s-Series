import java.util.*;
class FibonacciSeries{
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the size of the series:- ");
    int n = sc.nextInt();

    int firstNum = 0, secondNum = 1;
    System.out.print("Fibonacci Series:- " + firstNum + " , " + secondNum);
    for(int i = 2; i < n; i++){
        int nextNum = firstNum + secondNum;
        System.out.print(" , " + nextNum);
        firstNum = secondNum;
        secondNum = nextNum;
    }
}
}













