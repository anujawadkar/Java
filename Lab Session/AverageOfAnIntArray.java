package corejava;
//Java program to find average of an int array
import java.util.*;
public class AverageOfAnIntArray {	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner s = new Scanner(System.in);
				 
		        System.out.println("Enter array size: ");
		        int size = s.nextInt();
		        // create an array
		        int[] array = new int[size];
		 
		        // reading values from user keyboard
		        System.out.println("Enter array values :  ");
		        for (int i = 0; i < size; i++) {
		            int value = s.nextInt();
		            array[i] = value;
		 
		        }
                // getting array length
		        int length = array.length;
		        
                // default sum value		 
		            int sum = 0;
		            
		        //Sum of all value in array useing for loop
		        for (int i = 0; i < array.length; i++) {
		            sum += array[i];
		        }
		 
		        double average = sum / length;
		        sum = 0;
		 
		        for (int i = 0; i < array.length; i++) {
		            sum += array[i];
		        }
		 
		         average = sum / length;
		 
		        System.out.println("Average of array : " + average);
		 
		    }
		



	}

