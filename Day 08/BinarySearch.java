import java.util.*;
class BinarySearch{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the elements of array");
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Sorted array:" + Arrays.toString(arr));

        System.out.println("Enter the element to be searched");
        int key = sc.nextInt();

        int left = 0;
        int right  = size -1;
        boolean found= false;

        while(left <= right){
            int mid = (left + right) / 2;
            if (arr[mid] == key){
                System.out.println("Element found at index " + mid);
                break;
            } else if (arr[mid]< key){
                left = mid + 1;
            } else {
                right = mid - 1;
                }
            }
            if (!found) {
            System.out.println("Element not found in the array");
            }
            sc.close();
        }
    }













