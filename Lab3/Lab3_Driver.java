package com.company;
/**
 * @author  Rahul Kanwal Brar 3144895
 */
public class Lab3_Driver {

    public static boolean MatchedParenthesis (String expr) {

        final String possibleOpening="({[";
        final String possibleClosing= ")}]";

        //Initializing stack to the size of the testCase to save memory
        ArrayStack<Character> stk = new ArrayStack<>(expr.length());

        //Implementing as required in Q2
       // LinkedJavaStack<Character> stk = new LinkedJavaStack<>();

        for(Character ch : expr.toCharArray()) {
            //-1 means it is not found in the string
            if (possibleOpening.indexOf(ch)!=-1) {
                stk.push(ch);
            }
            else if(possibleClosing.indexOf(ch)!=-1) {
                if(stk.isEmpty()){return false;}
                else {
                    //storing the removed character ; could have also used .top to store
                    char lastRemoved = stk.pop();
                    if(possibleOpening.indexOf(lastRemoved)!= possibleClosing.indexOf(ch)){
                        return false;
                    }
                }

            }

        }
        return stk.isEmpty();
    }
    public static void main(String[] args) {
        String[] exprs = {
                "( { [ ] ) }",
                "( ( ) ) { ( [ ( ) ] ) }",
                "{ ( ) ( ( ) ) { ( [ ( ) ] ) }",
                "( ( ( ) ( ( ) ) { ( [ ( ) ] ) } ) )",
                "1 + {2 * (3 + [4 * (5 + 6)])}",
                "1 + {2 * (3 + [4 * (5 + 6))]}",
                "( ( ( ) ( ( ) ) { ( [ ( ) ] ) } ) ( ( ( ) ( ( ) ) { ( [ ( ) ] ) } )"
        };

        for(String expr : exprs) {
            System.out.println(MatchedParenthesis(expr));
        }

    }

}

