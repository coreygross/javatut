package TestPackage1;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args){
        List<Integer> arrayList = new ArrayList<Integer>(5);

        for (int i = 1; i <= 5; i++)
            arrayList.add(i);

            //Print Elements
            System.out.println(arrayList);

            //Remove element at index 3
            arrayList.remove(3);

            //Displaying the ArrayList after deletion
            System.out.println(arrayList);

            //Printing elements one by one
            for (int i = 0; i < arrayList.size(); i++) //i is less than 5 and will come out of the loop with .size
                System.out.print(arrayList.get(i) + "");

    }
}
