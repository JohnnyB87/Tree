package JUnitTesting;

import treePackage.*;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class TreeTest {

    private Tree<String, Integer> tree;

    @org.junit.jupiter.api.BeforeEach
    void before(){
        tree = new Tree<String, Integer>();
        int[] a = {6,9,1,3,5,10,2,7,4,8};
        for(int i=0;i<10;i++){
            String key = "JUnitTest" + a[i];
            int value = i * 10;
            tree.insertNode(key, value);
        }
    }

    @org.junit.jupiter.api.Test
    void insertNode() {
    }

    @org.junit.jupiter.api.Test
    void preorderTraversal() {
        tree.preorderTraversal();
        ArrayList<String> res = tree.getjUnitTestArray();
        int[] exp = {6,1,3,10,2,5,4,9,7,8};
        int i=0;
        for(String s : res){
            String expected = "JUnitTest" + exp[i];
            assertEquals(expected,s);
            i++;
        }
    }

    @org.junit.jupiter.api.Test
    void ascendingOrderTraversal() {
        tree.ascendingOrderTraversal();
        ArrayList<String> res = tree.getjUnitTestArray();
        int[] exp = {1,10,2,3,4,5,6,7,8,9};
        int i=0;
        for(String s : res){
            String expected = "JUnitTest" + exp[i];
            assertEquals(expected,s);
            i++;
        }
    }

    @org.junit.jupiter.api.Test
    void descendingOrderTraversal() {
        tree.descendingOrderTraversal();
        ArrayList<String> res = tree.getjUnitTestArray();
        int[] exp = {9,8,7,6,5,4,3,2,10,1};
        int i=0;
        for(String s : res){
            String expected = "JUnitTest" + exp[i];
            assertEquals(expected,s);
            i++;
        }
    }

    @org.junit.jupiter.api.Test
    void postorderTraversal() {
        tree.postorderTraversal();
        ArrayList<String> res = tree.getjUnitTestArray();
        int[] exp = {2,10,4,5,3,1,8,7,9,6};
        int i=0;
        for(String s : res){
            String expected = "JUnitTest" + exp[i];
            assertEquals(expected,s);
            i++;
        }
    }

    @org.junit.jupiter.api.Test
    void findByKey() {
        int[] exp = {20,60,30,80,40,0,70,90,10,50};
        for(int i=0;i<10;i++) {
            int res = tree.findByKey("JUnitTest" + (i+1));
            assertEquals(exp[i], res);
        }
    }
}