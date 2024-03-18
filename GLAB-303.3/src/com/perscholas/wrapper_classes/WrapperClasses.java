package com.perscholas.wrapper_classes;

import java.util.*;

public class WrapperClasses {
    public static void main(String[] args) {
        PA_303_3_1();
    }
    
    private static void PA_303_3_1() {
        System.out.println("""
                **************************************************
                PA 303.3.1 - Strings
                **************************************************""");
        // This section is completed on HackerRank.com.  I'll be pasting the code I submit there to here
        //  so that I can have a reference.

        // ********************
        // Java Strings Introduction
        // ********************
        String fixedInput = "hello\njava";
        Scanner sc =
//                new Scanner(System.in);
                new Scanner(fixedInput);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        sc.close();
        System.out.println(A.length()+B.length());
        System.out.println((B.compareTo(A)<0)? "Yes" : "No");
        String A_1 = A.replace(A.charAt(0),
                Character.toUpperCase(A.charAt(0)));
        String B_1 = B.replace(B.charAt(0),
                Character.toUpperCase(B.charAt(0)));
        System.out.println(A_1+" "+B_1);

        // ********************
        // Java Substring
        // ********************
        fixedInput = "Helloworld\n3 7";
        Scanner in =
//                new Scanner(System.in);
                new Scanner(fixedInput);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        in.close();
        System.out.println(S.substring(start,end));

        // ********************
        // Java Substring Comparisons
        // ********************
        // Input for the function
        String s = "welcometojava"; int k = 3;

        String smallest = "";
        String largest = "";

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        for(int i=0; i+k<=s.length(); i++) {
            String temp = s.substring(i,i+k);
            if(s.substring(i,i+k).compareTo(smallest)<0 || i==0) smallest = s.substring(i,i+k);
            if(s.substring(i,i+k).compareTo(largest)>0 || i==0) largest = s.substring(i,i+k);
        }

        System.out.println(smallest + "\n" + largest);
//        return smallest + "\n" + largest;
        // ********************
        // Java String Reverse
        // ********************
        fixedInput = "madam";
        sc=
//                new Scanner(System.in);
                new Scanner(fixedInput);
        A=sc.next();
        sc.close();
        String sbA = new StringBuffer(A).reverse().toString();
        System.out.println((sbA.equals(A))?"Yes":"No");
        // ********************
        // Java String Tokens
        // ********************
        s = "He is a very very good boy, isn't he?";
        if(s.trim().isEmpty()) {
            System.out.println(0);
            return;
        }
        String[] split = s.trim().split("[^A-Za-z]+");
        System.out.println(split.length);
        for(String item: split) System.out.println(item);
    }
}
