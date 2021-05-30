// Jacky Chow CSE114 HW5 Problem4

import java.util.ArrayList;
import java.util.Arrays;

public class HW5Problem4 {
    public static void main(String[] args) {
        String[] citylist1 = { "Autsin", "Dallas", "San Francisco" };
        String[] citylist2 = { "Boston", "Chicago", "Denver", "Seattle" };
        ArrayList<String> arrlist1 = new ArrayList<String>(Arrays.asList(citylist1));
        ArrayList<String> arrlist2 = new ArrayList<String>(Arrays.asList(citylist2));

        System.out.println("List1: " + arrlist1);
        System.out.println("List2: " + arrlist2);
        System.out.println("Merged and Sorted List: " + mergeList(arrlist1, arrlist2));
    }

    public static ArrayList<String> mergeList(ArrayList<String> lst1, ArrayList<String> lst2) {
        ArrayList<String> mergeList = new ArrayList<String>();

        mergeList.addAll(lst1);
        mergeList.addAll(lst2);

        String temp;
        for (int j = 0; j < mergeList.size(); j++) {
            for (int i = j + 1; i < mergeList.size(); i++) {
                if (mergeList.get(i).compareTo(mergeList.get(j)) < 0) {
                    temp = mergeList.get(j);
                    mergeList.set(j, mergeList.get(i));
                    mergeList.set(i, temp);
                }
            }

        }
        return mergeList;
    }
}