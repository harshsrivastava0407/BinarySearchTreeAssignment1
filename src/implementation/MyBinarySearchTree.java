package implementation;

import myinterface.BinarySearchTreeADT;
import myinterface.Node;

public class MyBinarySearchTree<E extends Comparable<E>> implements BinarySearchTreeADT<E> {
    //complete this class
    private Node root;
    private int size;

    public MyBinarySearchTree() {
        root = null;
        size = 0;
    }

    @Override
    public void insert(E data) {
        implementation.Node<E> node = new implementation.Node<>(data);
        if(isEmpty()){
            root = node;
        }
        else{
            Node<E> temp = root;
            Node<E> parent = null;
            while(temp!=null){
                parent = temp;
                if(data.compareTo(temp.getData())<=0){
                    temp = temp.getLeft();
                }
                else{
                    temp = temp.getRight();
                }
            }
            if(data.compareTo(parent.getData())<=0){
                parent.setLeft(node);
            }
            else{
                parent.setRight(node);
            }

        }
        size++;
        System.out.println("Node inserted");


    }

    @Override
    public boolean search(E searchElement) {
        return false;
    }

    @Override
    public void inOrder(Node<E> node) {

    }

    @Override
    public void preOrder(Node<E> node) {

    }

    @Override
    public void postOrder(Node<E> node) {

    }

    @Override
    public void reverseInOrder(Node<E> node) {

    }

    @Override
    public void delete(E data) {

    }

    @Override
    public int height(Node<E> node) {
        return 0;
    }
    public boolean isEmpty(){
        return root == null;
    }
}
