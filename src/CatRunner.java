import java.util.ArrayList;

public class CatRunner {
    public static void main(String[] args) {
        ArrayList<Cat> cats = new ArrayList<Cat>();
        cats.add(new Cat("tim"));
        cats.add(new Cat("tom"));
        cats.add(new Cat("todd"));
        System.out.println(cats);

        Cat cat4 = new Cat("timmy");
        Cat replacedCat = cats.set(2, cat4);
        System.out.println(cats);
        System.out.println(replacedCat);
        cat4.setName(cat4.getName() + " Meow");
        System.out.println(cat4);
        for (int i = 0; i < cats.size(); i++) {
            cats.get(i).setName(cats.get(i).getName().toUpperCase());
        }
        System.out.println(cats);
        cats.add(new Cat("SAM"));
        System.out.println(cats);
    }
}
