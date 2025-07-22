public class StudentGradeManager {


    // Method to reverse student names in an array
    public static String[] reverseStudentNames(String[] names) {

        String[] reverseNames ={};

        for (int i =0 ; i < names.length;i++){

            String name = names[i];
            String storenames = "";
            for (int j = name.length(); j > -1; i--){
                storenames += name.charAt(j);
            }

            reverseNames[i] = storenames;

        }

        return reverseNames;}


    public static char getLetterGrade(int score) {
        
        char letter;
        if (score >= 90 && score <= 100) {
            
            letter = 'A';
            
        } else if (score >= 80 && score <= 89) {

            letter = 'B';
            
        } else if (score >= 70 && score <= 79) {

            letter = 'C';

        }
        else {
            letter = 'D';
        }

        return letter;


    }
    


    public static void main(String[] args) {

    }

}
