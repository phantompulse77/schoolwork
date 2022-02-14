public class Employee {

  private String myName;
  private double myHourlyWage;
  private double myHours;

  public Employee (String name, double hourlyWage, double hours){
    myName = name;
    myHourlyWage = hourlyWage;
    myHours = hours;
  }

  public String getName(){
    return myName;
  }
  public double getHourlyWage(){
    return myHourlyWage;
  }

  public boolean updateWage(double newWage){
    if (newWage < Main.MINIMUM_WAGE){
      return false;
    } else if (newWage >= Main.MINIMUM_WAGE && newWage > 0){
      myHourlyWage = newWage;
      return true;
    } else {
      return false;
    }
  }

  public double getHours(){
    return myHours;
  }

  public boolean updateHours(double newHours){
    if (newHours > Main.MAXIMUM_HOURS){
      return false;
    } else if (newHours <= Main.MAXIMUM_HOURS && newHours > 0){
      myHours = newHours;
      return true;
    } else {
      return false;
    }


  }
}