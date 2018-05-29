package lab09;

import java.util.Comparator;
import java.util.ArrayList;
import java.util.List;

/**
 * A class to implement the Binary Search Tree data structure.
 * The structure is generic in the type of Objects it contains.
 * @param <T> the type of the contained elements this structure is to hold
 */
public class BinarySearchTree<T> {
    private Comparator<T> comparator;
    private T data;
    private BinarySearchTree<T> left;
    private BinarySearchTree<T> right;

    /**
     * Constructs an empty BST with a Comparator
     * @param comp the Comparator to use to impose an ordering on instances of T
     */
    public BinarySearchTree(Comparator<T> comp) {
        this.comparator = comp;
    }

    /**
     * Constructs a BST with data and a Comparator
     * @param data the data this BST should hold
     * @param comp the Comparator to use to impose an ordering on instances of T
     */
    public BinarySearchTree(T data, Comparator<T> comp) {
        this.data = data;
        this.comparator = comp;
    }

    /**
     * Inserts an element into this BST
     * @param element the element to insert into this BST
     */
    public void insert(T element) {
        if(this.data == null) {
        	this.data = element;
        } else if(comparator.compare(element, data) < 0) {
        	if(left != null) {
        		this.left.insert(element);
        	} else {
        		this.left = new BinarySearchTree(element, comparator);
        	}
        } else if(comparator.compare(element, data) > 0) {
        	if(right != null) {
        		this.right.insert(element);
        	} else {
        		this.right = new BinarySearchTree(element, comparator);
        	}
        }
    }

    /**
     * Searches for a given element in this BST
     * @param element the element to search this BST for
     * @return the element in this BST matching the given element, if found,
     *         otherwise null if the given element is not in this BST
     */
    public T find(T element) {
        if(element == this.data) {
        	return this.data;
        } else if(this.left == null && this.right == null) {
        	return null;
        } else {
	        if(comparator.compare(element, data) < 0) {
	        	if(this.left != null) {
		        	return this.left.find(element);
	        	} else {
	        		return null;
	        	}
	        } else {
	        	if(this.right != null) {
	        		return this.right.find(element);
	        	} else {
	        		return null;
	        	}
	        }
        }
    }

    /**
     * Gathers all the elements of this BST in order
     * @return a List holding the elements in this BST in order
     */
    public List<T> getElements() {
        List<T> list = new ArrayList<>();
        if(this.left != null) {
        	list.addAll(left.getElements());
        }
        list.add(this.data);
        if(this.right != null) {
            list.addAll(right.getElements());
        }
        return list;
    }

    /**
     * Pretty prints the contents of this BST in a horizontal tree-like fashion
     */
    public void prettyPrint() {
        prettyPrint(0);
    }

    private void prettyPrint(int indentLevel) {
    	if(this.left != null) {
    		this.left.prettyPrint(indentLevel+1);
    	}
    	for(int i=0;i<=indentLevel;i++) {
    		System.out.print(" ");
    	}
    	System.out.println(this.data);
    	if(this.right != null) {
    		this.right.prettyPrint(indentLevel+1);
    	}
    	
    }

    /**
     * A main method supplied for any debugging needs
     */
    public static void main(String[] args) {
        // Up to you how you use this main method, feel free to change it
        Comparator<Integer> intComp = (i, j) -> i - j; // lambda expression
        BinarySearchTree<Integer> tree = new BinarySearchTree<>(intComp);
        tree.insert(3);
        tree.insert(8);
        tree.insert(1);
        tree.insert(0);
        tree.insert(3);
        tree.insert(9);
        tree.insert(4);
        tree.prettyPrint();
    }
}