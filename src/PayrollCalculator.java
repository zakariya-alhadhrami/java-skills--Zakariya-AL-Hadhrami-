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
    public static void processPayroll(String[] employeeTypes, double[] hours, double[] rates, String[] names) {
        int count = Math.min(Math.min(employeeTypes.length, hours.length), Math.min(rates.length, names.length));

        double totalPay = 0;
        double highestPay = Double.MIN_VALUE;
        double lowestPay = Double.MAX_VALUE;
        String highestPaid = "";
        String lowestPaid = "";
        int overtimeCount = 0;



        for (int i = 0; i < count; i++) {
            double overtimeHours = (hours[i] > 40) ? hours[i] - 40 : 0;

            double grossPay = calculateWeeklyPay(employeeTypes[i], hours[i], rates[i]);
            double netPay = calculateTaxDeduction(grossPay, false); // or true if insured

            totalPay += netPay;

            if (netPay > highestPay) {
                highestPay = netPay;
                highestPaid = names[i];
            }

            if (netPay < lowestPay) {
                lowestPay = netPay;
                lowestPaid = names[i];
            }

            if (hours[i] > 40) {
                overtimeCount++;
            }

            System.out.printf("%-15s %-12s %-12.1f %-10.2f %-12.2f%n",
                    names[i], employeeTypes[i], hours[i], grossPay, netPay);
        }

        double averagePay = totalPay / count;

        System.out.println("\nSummary:");
        System.out.println("Highest Paid: " + highestPaid + " (" + highestPay + " OMR)");
        System.out.println("Lowest Paid: " + lowestPaid + " (" + lowestPay + " OMR)");
        System.out.printf("Average Net Pay: %.2f OMR%n", averagePay);
        System.out.println("Employees with overtime (>40 hrs): " + overtimeCount);
    }




    public static void main(String[] args) {


        String[] types = {"FULL_TIME", "PART_TIME", "CONTRACTOR", "INTERN",
                "FULL_TIME"};
        double[] hours = {45, 20, 35, 15, 50};
        double[] rates = {25.0, 18.0, 40.0, 12.0, 30.0};
        String[] names = {"Alice", "Bob", "Charlie", "Diana", "Eve"};

        System.out.println(calculateWeeklyPay("FULL_TIME",40.0,18.0));

        processPayroll(types,hours,rates,names);



    }


}
