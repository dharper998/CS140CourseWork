package lab09;

import java.util.Comparator;

public class Bonus {
	public static void main(String[] args) {
        Comparator<String> strComp = (i, j) -> i.length() - j.length();
        BinarySearchTree<String> tree = new BinarySearchTree<>(strComp);
        tree.insert("red");
        tree.insert("firetruck");
        tree.insert("an");
        tree.insert("b");
        tree.insert("hey");
        tree.insert("psychology");
        tree.insert("blue");
        tree.prettyPrint();
    }
}
