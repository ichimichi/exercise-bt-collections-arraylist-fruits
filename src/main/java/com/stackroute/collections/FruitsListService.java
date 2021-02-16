package com.stackroute.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/*
 * This class contains methods for adding Fruits to a List and searching the fruits from the List
 */
public class FruitsListService {

    public static List<String> addFruitsToList(String fruitNames) {
        List<String> fruitList = new ArrayList<>();

        if (fruitNames == null || fruitNames.trim().length() == 0) {
            return new ArrayList<String>();
        }

        for (String fruit : fruitNames.trim().split(",")) {
            if (fruitList.size() > 0 && searchFruitInListIgnoreCase(fruitList, fruit) == -1) {
                fruitList.add(fruit);
                System.out.println(fruit);
            } else if (fruitList.size() == 0) {
                fruitList.add(fruit);
            }
        }
        return fruitList;
    }

    public static int searchFruitInList(List<String> fruitList, String searchFruit) {
        int index = 0;
        for (String fruit : fruitList) {
            if (fruit.equals(searchFruit)) {
                return index;
            }
            index++;
        }
        return -1;
    }

    public static int searchFruitInListIgnoreCase(List<String> fruitList, String searchFruit) {
        int index = 0;
        for (String fruit : fruitList) {
            if (fruit.toLowerCase(Locale.ROOT).equals(searchFruit.toLowerCase(Locale.ROOT))) {
                return index;
            }
            index++;
        }
        return -1;
    }
}