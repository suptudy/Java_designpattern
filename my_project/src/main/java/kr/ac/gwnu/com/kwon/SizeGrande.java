package kr.ac.gwnu.com.kwon;

public class SizeGrande implements Size {

    @Override
    public String selectSize(int sizeNum) {
        if (sizeNum == 2) {
            return "Grande 사이즈 선택";
        }
        return null;
    }

}
