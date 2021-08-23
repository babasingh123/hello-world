package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListProg {


    public static void main(String []args){
        ArrayListProg prg = new ArrayListProg();
        prg.getColors();
        prg.iterateList();
        prg.insertFirst();
    }

    private void insertFirst(){
        // Write a Java program to insert an element into the array list at the first position.
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.add(0,-1);

        for(int i : list){
            System.out.println(i);
        }

    }
    private void iterateList() {
        // Write a Java program to iterate through all elements in a array list
        ArrayList<Integer> colors = new ArrayList<>();
        colors.add(1);
        colors.add(2);
        colors.add(3);
        colors.add(4);

        for(int col : colors){
            System.out.println(col);
        }
    }


    private void getColors(){

        //    Write a Java program to create a new array list, add some colors (string) and print out the collection

        ArrayList<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("blue");
        colors.add("green");
        colors.add("yellow");

        for(String col : colors){
            System.out.println(col);
        }
    }


}
