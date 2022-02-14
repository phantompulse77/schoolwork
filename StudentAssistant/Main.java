
import java.util.Scanner;
import java.util.ArrayList;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
class Main {
  public static final double MINIMUM_WAGE = 7.25;
  public static final double MAXIMUM_HOURS = 168;
  public static final double SOCIAL_SECURITY = 0.062;
  public static final double FEDERAL_INCOME = 0.1;
  public static Employee addEmployee(Scanner input){
    String name;
    double hw = MINIMUM_WAGE;
    double hrs = 1;
    boolean loop = true;
    
    System.out.print("Employee Name: ");
    name = input.nextLine();
    
    while(loop){
      System.out.print("\nHourly Wage: ");
      hw = input.nextDouble();

      if (hw < MINIMUM_WAGE){
        System.out.println("\nInvalid wage! Must be greater than the federal minimum.");
        loop = true;
      } else if (hw > MINIMUM_WAGE){
        loop = false;
      }
    }
    loop = true;
    while (loop){
      System.out.print("\nTotal hours worked this week: ");
      hrs = input.nextDouble();

      if (hrs > MAXIMUM_HOURS){
        System.out.print("\nInvalid hours! The hours accrued must be less than " + MAXIMUM_HOURS + ".");
        loop = true;
      } else if (hrs < 0){
        System.out.print("\nInvalid hours! The hours accrued must be greater than zero.");
        loop = true;
      } else {
        loop = false;
      }
    }

    return new Employee(name, hw, hrs);
    
  }
  public static ArrayList<Employee> removeEmployee(ArrayList<Employee> roster, Scanner input){
    int empNum = 0;
    boolean loop = true;
    ArrayList<Employee> rosterCopy = roster;
    if (roster.size() <= 0){
      System.out.println("\nYou have no employees to remove!");
    } else {
      printRoster(rosterCopy);

      while (loop){
      System.out.print("\nEnter in the number corresponding to the employee you'd like to remove: ");
      empNum = input.nextInt();

      if (empNum > rosterCopy.size() || empNum <= 0){
        System.out.println("\nThe number entered doesn't correspond to any employees! Please reenter.");
        loop = true;
      } else {
        rosterCopy.remove(empNum - 1);
        loop = false;
      }
      }
    }
    return rosterCopy;
  }
  public static void printRoster(ArrayList<Employee> roster){
    for (int i = 0; i < roster.size(); i++){
      System.out.println("-----------------------------------");
      System.out.println("[" + (i + 1) + "]" + "\nName: " + roster.get(i).getName());
      System.out.println("Hourly Wage: " + roster.get(i).getHourlyWage());
      System.out.println("Hours Worked: " + roster.get(i).getHours());
    }
  }

  public static double round (double num){
    double r = 0;
    r = Math.round(num * 100.0) / 100.0;
    return r;
  }
  public static void generatePaychecks(ArrayList<Employee> roster) throws FileNotFoundException{
    for (int i = 0; i < roster.size(); i++){
      double sc = 0;
      double gp = 0;
      double fi = 0;
      double np = 0;
      PrintWriter out = new PrintWriter("./paychecks/" + roster.get(i).getName() + ".txt");
      out.println("---------------");
      out.println(roster.get(i).getName() + "\'s Paycheck\n");
      gp = roster.get(i).getHourlyWage() * roster.get(i).getHours();
      gp = round(gp);
      out.println("Gross Pay: $" + gp);
      out.println("Hourly Wage: " + roster.get(i).getHourlyWage());
      out.println("Hours Worked: " + roster.get(i).getHours() + "\n");
      sc = SOCIAL_SECURITY * gp;
      sc = round(sc);
      out.println("Social Security (" + (SOCIAL_SECURITY * 100) + "%): " + sc);
      fi = FEDERAL_INCOME * gp;
      fi = round(fi);
      out.println("Federal Income Tax (" + FEDERAL_INCOME * 100 + "%): " + fi + "\n");
      np = gp - sc - fi;
      np = round(np);
      out.println("Net Pay: $" + np);
      out.println("---------------");

      System.out.println(roster.get(i).getName() + "\'s Paycheck Generated Successfully!");
      out.close();
    }
  }

  public static void generateOverhead(ArrayList<Employee> roster){
    double overhead = 0;

    for (int i = 0; i < roster.size(); i++){
      double gp = roster.get(i).getHourlyWage() * roster.get(i).getHours();
      gp = round(gp);
      System.out.println(roster.get(i).getName() + "\'s Gross Pay: $" + gp);

      overhead += gp;
    }

    System.out.println("\n" + "Total Labor Overhead: $" + overhead);
  }
  public static void main(String[] args) {
    int selection;
    boolean loop = true;
    Scanner usrInput = new Scanner(System.in);
    ArrayList<Employee> workforce = new ArrayList<Employee>();
    System.out.println("Welcome to the payment management portal!");
    while (loop){
    System.out.println("\nMenu:\n(1) Add new employee...\n(2) Remove an employee...\n(3) Print employee list... \n(4) Generate paychecks...\n(5) Generate labor overhead...");
    selection = usrInput.nextInt();
    usrInput.nextLine();

    switch(selection){
      default:
        System.out.println("Not a valid selection!");
        break;
      case 1:
      workforce.add(addEmployee(usrInput));
      break;
      case 2:
      removeEmployee(workforce, usrInput);
      break;
      case 3:
      printRoster(workforce);
      break;
      case 4:
      try {
        generatePaychecks(workforce);
      } catch (FileNotFoundException e){
        e.printStackTrace();
      }
      
      break;
      case 5:
      generateOverhead(workforce);
      break;
    }
    } 
    
  }
}