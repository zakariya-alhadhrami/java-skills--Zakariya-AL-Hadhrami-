import java.util.Scanner;

public class PayrollCalculator {


    public static double calculateWeeklyPay(String employeeType, double hoursWorked, double hourlyRate){
        Scanner input = new Scanner(System.in);
        int RegularPayy = 200;  // 200 OMR
        double pay = 0;

        switch (employeeType){
            case "FULL_TIME":
                if(hoursWorked <= 40.0){
                     pay = RegularPayy;

                }
                else {
                    System.out.print("how many hours of overtime you did? : ");
                    double hours = input.nextDouble();
                     pay = RegularPayy + (1.5 * hourlyRate * hours );

                }break;

            case "PART_TIME":
                if (hoursWorked > 25.0){
                    System.out.println("Since you are a part timer u should've known to not work more that 25 hours");
                    hoursWorked = 25;
                     pay = RegularPayy + (hourlyRate * hoursWorked);

                }else {
                     pay = RegularPayy;

                }break;

            case "CONTRACTOR":
                 pay = hoursWorked * hourlyRate;
                break;

            case "INTERN":
                 pay = (0.8 * hourlyRate) * hoursWorked;
                break;



        }

        return pay;

    }

    public static void main(String[] args) {
        System.out.println(calculateWeeklyPay("FULL_TIME",40.0,18.0));
    }


}
