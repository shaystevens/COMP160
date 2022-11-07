public class FlatBudget{
  public static void main(String[]args){
    int numberInFlat = 4;
    String MONTH = "July 2020";
    int numDays = 31;
    double numWeeksInMonth = numDays/7.0;
    double groceriesWeekly = 210.0;
    double servicesMonthly = 279.0;
    double rentFortnightly = 824.0;
    double servicesWeekly = servicesMonthly / numWeeksInMonth;
    double rentWeekly = rentFortnightly / 2.0;
    
    double expensesTotalPerWeek = groceriesWeekly + servicesWeekly + rentWeekly;
    double eachPersonPerWeek = expensesTotalPerWeek / numberInFlat;
    
    System.out.println("Each person pays $" + eachPersonPerWeek + " weekly for " + MONTH);
 
  }
}
      
    