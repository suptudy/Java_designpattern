package kr.ac.gwnu.com.kwon;

public class SizeVenti implements Size {

    @Override
    public String selectSize(int sizeNum) {
        if (sizeNum == 3) {
            return "Venti 사이즈 선택";
        }
        return null;
    }

}
