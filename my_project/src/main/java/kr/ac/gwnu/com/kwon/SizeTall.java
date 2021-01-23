package kr.ac.gwnu.com.kwon;

public class SizeTall implements Size {

    @Override
    public String selectSize(int sizeNum) {
        if (sizeNum == 1) {
            return "Tall 사이즈 선택";
        }
        return null;
    }
}
