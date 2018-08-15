/*Nancy C Fain
 * Week 2 Project
 * Employee Super Class with Salesman and Executive Sub Classes
 * import data from file, and display file data, annual salaries, and averages
 * * Date 06/01/2018
 */
public class Employee {

    //Instance Variables
    private String name;
    private int monthSalary; //whole dollars use int
    int year;
    //Constructor that allows name and monthly salary to be initialized//
    Employee(int year, String name, int monthSalary) {
        this.year = year;
        this.name = name;
        this.monthSalary = monthSalary;
    }
    /* method to calculate annualSalary */
    public int annualSalary()
    {
        return this.monthSalary *12;
    }
        /*To string method to return name and monthly salary*/
        public String toString()
        {
            return "\nEmployee Name:  \t" + this.name + "\nMonthly Salary:  \t"
                    + this.monthSalary + "\nAnnual Salary:  \t" + this.annualSalary () + "\n";
        }
    }
