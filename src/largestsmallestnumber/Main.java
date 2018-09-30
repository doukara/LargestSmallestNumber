
package largestsmallestnumber;

public class Main {

   
    public static void main(String[] args) {
    
     //inser 10 numebr on array   
    int  numbers[] = new int[] {12,96,20,10,88,106,37};
    
    int smallest = numbers[0];
    int largest = numbers[0];
    int i = 0;
    while(i  < numbers.length)
    {       
        if(numbers[i] > largest)
            largest = numbers[i];
        else if (numbers[i] < smallest)
	    smallest = numbers[i];
	 i++;		
     }
    
    System.out.print("The numbers on this array : ");
    for(int val : numbers)         
        System.out.print("\t" + val);
    		
	System.out.println("\n" + "Largest Number is : " + largest);
	System.out.println("Smallest Number is : " + smallest);
    }
    
}
