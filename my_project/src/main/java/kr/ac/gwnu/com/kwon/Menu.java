package kr.ac.gwnu.com.kwon;

import java.util.ArrayList;

public interface Menu {
    public String selectMenu(int num, ArrayList<String> tempSM); // selectMenu

    public int countMenu(int count);

    public String selectHC(boolean HC); // Hot, Cold
}
