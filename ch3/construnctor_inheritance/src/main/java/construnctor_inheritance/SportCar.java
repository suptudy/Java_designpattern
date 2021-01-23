package construnctor_inheritance;

public class SportCar extends Car {

    public SportCar(String name) {
        super(name);
        // this.name = name;
        System.out.println("스포츠카 생성");
    }

}
