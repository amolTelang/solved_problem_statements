/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class Node{
         int data;
         Node left,right;
        Node(int data)
        {
            this.data=data;
            left=right=null;
        }
     }
public class Main
{
     
     Node root;
     Main(){this.root=null;}
     
     void printInorder(Node root)
     {
         if(root==null)
            return;
            printInorder(root.left);
            System.out.println(root.data+" ");
            printInorder(root.right);
     }
     void printPreorder(Node root)
    {
        if(root==null)
            return;
            System.out.println(root.data+" ");
            printPreorder(root.left);
            printPreorder(root.right);
    }
    void printPostorder(Node root)
    {
        if(root==null)
        return;
        printPostorder(root.left);
        printPostorder(root.right);
        System.out.println(root.data+" ");
    }
     
     void printPreorder(){printPreorder(root);}
     void printPostorder(){printPostorder(root);}
     void printInorder(){printInorder(root);}
	public static void main(String[] args) {
		Main tree = new Main();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
 
        System.out.println(
            "Preorder traversal of binary tree is ");
        tree.printPreorder();
 
        System.out.println(
            "\nInorder traversal of binary tree is ");
        tree.printInorder();
 
        System.out.println(
            "\nPostorder traversal of binary tree is ");
        tree.printPostorder();
	}
}
