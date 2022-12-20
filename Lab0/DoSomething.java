/**
 * Rahul Kanwal 3144895
 */

/**
 * This is an example of Javadoc documentation. 
 * The task is to:
 * 		1. Describe what the doSomething method does in at most 3 sentences as a Javadoc documentation. 
 * 		2. Include a main method to call doSomething with some appropriate data and display the returned value.
 *
 * @author ACS-2947 Lab 0
 * Adapted from Michael T. Goodrich, Roberto Tamassia, Michael H. Goldwasser
 * 
 */

import java.util.Arrays;

/**
 * the method DoSomething iterates through every element of the array to find the target value t. It further returns
    the value j which is the index(position) of the element of the target value t .
 */
class DoSomething {
 
  public static int doSomething(int[] d, int t) {
    int j = 0;
    while ((j < d.length) && (d[j] != t))
      j++;
    return j;                       
  }

  public static void main(String[] args) {
    int [] d = {1,2,3,4,5,6,7,8,9};
    int t = 7;
    System.out.println("The Array is " + Arrays.toString(d));
    System.out.println("Target value is " + t);
    System.out.println("Running doSomething");
    System.out.println(doSomething(d,t));
    System.out.println("***     Therefore the target value is found at index 6      ***");


  }
}

