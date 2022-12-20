/**
 * Rahul Kanwal 3144895
 */

/**
 * This class contains an example of an enumerated type.
 * The task is to: 
 * 	1. Run the code and understand what it does. Then,
 * 		Uncomment the commented code section and understand what the alternate definition of the enum does. Briefly explain.
 * 
 *  @author ACS-2947 Lab 0
 *  
 */

/**
 * The code is a simple demonstration of the enum ; first two unlinked statements are used to create base for the user
 * The continuing main method calls the method switchDemo which prints the concurrent values for each case; further explanation comments
   done along the line sof code.
  ---
 In the case of enhanced enum instead of the name of the enum , display property is used to set values for enum such that instead of
 the enum name , the corresponding number is displayed(numerically assigned from 1-7);
 */
public class EnumDemo {
//  public enum Day {MON, TUE, WED, THU, FRI, SAT, SUN};

   //This is an enhanced enum for Day. 
   public enum Day {
	  	MON("1"), TUE("2"), WED("3"), THU("4"), FRI("5"), SAT("6"), SUN("7");
	    private String display;
	    private Day(String display){
	        this.display = display;
	    }
	    public String toString(){
	        return display;
	    }
	}
  public static void main(String[] args) {
    Day d = Day.MON;
    System.out.println("We always start from day: " + d);  // enum is printed as "1" or "MON" depending on enum
    switchDemo(d);  //prints out specific case for d i.e.,for monday for this case
    
    d = Day.WED;
    System.out.println("Then it is day: " + d);
    switchDemo(d);  //prints out specific case for d i.e., for wednesday for this case
    
    System.out.println("\nNo!, it goes like this... \n");

    //a is iterated through every element in the enum Day and further prints the specific switch statement defined for each
    // defined case
    for (Day a : Day.values()) {
      System.out.println("Day " + a);
      switchDemo(a);
    }
  }

  public static void switchDemo(Day d) {
      switch (d) {
        case MON:
          System.out.println("This is tough.");
          break;
        case TUE:
          System.out.println("This is getting better.");
          break;
        case WED:
          System.out.println("Half way there.");
          break;
        case THU:
          System.out.println("I can see the light.");
          break;
        case FRI:
          System.out.println("Now we are talking.");
          break;
        default:
          System.out.println("Day off!");
      }
  }

}


