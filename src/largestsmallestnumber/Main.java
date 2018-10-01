
package largestsmallestnumber;

import java.util.Scanner;

public class Main {

    private static int smallest , largest;
    public static void main(String[] args) {
        
            Scanner sc = new Scanner(System.in);


           System.out.print("Enter the length of array : " );
           int item = sc.nextInt();
           //Fixed the length of array
           int numbers[] = new int[item];
           
           System.out.println("Add the numbers on array  one by one Please  : " );
           // add the item on array from the console
           for(int i=0;i<numbers.length;i++){   
               System.out.print((i+1) + "# " );
               numbers[i] = sc.nextInt(); 
           }
           System.out.print("List of numbers : " );
           //print the array items 
           for(int val : numbers)
               System.out.print("\t " + val );
           
           smallest = numbers[0];
           largest = numbers[0];
           int i = 0;
           //Test all the items(numbers) on array 'numbers' with loop(while) and fix largest and smallest numbers  
           while(i  < numbers.length){
               
            if(numbers[i] > largest)
            largest = numbers[i];
             else if (numbers[i] < smallest)
	    smallest = numbers[i];
            i++;		
        }
           System.out.println("\n" + "Largest Number is : " + largest);  // \n for print largest Number  on a new line 
           System.out.println("Smallest Number is : " + smallest);                
    }
    
}
