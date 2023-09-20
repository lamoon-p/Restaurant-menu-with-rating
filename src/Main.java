public class Main {

    public static void main(String[] args) {
	// write your code here
        Restaurant restaurant1 = new Restaurant();
        restaurant1.addMenuItem("Pad Ka Pow", 50);
        restaurant1.addMenuItem("Pad Kee Mao", 60);
        restaurant1.addMenuItem("Omelette and rice", 35);

        restaurant1.removeMenuItem("Pad Ka Pow");

        restaurant1.addRating("Pad Kee Mao", 5);
        restaurant1.addRating("Pad Kee Mao", 4);
        restaurant1.addRating("Pad Kee Mao", 3);
        restaurant1.addRating("Pad Kee Mao", 2);
        restaurant1.addRating("Omelette and rice", 5);
        restaurant1.addRating("Omelette and rice", 5);
        restaurant1.addRating("Omelette and rice", 3);
        restaurant1.addRating("Omelette and rice", 3);

        restaurant1.retrieveMenu();

    }
}
