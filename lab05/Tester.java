package lab05;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class Tester {

    public static void main(String[] args) {
    	testDivision();
    	testFunWithStrings();
      testZipper();
    }

    public static void testDivision() {
      Division set = new Division(new double[]{1,2,3,0,4,5,0,6,0,7,8,9,0});
      set.removeZeroes();
      set.divide(2);
      System.out.println("Expecting [0.5, 1.0, 1.5, 2.0, 2.5, 3.0, 3.5, 4.0, 4.5]");
      System.out.println("Received  " + set + "\n");

      try{
        Division set2 = new Division(new double[]{});
        set2.removeZeroes();
        set2.divide(4);
        System.out.println("Expecting [0.5, 1.0, 10.0, 1.5, 2.0, 4.0]");
        System.out.println("Received  " + set2 + "\n");
      } catch(IllegalArgumentException e) {
        System.out.println("Expecting IllegalArgumentException");
        System.out.println(e + "\n");
      }

      try{
        Division set3 = new Division(null);
        set3.removeZeroes();
        set3.divide(4);
      } catch(IllegalArgumentException e) {
        System.out.println("Expecting IllegalArgumentException");
        System.out.println(e + "\n");
      }

      try{
        Division set4 = new Division(new double[]{1,2,3,0,4,5,0,6,0,7,8,9,0});
        set4.removeZeroes();
        set4.divide(0);
      } catch(IllegalArgumentException e) {
        System.out.println("Expecting IllegalArgumentException");
        System.out.println(e + "\n");
      }
    }

    public static void testFunWithStrings() {
    	List<String> list1 = new ArrayList<String>(Arrays.asList("to", "cellphone", "truck", "fire"));
    	List<String> list2 = new ArrayList<String>(Arrays.asList("delicious", "copper", "blue", "red"));
    	FunWithStrings.swapMaxes(list1, list2);
      System.out.println("Expecting [to, delicious, truck, fire] [cellphone, copper, blue, red]");
      System.out.println("Received  " + list1 + " " + list2 + "\n");

      try {
        List<String> list3 = new ArrayList<String>(Arrays.asList());
        List<String> list4 = new ArrayList<String>(Arrays.asList("processes", "complications", "under", "dog", "comfort"));
        FunWithStrings.swapMaxes(list3, list4);
      } catch(IllegalArgumentException e) {
        System.out.println("Expecting IllegalArgumentException");
        System.out.println(e + "\n");
      }

      try {
        List<String> list5 = null;
        List<String> list6 = new ArrayList<String>(Arrays.asList("processes", "complications", "under", "dog", "comfort"));
        FunWithStrings.swapMaxes(list5, list6);
      } catch(IllegalArgumentException e) {
        System.out.println("Expecting IllegalArgumentException");
        System.out.println(e + "\n");
      }

      try {
        List<String> list7 = new ArrayList<String>(Arrays.asList(null, null, null));
        List<String> list8 = new ArrayList<String>(Arrays.asList("processes", "complications", "under", "dog", "comfort"));
        FunWithStrings.swapMaxes(list7, list8);
      } catch(IllegalArgumentException e) {
        System.out.println("Expecting IllegalArgumentException");
        System.out.println(e + "\n");
      }
    }

    public static void testZipper() {
      int ret[] = Zipper.zip(new int[]{1, 2, 3, 4}, new int[]{5, 6, 7, 8});
      System.out.println("Expecting [1, 5, 2, 6, 3, 7, 4, 8]");
      System.out.println("Received  " + Arrays.toString(ret) + "\n");

      try {
        int ret2[] = Zipper.zip(new int[]{2, 8, 3, 19, 6}, new int[]{1, 7, 5});
      } catch(IllegalArgumentException e) {
        System.out.println("Expecting IllegalArgumentException");
        System.out.println(e + "\n");
      }

      try {
        int ret3[] = Zipper.zip(null, new int[]{1, 7, 5});
      } catch(IllegalArgumentException e) {
        System.out.println("Expecting IllegalArgumentException");
        System.out.println(e);
      }
    }

}
