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
    public static String replaceWord(String text, String oldWord, String
            newWord) {

        return text.replace(oldWord,newWord);

    }


    public static void main(String[] args) {
        String test = "Java is fun and Java is powerful";
        System.out.println("number of words are "+countWords(test));

        System.out.println("---------------------------------------");

        System.out.println(replaceWord(test, "Java", "Programming"));


    }
}
