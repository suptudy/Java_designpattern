package kr.ac.gwnu.com.proxy;

import java.util.ArrayList;

public class ProxyImageServer implements ImageServer {
    private ArrayList<String> imageFiles = null;
    private RealImageServer realImageServer = null;

    public ProxyImageServer() {
        this.imageFiles = new ArrayList<String>();
        this.realImageServer = new RealImageServer();
    }

    @Override
    public void display(String fileName) {
        if (this.imageFiles.contains(fileName)) {
            System.out.println(fileName + " 이미지 디스플레이");
        } else {
            this.realImageServer.display(fileName);
            this.imageFiles.add(fileName);
        }

    }

}
