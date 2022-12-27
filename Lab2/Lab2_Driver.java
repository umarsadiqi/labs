package com.company;

/**
 * @author Rahul Kanwal 3144895
 */
public class Lab2_Driver {
    public static void main(String[] args) {
            //Question 1
        System.out.println("\t \t \t *** Question 1 ***");
        Book one = new Book("Heartburn" , "Nora Ephron");
        Book two = new Book ("Milk and Honey","Rupi Kaur");
        Book three = new Book("When things fall Apart" , "Pema Chödrön");
        Book four = new Book("Bluets","Maggie Nelson");
        System.out.println(one.toString());
        System.out.println(two.toString());
        System.out.println(three.toString());
        System.out.println(four.toString());

            //Question 3
        System.out.println("\n \t \t \t *** Question 3 ***");
        SinglyLinkedList<Integer> nums = new SinglyLinkedList<>();
        nums.addFirst(5);
        nums.addLast(9);
        nums.addLast(8);
        nums.addLast(7);
        nums.addLast(0);

        System.out.println(nums);

            //Question 4
        System.out.println("\n \t \t \t *** Question 4 ***");

        SinglyLinkedList <Pair<Book,Integer>> bookStore = new SinglyLinkedList<>();
        bookStore.addFirst(new Pair<>(one,1));
        bookStore.addLast(new Pair<>(two,2));
        bookStore.addLast(new Pair<>(three,3));
        bookStore.addLast(new Pair<>(four,4));

        System.out.println(bookStore);



    }
}
