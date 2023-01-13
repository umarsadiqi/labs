package com.company;
/**
 * @author Rahul Kanwal 3144895
 */
public class Lab4_Driver {
    //method to print the required output as given in question
    public static void printList(String questionNumber,Position<Character> cursor, LinkedPositionalList<Character> testList){
        System.out.println(questionNumber);
        System.out.println("Cursor is at: " + cursor);
        System.out.println("LPL contents: " + testList +"\n");
    }

    public static void main(String[] args) {

        LinkedPositionalList <Character> testList = new LinkedPositionalList<>();
        //adding required elements
        for(int i = 0; i < 15; i++){
            testList.addLast((char) (65 + i));
        }

        Position<Character> cursor = testList.first();
        printList("Q2a:" , cursor , testList);

        for(int i = 0 ; i < 7 ; i++){
            cursor = testList.after(cursor);
        }
        printList("Q2b:" , cursor , testList);

        //adding the letter K after and letter P before cursor
        testList.addAfter(cursor,'K');
        testList.addBefore(cursor,'P');
        printList("Q2c:" , cursor , testList);

        //moving cursor 5 positions back
        for (int i  = 0 ; i < 5 ; i++){
            cursor = testList.before(cursor);
        }
        printList("Q2d:" , cursor , testList);

        //changing letter after cursor to Y
        testList.set(testList.after(cursor),'Y');
        //deleting the element before cursor
        testList.remove(testList.before(cursor));
        printList("Q2e:" , cursor , testList);

        //moving 5 positions ahead
        for(int i = 0 ; i < 5 ; i++) {
            cursor = testList.after(cursor);
        }
        //setting element at cursor to Z
        testList.set(cursor,'Z');
        printList("Q2f:" , cursor , testList);

        //***Q3***
        System.out.println("***Q51***");
        cursor= testList.first();

        int size = testList.size(); // because size keeps changing
        for(int i = 0 ; i < size ; i++) {

            //To avoid Null Pointer exception beneath
            int testCase = (int) cursor.getElement();
            Position<Character> temp = cursor;
            cursor = testList.after(cursor);

            if(testCase%2!=0){
                testList.remove(temp);
            }
        }
        //setting cursor to the starting
        cursor = testList.first();
        printList("Q3",cursor,testList);



    }
}
