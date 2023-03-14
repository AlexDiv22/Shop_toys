import java.util.ArrayList;
import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) {
        ArrayList<Toys> list = new ArrayList<>();
        ArrayDeque<Toys> list_prize = new ArrayDeque<>();

        Toys Car = new Toys(1, "BMW", 1, 40);
        Toys Animal = new Toys(2, "Wolf", 1, 30);
        Toys Hero = new Toys(3, "Batman", 1, 10);
        Toys Object = new Toys(4, "Сube", 3, 50);
        Draw_Toys take = new Draw_Toys();
        App app = new App();

        list.add(Object);
        list.add(Car);
        list.add(Hero);
        list.add(Animal);
        app.start(list, list_prize, take);
    }
}