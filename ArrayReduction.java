/**
This class is to reduce an array using a priority queue
@author Ta'Rissa Woods
@ version %I% %G%
*/

/**
Imports the Queue, PriorityQueue, and LinkedList modules
*/
import java.util.Queue;
import java.util.PriorityQueue;
import java.util.LinkedList;

public class ArrayReduction
{
/**
Method to do the array reduction. Static, meaning that it can be used without a constructor
First we checked to see if the array in the parameter is equal to zero so it will return zero. Next we put the array in the parameter and to a 
priority queue, then take the first and second number add them up, add that sum to the total cost and back to the priority queue. The process repeats
until there's Ooly one element left in the priority queue. The total cost variable will continuably be added on to with the sum making a cumulative sum
@param list of numbers wanting to be reduced
@return total cost after reducing the array, which is a integer
*/
	public static int min_cost( int[] r )
	{
	    int total = 0;
	    if (r.length == 0){
	        return 0;
	    }
		PriorityQueue<Integer> numbers = new PriorityQueue<>();
		for (int i = 0; i < r.length; i++){
		    numbers.add(r[i]);
		}
		while(numbers.size() > 1){
		    int num1 = numbers.poll(); //geting and removing fisrt element
		    int num2 = numbers.poll(); //since first element got polled, this is going to remove the "second" element but since the first on got removed, the second one moved to the front
		    int sum = num1 + num2;
		    total += sum;
		    numbers.add(sum);
		}
		return total;
		
	}
}	
	
	
	public static void main( String[] args )
	{
		int[] s0 = {212};
		System.out.println( ArrayReduction.min_cost(s0));
		
		int[] s1 = {25,10,20};
		System.out.println( ArrayReduction.min_cost(s1));		
			
		int[] s2 = {1,2,3};
		System.out.println( ArrayReduction.min_cost(s2));	
			
		int[] s3 = {1,2,3,4,7,22,33,54,-66,3,4,5,76,7,999};
		System.out.println( ArrayReduction.min_cost(s3));	
			
		int[] s4 = {1,1,1,1,1};
		System.out.println( ArrayReduction.min_cost(s4));	
			
		int[] s5 = {1,1};
		System.out.println( ArrayReduction.min_cost(s5));												
	}
}


/* EXPECTED OUTPUT
 0
85
9
947
12
2
*/
