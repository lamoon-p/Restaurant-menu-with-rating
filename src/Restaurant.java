import java.util.ArrayList;
import java.util.List;

public class Restaurant {

    private List<String> menuItems = new ArrayList<>();
    private List<Integer> prices = new ArrayList<>();
    private List<ArrayList<Integer>> ratings = new ArrayList<>();

    public void addMenuItem(String name, int price) {

        menuItems.add(name);
        prices.add(price);
        ratings.add(new ArrayList<>());

        System.out.println(name + " added to the menu!");
    }

    public void removeMenuItem(String name) {

        int index = menuItems.indexOf(name);
        menuItems.remove(index);
        prices.remove(index);
        ratings.remove(index);

        System.out.println(name + " removed from the menu!");
    }

    public void addRating(String name, int rating) {

        if (rating < 0) rating = 0;
        if (rating > 5) rating = 5;

        int index = menuItems.indexOf(name);
        ratings.get(index).add(rating);

        System.out.println("Rating " + rating + " of 5 added to " + name);
    }

    public double averageRating(String name) {

        int index = menuItems.indexOf(name);

        Double average = ratings.get(index).stream().mapToDouble(val -> val).average().orElse(0.0);
        return average;
    }

    public void retrieveMenu() {

        for (int i = 0 ; i < menuItems.size(); i++) {
            System.out.println(menuItems.get(i) + ": " + prices.get(i) + " Gold coins. Rating: " + averageRating(menuItems.get(i)));
        }
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "menuItems=" + menuItems +
                ", prices=" + prices +
                ", ratings=" + ratings +
                '}';
    }
}
