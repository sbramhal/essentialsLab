import java.util.Scanner;


public class SimShopping {

    public static void main(String[] args) {
        ShoppingCart myCart = new ShoppingCart();
        String doneShopping = "no";
        Scanner scan = new Scanner(System.in);
        String itemName;
        double itemPrice;
        int numPurchased;
        
        while(doneShopping.compareTo("no") == 0){
            System.out.println("What is the name of the item you are buying? ");
            itemName = scan.nextLine();
            System.out.println("What is the price of the item: $");
            itemPrice = scan.nextDouble();
            System.out.println("How many are you buying? ");
            numPurchased = scan.nextInt();
            
            myCart.addToCart(itemName, itemPrice, numPurchased);
            
            System.out.println("Are you done shopping? (yes or no): ");
            doneShopping = scan.next();
            if(doneShopping.equalsIgnoreCase("n")) {
                doneShopping = "no";
            }
                
            scan.nextLine();
        }
        
        System.out.println(myCart);

        scan.close();
    }

}
