//TreeNode class declarations for a binary search tree.

// class TreeNode definition
class TreeNode< K extends Comparable< K >,V extends Comparable< V >>
{
    // package access members
    TreeNode< K, V > leftNode; // left node
    K key; // node key
    V value; // node data
    TreeNode< K, V > rightNode; // right node

    // constructor initializes data and makes this a leaf node
    public TreeNode( K key, V value )
    {
        this.key = key;
        this.value = value;
        leftNode = rightNode = null; // node has no children
    } // end TreeNode constructor

    // locate insertion point and insert new node; ignore duplicate values
    public void insert( K key, V value )
    {
        int compareValue = key.compareTo( this.key );
        // insert in left subtree
        if ( compareValue < 0 )
        {
            // insert new
            if ( leftNode == null )
                leftNode = new TreeNode< K, V >( key, value );
            else // continue traversing left subtree recursively
                leftNode.insert( key, value );
        } // end if
        // insert in right subtree
        else if ( compareValue > 0 )
        {
            // insert new TreeNode
            if ( rightNode == null )
                rightNode = new TreeNode< K, V >( key, value);
            else // continue traversing right subtree recursively
                rightNode.insert( key, value);
        }
        else{
            System.out.printf("Duplicate key found: %s%n",key);
        }// end else if
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