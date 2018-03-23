//TreeNode class declarations for a binary search tree.

// class TreeNode definition
class TreeNode<  T extends Comparable< T>,K extends Comparable< K >,V extends Comparable< V >>
{
    // package access members
    TreeNode< T, K, V > leftNode; // left node
    T data; // node value
    K key;
    V value;
    TreeNode< T, K, V > rightNode; // right node

    // constructor initializes data and makes this a leaf node
    public TreeNode( T nodeData, K key, V value )
    {
        this.data = nodeData;
        this.key = key;
        this.value = value;
        leftNode = rightNode = null; // node has no children
    } // end TreeNode constructor

    // locate insertion point and insert new node; ignore duplicate values
    public void insert( T insertValue, K key, V value )
    {
        System.out.println("\n----------------\n"+insertValue.getClass()+"\n----------------------");
        // insert in left subtree
        if ( insertValue.compareTo( data ) < 0 )
        {
            // insert new
            if ( leftNode == null )
                leftNode = new TreeNode< T, K, V >( insertValue, key, value );
            else // continue traversing left subtree recursively
                leftNode.insert( insertValue, key, value );
        } // end if
        // insert in right subtree
        else if ( insertValue.compareTo( data ) > 0 )
        {
            // insert new TreeNode
            if ( rightNode == null )
                rightNode = new TreeNode< T, K, V >( insertValue, key, value);
            else // continue traversing right subtree recursively
                rightNode.insert( insertValue, key, value);
        } // end else if
    } // end method insert
} // end class TreeNode

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