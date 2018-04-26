package treePackage;// TreeNode and Tree class declarations for a binary search tree.
//package com.deitel.ch22;

import java.util.ArrayList;

// class Tree definition
public class Tree<K extends Comparable< K >,V extends Comparable< V > >
{
   private TreeNode< K, V > root;
   private ArrayList<K> jUnitTestArray;
   // constructor initializes an empty Tree of integers
   public Tree() 
   { 
      root = null; 
   } // end Tree no-argument constructor

   // insert a new node in the binary search tree
   public void insertNode( K key, V value )
   {
      if ( root == null )
         root = new TreeNode< K, V >( key, value ); // create root node
      else
         root.insert( key, value ); // call the insert method
   } // end method insertNode

   // begin preorder traversal
   public void preorderTraversal()
   {
       this.jUnitTestArray = new ArrayList<K>();
      preorderHelper( root );
      System.out.println(this.jUnitTestArray);
   } // end method preorderTraversal

   // recursive method to perform preorder traversal
   private void preorderHelper( TreeNode< K, V > node )
   {
      if ( node == null )
         return;

//      System.out.printf( "key: %s  --  value: %s%n", node.key, node.value ); // output node data
       this.jUnitTestArray.add(node.key);
       preorderHelper( node.leftNode ); // traverse left subtree
       preorderHelper( node.rightNode ); // traverse right subtree
   } // end method preorderHelper

   // begin inorder traversal
   public void ascendingOrderTraversal()
   {
       this.jUnitTestArray = new ArrayList<K>();
       ascendingOrderHelper( root );
       System.out.println(this.jUnitTestArray);
   } // end method inorderTraversal

   // recursive method to perform inorder traversal
   private void ascendingOrderHelper( TreeNode< K, V > node )
   {
      if ( node == null )
         return;

       ascendingOrderHelper( node.leftNode ); // traverse left subtree
//       System.out.printf( "key: %s  --  value: %s%n", node.key, node.value ); // output node data
       this.jUnitTestArray.add(node.key);
       ascendingOrderHelper( node.rightNode ); // traverse right subtree
   } // end method inorderHelper

    public void descendingOrderTraversal()
    {
        this.jUnitTestArray = new ArrayList<K>();
        descendingOrderHelper( root );
        System.out.println(this.jUnitTestArray);
    } // end method inorderTraversal

    // recursive method to perform inorder traversal
    private void descendingOrderHelper( TreeNode< K, V > node )
    {
        if ( node == null )
            return;

        descendingOrderHelper( node.rightNode ); // traverse left subtree
//        System.out.printf( "key: %s  --  value: %s%n", node.key, node.value ); // output node data
        this.jUnitTestArray.add(node.key);
        descendingOrderHelper( node.leftNode ); // traverse right subtree

    } // end method inorderHelper

   // begin postorder traversal
   public void postorderTraversal()
   {
       this.jUnitTestArray = new ArrayList<K>();
      postorderHelper( root );
       System.out.println(this.jUnitTestArray);
   } // end method postorderTraversal

   // recursive method to perform postorder traversal
   private void postorderHelper( TreeNode< K, V > node )
   {
      if ( node == null )
         return;
  
      postorderHelper( node.leftNode ); // traverse left subtree
      postorderHelper( node.rightNode ); // traverse right subtree
       this.jUnitTestArray.add(node.key);
//      System.out.printf( "key: %s  --  value: %s%n", node.key, node.value ); // output node data
   } // end method postorderHelper

    public V  findByKey(K key){
       return findByKeyHelper(root, key);
    }

    private V findByKeyHelper(TreeNode<K, V> node, K key) {
       if(node == null)
           return null;
       else if(key.compareTo( node.key) == 0)
           return node.value;
       else if(key.compareTo( node.key) < 0)
           return findByKeyHelper(node.leftNode, key);
       else
           return findByKeyHelper(node.rightNode, key);
    }

    public ArrayList<K> getjUnitTestArray(){
       return this.jUnitTestArray;
    }
} // end class Tree

/**************************************************************************
 * (C) Copyright 1992-2010 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
