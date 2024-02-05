package day03;

public class SalaryCalculator {
  public static void main(String[] args) {
    double hourlyRate = 50;
    int weeklyHours = 45;
    double stateTaxRate = 6;
    double federalTaxRate = 26;
    
    double salaryBeforeTax = hourlyRate * weeklyHours * 52;
    double stateTax = salaryBeforeTax * stateTaxRate / 100;
    double federalTax = salaryBeforeTax * federalTaxRate / 100;
    double totalTax = stateTax + federalTax;
    double netIncome = salaryBeforeTax - totalTax;
    
    System.out.println("Gross pay is:\t" + salaryBeforeTax);
    System.out.println("State tax is:\t" + stateTax);
    System.out.println("Federal tax is:\t" + federalTax);
    System.out.println("Total tax is:\t" + totalTax);
    System.out.println("Net income is:\t" + netIncome);
    /*salaryBeforeTax (Yearly salary before tax)
    stateTax (Yearly state tax)
    federalTax (Yearly federal tax)
    totalTax (yearly total tax)
    salaryAfterTax (Yearly salary after tax)*/
  }
}
