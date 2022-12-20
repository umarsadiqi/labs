/**
 * Rahul Kanwal 3144895
 */
/**
 * This is an example of Javadoc documentation. 
 * It has two examples of methods for scaling a numeric array.
 * The task is to:
 * 		1. Describe the difference between the scale1 and scale2 methods in at most two sentences.
 * 		2. Identify which one accurately scales the array and explain why.
 * 
 * @author ACS-2947 Lab 0
 * Adapted from Michael T. Goodrich, Roberto Tamassia, Michael H. Goldwasser
 * 
 */
/**
  1.
  Answer. scale1 one doesn't change the actual value in the array itself it just changes value in the variable "val"
           whereas scale2 changes the value in the array itself i.e, the object passed is changed.
  2.
  Answer. scale2 accurately scales the array accurately because it scales the value by the factor entered as it changes the value of
            the object itself.

 */
public class ArrayScale {

  public static void scale1(double[] data, double factor) {
    for (double val : data)
      val *= factor;                     
  }

  public static void scale2(double[] data, double factor) {
    for (int j=0; j < data.length; j++)
      data[j] *= factor;                  
  }

  /**
   * Print method that uses StringBuilder to display every element of an array
   * @param data
   */
  public static void print(double[] data) {
    StringBuilder sb = new StringBuilder();
    for (double val : data)
      sb.append(" " + val);
    sb.append("\n");
    System.out.println(sb);
  }

  public static void main(String[] args) {
    double[] sample = {1.0, 2.0, 3.0, 4.0};
    print(sample);
    scale1(sample, 2);
    print(sample);
    scale2(sample, 3);
    print(sample);

  }
}
