import java.util.ArrayList;
import java.util.Iterator;

public class Names {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("홍길동");
        names.add("권수빈");
        names.add("전동석");

        for (String name : names) {
            System.out.println(name);
        }

        Iterator<String> iterator = names.iterator();
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());

        Iterator<String> nameIterator = names.iterator();
        while (nameIterator.hasNext()) {
            System.out.println(nameIterator.next());
        }

    }
}