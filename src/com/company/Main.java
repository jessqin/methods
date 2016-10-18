package com.company;

public class Main {

    public static void main(String[] args)
    {
	// public int indexOf(int ascii, int from)
        //this returns the index of the first occurrence of the letter that corresponds to the inputed ascii starting at index from
        //it accepts ints and returns ints

        //example:
        //int a = a.indexOf(2,5);
        String s = "happy";
        int j = s.indexOf(97,0);
        System.out.print(j);
    }
}
