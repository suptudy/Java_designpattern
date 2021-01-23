package kr.ac.gwnu.com.kwon;

import java.io.BufferedReader;
import java.util.*;

public abstract class Customer {
    private String name;
    private Customizer customizer = new Customizer();
    private ArrayList<Customizer> lists = new ArrayList<Customizer>();
    private ArrayList<String> tempML = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);
    private Menu menu;
    private Size size;
    private Topping topping;
    private Ice ice;
    private String sm;

    public Customer(String name) {
        this.name = name;
    }

    public Customer() {
    }

    public abstract String type();

    public String getName() {
        return this.name;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public void menuList(BufferedReader br) { // 메뉴 보여주는(txt)
        try {
            while ((sm = br.readLine()) != null) {
                tempML.add(sm);
            }
            br.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        Iterator<String> mlIterator = tempML.iterator();
        while (mlIterator.hasNext()) {
            System.out.println(mlIterator.next());
        }
    }

    public String performMenu1(int pmNum) {
        System.out.println("[메뉴를 선택하세요]");
        return menu.selectMenu(pmNum, tempML);
    }

    public void clearML() {
        tempML.clear();
    }

    public int performMenu2(int count) {
        System.out.print("음료 갯수: ");
        return menu.countMenu(count);
    }

    public String performMenu3(boolean HC) {
        System.out.print("HOT/COLD 선택: ");
        return menu.selectHC(HC);
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public String performSize(int sizeNum) {
        System.out.print("Size 선택 : ");
        return size.selectSize(sizeNum);
    }

    public void setTopping(Topping topping) {
        this.topping = topping;
    }

    public String performTopping(int toppNum) {
        System.out.print("Topping 선택 : ");
        return topping.selectTopping(toppNum, tempML);
    }

    public void setIce(Ice ice) {
        this.ice = ice;
    }

    public String performIce(int iceNum) {
        System.out.print("Ice 선택 : ");
        return ice.selectIce(iceNum);
    }

    public void showPersonal() {
        while (true) {
            System.out.println("---------------------------------------------------------");
            System.out.println("1.닉네임 설정 | 2.퍼스널 음료 이름 설정 | 3.넘어가기(등록완료)");
            System.out.println("---------------------------------------------------------");

            System.out.println("선택: ");
            String spNum = scanner.nextLine();
            switch (spNum) {
                case "1":
                    registerNick();
                    break;
                case "2":
                    registerPD();
                    break;
                case "3":
                    return;
            }
        }
    }

    public void registerNick() { // 사용자의 퍼스널 닉네임 설정
        try {
            System.out.println("닉네임을 입력하세요(eng): ");
            customizer.setNickName(scanner.nextLine());

            lists.add(customizer);
        } catch (Exception e) {
            System.out.println("등록 오류: " + e.getMessage());
        }
    }

    public void registerPD() { // 사용자 퍼스널음료 이름 설정
        try {
            System.out.println("퍼스널음료 이름을 입력하세요(eng): ");
            customizer.setDrinkName(scanner.nextLine());

            lists.add(customizer);
            scanner.close();
        } catch (Exception e) {
            System.out.println("등록 오류: " + e.getMessage());
        }
    }

    public String showResult() { // 퍼스널 설정 결과
        for (Customizer c : lists) {
            return "[등록된 nickname] " + c.getNickName() + "\n" + "[등록된 personalDrink] " + c.getDrinkName();
        }
        return "아무것도 등록하지 않았습니다";
    }
}
