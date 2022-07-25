package com.yashwanthgajji.greatlearning.pairsum;

import java.util.HashSet;

public class PairSum {
    private final BinarySearchTree binarySearchTree;
    HashSet<Integer> hashSet;

    public PairSum(BinarySearchTree binarySearchTree) {
        this.binarySearchTree = binarySearchTree;
        hashSet = new HashSet<>();
    }

    public Pair isPairAvailableWithGivenSum(int sum) {
        Pair pair = new Pair();
        hashSet.clear();
        boolean isPairThere = getPairWithSum(binarySearchTree.getRoot(), pair, sum);
        if(!isPairThere) {
            return null;
        }
        return pair;
    }

    private boolean getPairWithSum(BinarySearchTree.Node root, Pair pair, int sum) {
        if(root == null) {
            return false;
        }
        if(getPairWithSum(root.left, pair, sum)) {
            return true;
        }
        if(hashSet.contains(sum - root.data)) {
            pair.value1 = sum - root.data;
            pair.value2 = root.data;
            return true;
        } else {
            hashSet.add(root.data);
        }
        return getPairWithSum(root.right, pair, sum);
    }
}
