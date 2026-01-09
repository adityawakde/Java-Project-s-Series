import java.util.*;

class linearSearch{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Welcome to the Linear Search.");
        System.out.println("--------Menu--------");
        System.out.println("1 - 1D Array");
        System.out.println("2 - 2D Array");
        System.out.println("3 - Exit");
        
        int choice = sc.nextInt();
        
        switch(choice){
            
            case 1: 
                System.out.println("You selected 1D Array for Linear Search.");
                System.out.println("Enter the size of array.");
                int size = sc.nextInt();
                
                int matrix[] = new int[size];
                
                for (int i = 0; i < size; i++){
                    matrix[i] = sc.nextInt();
                }
                System.out.println("Which element to find");
                int x = sc.nextInt();
                for ( int i = 0; i < size; i++){
                    if ( matrix[i] == x){
                        System.out.print("x is found at " + matrix[i]);
                    } 
                }
                break;
            
            case 2:
                System.out.println("You selected 2D Array for Linear Search.");
                System.out.println("How many rows you need ");
                int rows = sc.nextInt();
                System.out.println("How many columns you need ");
                int columns = sc.nextInt();
                int matrixx[][] = new int[rows][columns];
                
                for ( int i=0; i<rows; i++){
                    for( int j=0; j< columns; j++){
                        matrixx[i][j] = sc.nextInt();
                    }
                    
                    System.out.println("Which element to find");
                    int y = sc.nextInt();
                    for ( int i = 0; i<rows; i++){
                    for( int j = 0; j< columns; j++){
                        if (matrixx[i][j] == x){
                            System.out.print("x is found at " + matrixx[i][j]);
                        } 
                    }
                }
            }
            break;

                case 3: 
                System.out.println("System is existing");
                sc.close();

                default:
                System.out.println("Invalid choice");
                break;
            }
        }
    }