import java.util.*;

class AverageFactorial{
    
    public static double calculateAverage(double n, Scanner sc){
        double sum = 0;
        
        for (int i = 0; i < n; i++){
            int num = sc.nextInt();
            sum = (sum + num);
        }
        return (double) sum/n;
    }
    
    public static long calculateFactorial(double avg){
        int avgInt = (int) avg;
        
        long factorial = 1;
    for (int i = 1; i <= avgInt; i++){
        factorial = factorial*i;
        }
        return factorial;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
            System.out.println("Number of Inputs - ");
            int n = sc.nextInt();
            
            System.out.println("Enter numbers - ");
    
            double avg = calculateAverage(n, sc);
                System.out.println("Average of Input Numbers is " + avg);
                
            long factorial = calculateFactorial(avg);
                System.out.println("Factorial of average number is " + factorial);
        }
    }