package com.company;
/**
 * @author Rahul Kanwal 3144895
 */

public class Pair<A, B> {
  private A first;
  private B second;
  public Pair(A a, B b) { // constructor
         first = a;
         second = b;
         }
  public A getFirst( ) { return first ;}
  public B getSecond() { return second ;}

    @Override
    public String toString() {
        return getFirst() + ", " + getSecond();
    }
}

