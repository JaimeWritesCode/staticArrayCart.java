public class Human {
    GroceryItem hand;
    GroceryItem[] shoppingCart = new GroceryItem[10];

    Human(){

    }

   //Action method
    public void picked(GroceryItem x){
        hand = x;
        place(hand);
        hand = null;
        System.out.println("Item " + x + " has been picked up.");
    }

    //Accessor method
    public int locateSlot(){
        for(int i = 0; i < shoppingCart.length; i++){
            if(shoppingCart[i] == null){
                return i;
            }
        }
        return -1;
    }

    //Action method
    public void place(GroceryItem x){
        int index = locateSlot();
        if(index != -1){
           shoppingCart[index] = x;
           System.out.println("She placed "+ x +" at index " + index);
       } else {
           System.out.println("The cart is full.");
       }


    }
}
