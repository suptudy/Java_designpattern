package kr.ac.gwnu.com.kwon;

import java.util.*;

public class Coffee implements Menu {
    private ArrayList<String> tempCM = new ArrayList<>();
    private String[] coffeeMenus = new String[tempCM.size()];

    @Override
    public String selectMenu(int num, ArrayList<String> tempSM) {
        coffeeMenus = tempSM.toArray(new String[tempCM.size()]);
        coffeeMenus[num + 1] = coffeeMenus[num + 1].substring(4);
        return coffeeMenus[num + 1];
    }

    @Override
    public int countMenu(int count) {
        return count;
    }

    @Override
    public String selectHC(boolean HC) {
        if (HC == true) {
            return "ICE";
        } else
            return "HOT";
    }
}
