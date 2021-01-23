package kr.ac.gwnu.com.kwon;

import java.util.ArrayList;

public class ToppingForCold implements Topping {
    private ArrayList<String> tempTFC = new ArrayList<>();
    private String[] toppingMenus = new String[tempTFC.size()];

    @Override
    public String selectTopping(int topping, ArrayList<String> tempST) {
        toppingMenus = tempST.toArray(new String[tempTFC.size()]);
        toppingMenus[topping + 1] = toppingMenus[topping + 1].substring(4);
        System.out.print("(COLD) ");
        return toppingMenus[topping + 1];
    }

}
