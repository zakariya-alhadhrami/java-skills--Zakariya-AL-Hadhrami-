public class PattrenMaker {

    // Print a number triangle
    public static void printNumberTriangle(int rows) {

        for (int i = 1; i<rows+1;i++){




        }
// Print pattern like:
// 1
// 1 2
// 1 2 3
// 1 2 3 4
// (for rows = 4)
    }




    public static void printMultiplicationTable(int number, int limit) {

        for(int i = 1; i < limit+1; i++){

            System.out.println(number + " x " + i + " = " + (number * i));

        }
    }

    public static void main(String[] args) {

        printMultiplicationTable(5,12);



    }

}
