/*Nancy C Fain
 * Week 2 Project
 * Employee Super Class with Salesman and Executive Sub Classes
 * import data from file, and display file data, annual salaries, and averages
 * * Date 05/30/2018
 */
public class Salesman extends Employee{

    /*Instance variable annualSales*/
    private int annualSales;

    /*constructor allowing name, monthly salary, and annual sales to initialize*/
    Salesman(int year, String name, int monthSalary, int  annualSales) {
        super (year, name, monthSalary );
        this.annualSales = annualSales;
        }

    /* Override method for annualSalary to return for year */
    /*needs limit to 20k*/
    @Override
    public int annualSalary() {
        int commission = (int) (this.annualSales*.02);

        if(commission > 20000){
            commission=20000;
        }
        return super.annualSalary () + commission;
    }
    /*Override toString Method that returns name, monthly salary, and annual sales*/
    @Override
    public String toString()
    {
        return super.toString () + "Annual Sales:  \t\t" +annualSales;
    }
}





