
package largestsmallestnumber;

public class Main {

   
    public static void main(String[] args) {
        
    int  number[] = new int[] {12,96,20,10,88,106,37};
    
    int smallest = number[0];
    int largest = number[0];
    int i = 0;
    while(i  < number.length)
    {       
        if(number[i] > largest)
            largest = number[i];
        else if (number[i] < smallest)
	    smallest = number[i];
	 i++;		
     }
		
	System.out.println("Largest Number is : " + largest);
	System.out.println("Smallest Number is : " + smallest);
    }
    
}
