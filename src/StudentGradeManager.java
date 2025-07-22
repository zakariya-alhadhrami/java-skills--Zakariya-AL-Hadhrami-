public class StudentGradeManager {


    // Method to reverse student names in an array
    public static String[] reverseStudentNames(String[] names) {

        String[] reverseNames ={};

        for (int i =0 ; i < names.length;i++){

            String name = names[i];
            String storenames = "";
            for (int j = name.length(); j > 0; i--){
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
    public static String[] findFailingStudents(String[] names, int[] scores)
    {
        String[] notgoodStudent = new String[names.length];

        char letter = 'D';

        for (int i = 0; i < names.length;i++){

            int score = scores [i];

            if(letter == getLetterGrade(score)){
                notgoodStudent[i] += names[i];
            }

        }

        return notgoodStudent;
// Return array of names where score is below 60
// Use loops to check each student
    }
    


    public static void main(String[] args) {

        String[] students = {"Alice", "Bob", "Charlie", "Diana"};
        int[] scores = {95, 67, 45, 78};

        System.out.println(findFailingStudents(students,scores));

    }

}
