public class ShoppingCart {
    // Calculate total price with discounts
    public static double calculateTotal(double[] prices, String customerType)
    {
        double total = 0;

        for(int i=0;i<prices.length;i++){

            total += prices[i];
        }

        switch (customerType){
            case "REGULAR":
                break;


            case "PREMIUM":
                total = total - (total * 0.1);
                break;

            case "VIP":
                total = total - (total * 0.2);



        }

        return total;
    }

    public static double findMostExpensive(double[] prices) {
        double expinsiveItem = 0;

        if(prices.length == 0){
            System.out.println("the cart is empty.");
        }
        else{

        for (int i = 0;i<prices.length;i++){

            if (prices[i] > expinsiveItem) {

                expinsiveItem = prices[i];

            }

        }

        }

        return expinsiveItem;
    }

    // Count items above a certain price
    public static int countExpensiveItems(double[] prices, double threshold)
    {
        int count = 0;

        for (int i = 0; i < prices.length;i++){

            if (prices[i] > threshold) {
                count++;

            }

        }

        return count;
// Count how many items cost more than threshold
    }





    public static void main(String[] args) {
        double[] cart = {25.99, 45.50, 12.99, 89.99, 15.75};
        System.out.println("Regular customer total: $" + calculateTotal(cart,
                "REGULAR"));

        System.out.println("Premium customer total: $" + calculateTotal(cart,
                "PREMIUM"));
        System.out.println("VIP customer total: $" + calculateTotal(cart,
                "VIP"));


        System.out.println("the most expensive price is: "+findMostExpensive(cart));

        System.out.println("there are "+countExpensiveItems(cart,30)+" Items that are more than 30$ ");



    }
}
