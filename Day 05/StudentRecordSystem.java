import java.util.*;
import java.util.ArrayList;

class StudentRecordSystem{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
            
        ArrayList<String> StudentName = new ArrayList<>();
        ArrayList<Integer> StudentMarks = new ArrayList<>();
        
        while(true){
        System.out.println("--------Menu--------");
        System.out.println("1 - Add Student Name & Marks:-");
        System.out.println("2 - Display all records:-");
        System.out.println("3 - Exit:-");
        
        
        System.out.println("Enter your choice");
        int choice = sc.nextInt();
        sc.nextLine();
        
        
            
            switch(choice){
                case 1: System.out.println("Enter Student Name:- ");
                        String name = sc.nextLine();
                        
                        System.out.println("Enter Student Marks:- ");
                        int marks = sc.nextInt();
                        if(marks<0 || marks > 100){
                            System.out.println("Invalid Marks");
                        } else {
                            StudentName.add( name );
                            StudentMarks.add( marks );
                            
                            System.out.println("Students details added successfully");
                        }
                        break;
                        
                case 2: if (StudentName.isEmpty()){
                    System.out.println("No records available");
                } else {
                    System.out.println("Name" + "\tMarks");
                    for (int i = 0; i < StudentName.size(); i++){
                        System.out.println(StudentName.get(i) + "\t" + StudentMarks.get(i));
                    }
                    break;
                }
                
                case 3: 
                    System.out.println("Task Finished");
                    sc.close();
                    return;
                    
                    default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}
