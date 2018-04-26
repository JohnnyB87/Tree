package treePackage;// Binary tree test program.
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
//import com.deitel.ch22.Tree;

public class TreeTest 
{
   public static void main( String[] args )
   {
      Tree< String, String > tree = new Tree< String, String >();
      Tree<Integer, String> tree1 = new Tree<Integer, String>();
      int data;
      String key;
      String value;
      Random randomNumber = new Random();

      System.out.println( "Inserting the following values: " );

      // insert 10 random integers from 0-99 in tree
      for ( int i = 1; i <= 10; i++ )
      {
         data = randomNumber.nextInt( 100 );
         //key = "testKey" + i;
         value = "testValue" + i;
         //System.out.printf( "%d ", data );
         tree1.insertNode( data, value );
         System.out.print(data + ",");
      } // end for
       System.out.println("");

      try {
         File file = new File("Prizes.txt");
         FileReader fr = new FileReader(file);
         BufferedReader br = new BufferedReader(fr);
         String newLine = br.readLine();

         while(newLine != null){
            String[] newLineSplit = newLine.split(",");
            int starValue = Integer.parseInt(newLineSplit[0]);
            key = newLineSplit[1];
            value = newLineSplit[2];
            tree.insertNode(key,value);
            newLine = br.readLine();
         }

      }catch(IOException ioe){
         System.out.println("-----Fail-----");
      }

       System.out.println ( "\n\nInorder traversal" );
       tree1.descendingOrderTraversal(); // perform inorder traversal of tree

      System.out.println ( "\n\nPreorder traversal" );
      tree.preorderTraversal(); // perform preorder traversal of tree

      System.out.println ( "\n\nInorder traversal" );
      tree.descendingOrderTraversal(); // perform inorder traversal of tree

      System.out.println ( "\n\nPostorder traversal" );
      tree.postorderTraversal(); // perform postorder traversal of tree
      System.out.println();

      System.out.println("FIND BY KEY");
      System.out.println(tree.findByKey("alpha"));
      System.out.println(tree.findByKey("charlie"));
      System.out.println(tree.findByKey("golf"));
      System.out.println(tree.findByKey("juliet"));
      System.out.println(tree.findByKey("ALPHA"));
      System.out.println(tree.findByKey("not real"));

       System.out.println ( "\n\nInorder traversal" );
       tree.ascendingOrderTraversal(); // perform inorder traversal of tree

       System.out.println ( "\n\nInorder traversal" );
       tree1.ascendingOrderTraversal(); // perform inorder traversal of tree
   } // end main
} // end class TreeTest


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
