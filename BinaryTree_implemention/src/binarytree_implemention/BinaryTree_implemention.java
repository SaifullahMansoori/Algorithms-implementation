package binarytree_implemention;

import java.util.*;

class Node {

    int data;
    Node leftchild;
    Node rightchild;
    public Node()
    {
        
    }
    public Node(int data)
    {
        this.data=data;
    }  
}

class BST {
Node root;
public void add(int data)
{
    Node nodetoadd=new Node();
    if(root==null)
        root=nodetoadd;
    travsers_add_node(root,nodetoadd);
}
public void travsers_add_node(Node node,Node nodetoadd)
{
    if(nodetoadd.data<node.data)
    {
        if(node.leftchild==null)
        {
            node.leftchild=nodetoadd;
        }
        else
        {
            travsers_add_node(node.leftchild,nodetoadd);  
        }
    }
    else if(nodetoadd.data>node.data)
    {
        if(node.rightchild==null)
        {
            node.rightchild=nodetoadd;
        }
        else
        {
             travsers_add_node(node.rightchild,nodetoadd);  
        }
    }
}


}

public class BinaryTree_implemention {

    public static void main(String[] args) {
        //8 3 6 10 4 7 1 14 13
        BST tree=new BST();
        tree.add(50);
        tree.add(25);
        tree.add(75);
        tree.add(100);
        tree.add(30);
    }

}
