package kr.ac.gwnu.com.kwon;

import java.util.ArrayList;

public class ToppingForHot implements Topping {
    private ArrayList<String> tempTFH = new ArrayList<>();
    private String[] toppingMenus = new String[tempTFH.size()];

    @Override
    public String selectTopping(int topping, ArrayList<String> tempST) {
        toppingMenus = tempST.toArray(new String[tempTFH.size()]);
        toppingMenus[topping + 1] = toppingMenus[topping + 1].substring(4);
        System.out.print("(HOT) ");
        return toppingMenus[topping + 1];
    }

}
