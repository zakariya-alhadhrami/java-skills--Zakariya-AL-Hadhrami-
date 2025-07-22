import java.util.Scanner;
public class Textprocessor {


    public static int countWords(String sentence) {
        Scanner input = new Scanner(System.in);


        if(sentence.isEmpty()==true){
            System.out.println("sentence is Empty");

        }
        else {

            String[] words = sentence.split(" ");
            int count = words.length;
            return count;

        }

        return 0;
    }

    public static void main(String[] args) {
        



    }
}
