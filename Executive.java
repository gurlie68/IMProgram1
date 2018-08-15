/*Nancy C Fain
 * Week 2 Project
 * Employee Super Class with Salesman and Executive Sub Classes
 * import data from file, and display file data, annual salaries, and averages
 * * Date 06/01/2018
 */
public class Executive extends Employee {
    /*instance variable*/
    private int stockPrice;

    /*Constructor for name, salary, and stockPrice*/
    Executive(int year, String name, int monthSalary, int stockPrice) {
        super(year,name,monthSalary);
        this.stockPrice = stockPrice;
    }
    /*Override Annual Salary to return for whole year*/
    /*limit Stock to greater than 50 or no bonus*/
    @Override
    public int annualSalary() {
        int bonus = 0;
        if (this.stockPrice > 50) bonus = 30000;
        return super.annualSalary () + bonus;
    }
        /*Override to String for name, monthly salary, stock price*/
        @Override
        public String toString()
        {
            return super.toString () +"Stock Price:  \t\t" + stockPrice;
        }
}
