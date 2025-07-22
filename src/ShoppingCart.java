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


    public static void main(String[] args) {
        double[] cart = {25.99, 45.50, 12.99, 89.99, 15.75};
        System.out.println("Regular customer total: $" + calculateTotal(cart,
                "REGULAR"));



    }
}
