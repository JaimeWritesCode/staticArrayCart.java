public class Main {
    public static void main(String[] args) {
        GroceryItem noodles, juice, soap, sardine;
        Human anna = new Human();

        noodles = new GroceryItem();
        juice = new GroceryItem();
        soap = new GroceryItem();
        sardine = new GroceryItem();

        anna.picked(noodles);
        anna.picked(juice);
        anna.picked(soap);
        anna.picked(sardine);

        anna.picked(noodles);
        anna.picked(juice);
        anna.picked(soap);
        anna.picked(sardine);


    }
}
