import java.util.Scanner;

public class ReverseArray {

    public static void main(String[] args) {
        
        int arraySize = 0;
        int temp = 0;
        
        Scanner scan = new Scanner(System.in); 
        System.out.println("How many numbers you want to enter? ");
        arraySize = scan.nextInt();
        int[] myArray = new int[arraySize];
        
        //Take inputs for the array
        for (int i = 0; i < myArray.length; i++) 
        {
            System.out.print("Enter a number: "); 
            myArray[i] = scan.nextInt(); 
        }

        //Print out the array
        System.out.print("\nOriginal Array: ");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i]);
            if((i+1) < myArray.length) {
                System.out.print(", ");
            }
        }

        //Reverse the order of the array
        for (int i = 0; i < (myArray.length/2); i++) {
            temp = myArray[i];
            myArray[i] = myArray[(myArray.length - 1 - i)];
            myArray[(myArray.length - 1 - i)] = temp;
        }

        //Print out the array
        System.out.print("\n\nReverse Array: ");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i]);
            if((i+1) < myArray.length) {
                System.out.print(", ");
            }
        }
        
        scan.close();
    }

}
