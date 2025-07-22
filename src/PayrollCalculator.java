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

    public static double calculateTaxDeduction(double grossPay, boolean
            hasHealthInsurance) {
        double total_tax_amount;
        if (hasHealthInsurance == true){
            return grossPay - 50;
        }
        if (grossPay >= 0.0 && grossPay <= 500.0){
            return total_tax_amount = (0.9 * grossPay);
        } else if (grossPay >= 501.0 && grossPay <= 1000) {

            return total_tax_amount = (0.85 * grossPay);

        } else if (grossPay >= 1001.0 && grossPay <= 2000) {
            return total_tax_amount = (0.8 * grossPay);
        }
        else {
            return total_tax_amount = (0.7 * grossPay);
        }
    }
    public static void processPayroll(String[] employeeTypes, double[] hours,
                                      double[] rates, String[] names) {


// Calculate pay for each employee
// Find: highest paid employee, lowest paid employee, average pay
// Count how many employees worked overtime (>40 hours)
// Display results in a formatted table
// Handle arrays of different lengths gracefully
    }



    public static void main(String[] args) {
        System.out.println(calculateWeeklyPay("FULL_TIME",40.0,18.0));
    }


}
