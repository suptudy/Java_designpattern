package kr.ac.gwnu.com.proxy;

public class RealImageServer implements ImageServer {
    public RealImageServer() {
        // RealImageServer 생성
    }

    @Override
    public void display(String fileName) {
        this.loadImage(fileName);
        System.out.println(fileName + " 이미지 디스플레이");

    }

    public void loadImage(String fileName) {
        System.out.println(fileName + " 이미지 로딩");
    }

}
