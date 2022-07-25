package com.yashwanthgajji.greatlearning.pairsum;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of nodes in the BST");
        int numberOfNodes = sc.nextInt();
        BinarySearchTree bst = new BinarySearchTree();
        System.out.println("Enter the nodes in the BST");
        for(int i=0;i<numberOfNodes;i++) {
            System.out.println("Enter the node " + i);
            bst.insert(sc.nextInt());
        }
        System.out.println("Given BST is: ");
        bst.inorder();
        System.out.println("Enter the Sum");
        int sum = sc.nextInt();
        PairSum pairSum = new PairSum(bst);
        Pair result = pairSum.isPairAvailableWithGivenSum(sum);
        if(result == null) {
            System.out.println("BST doesn't have a pair of nodes with sum " + sum);
        } else {
            System.out.println("Pair with sum " + sum + " is " + result.value1 + " and " + result.value2);
        }
    }
}
