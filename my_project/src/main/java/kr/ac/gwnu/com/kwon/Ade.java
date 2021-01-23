package kr.ac.gwnu.com.kwon;

import java.util.ArrayList;

public class Ade implements Menu {
    private ArrayList<String> tempAM = new ArrayList<>();
    private String[] adeMenus = new String[tempAM.size()];

    @Override
    public String selectMenu(int num, ArrayList<String> tempSM) {
        adeMenus = tempSM.toArray(new String[tempAM.size()]);
        adeMenus[num + 1] = adeMenus[num + 1].substring(4);
        return adeMenus[num + 1];
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
