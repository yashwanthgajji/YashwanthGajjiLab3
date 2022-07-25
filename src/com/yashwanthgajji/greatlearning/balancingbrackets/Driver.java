package com.yashwanthgajji.greatlearning.balancingbrackets;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String bracketsString = sc.nextLine();
        BalancingBrackets balancingBrackets = new BalancingBrackets(bracketsString);
        boolean isBracketsBalanced = balancingBrackets.isBalance();
        if(isBracketsBalanced) {
            System.out.println("The entered String has Balanced Brackets");
        } else {
            System.out.println("The entered Strings do not contain Balanced Brackets");
        }
    }
}
