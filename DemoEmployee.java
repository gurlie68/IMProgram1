/*Nancy C Fain
* Week 2 Project
* Employee Super Class with Salesman and Executive Sub Classes
* import data from file, and display file data, annual salaries, and averages
* * Date 05/29/2018 to 06/02/2018
 */

/*imports*/
import java.io.*;
import java.util.*;


/*main class to demo project*/

public class DemoEmployee {

    /*Create private arrays for use in this class for years 2014 and 2015*/
    private ArrayList<Employee> arrayYear2014;
    private ArrayList<Employee> arrayYear2015;

    {
        arrayYear2014 = new ArrayList<> ();
        arrayYear2015 = new ArrayList<> ();
    }

    /*Create Scanner In for file */
    private void create() {
        try {
            Scanner input = new Scanner ( new File ( "C:\\Users\\samsung\\Desktop\\salary.txt") );
            while(input.hasNext ()) {
                int year;
                year = input.nextInt ();

                /*2014 check file for year component*/
                if (year == 2014) {
                    String type = input.next ();
                    String name = input.next ();
                    int monthSalary = input.nextInt ();

                    /*Salesman check file for sub class and it's  component*/
                    switch (type) {
                        case "Salesman": {
                            int finalComponent = input.nextInt ();
                            arrayYear2014.add ( new Salesman ( year, name, monthSalary, finalComponent ) );
                            break;
                        }
                        /*Executive check file for sub class component*/
                        case "Executive": {
                            int finalComponent = input.nextInt ();
                            arrayYear2014.add ( new Executive ( year, name, monthSalary, finalComponent ) );
                            break;
                        }
                        /*Employee is default*/
                        default:
                            arrayYear2014.add ( new Employee ( year, name, monthSalary ) );
                            break;
                    }
                }
                /*2015 check file for sub class and it's components*/
                else if (year == 2015) {
                    String type = input.next ();
                    String name = input.next ();
                    int monthSalary = input.nextInt ();
                    switch (type) {
                        case "Salesman": {
                            int finalElement = input.nextInt ();
                            arrayYear2015.add ( new Salesman ( year, name, monthSalary, finalElement ) );
                            break;
                        }
                        /*Executive check file for sub class element*/
                        case "Executive": {
                            int finalElement = input.nextInt ();
                            arrayYear2015.add ( new Executive ( year, name, monthSalary, finalElement ) );
                            break;
                        }
                        /*Employee is default*/
                        default:
                            arrayYear2015.add ( new Employee ( year, name, monthSalary ) );
                            break;
                    }
                }

            }
        }
        /* handle exceptions*/
        catch (IOException | NoSuchElementException e) {
            System.out.println ( e.getMessage () );
            e.printStackTrace ();
        } catch (NullPointerException e) {
            System.out.println ( e.getMessage () );
        }
    }
    /*end exceptions for file*/

    /*Method for Average Salaries for Employees*/
    private void displayOutput() {

        int average14 = 0;
        int average15 = 0;
        System.out.println ( "\n2014 Data: " );
        for (Employee employee: arrayYear2014) {
            System.out.println ( employee.toString () );
            average14 += employee.annualSalary ();
        }
        average14 = average14 / (arrayYear2014.size ());
        System.out.println ( "\nThe Average Annual Salary for 2014:  " + (average14) );

        System.out.println ( "\n2015 Data: " );
        for (Employee emp: arrayYear2015 ){
            System.out.println ( emp.toString () );
            average15 += emp.annualSalary ();
        }
        average15 = average15 / (arrayYear2015.size ());
        System.out.println ( "\nThe Average Annual Salary for 2015:  " + (average15) );
    }
    public static void main (String [] args){
        DemoEmployee list = new DemoEmployee ();
        list.create();
                list.displayOutput();
        }
    }
