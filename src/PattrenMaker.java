public class PattrenMaker {

    // Print a number triangle
    public static void printNumberTriangle(int rows) {

        for (int i = 1; i<rows+1;i++){

            for (int j = 1; j <= i;j++){

                System.out.print(j + " ");
            }

            System.out.println();




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

        printNumberTriangle(4);

        System.out.println("--------------------------------------");

        printMultiplicationTable(5,12);
    }

}
