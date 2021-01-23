package kr.ac.gwnu.com.kwon;

public class Customizer {
    private String nickname; // 닉네임
    private String personal; // 퍼스널음료이름

    public void setNickName(String nickname) {
        this.nickname = nickname;
    }

    public String getNickName() {
        return this.nickname;
    }

    public String getDrinkName() {
        return this.personal;
    }

    public void setDrinkName(String personal) {
        this.personal = personal;
    }
}
