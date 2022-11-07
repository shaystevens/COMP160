public class PersonApp{
public static void main(String[]args){
Person person1 = new Person();
person1.methodOne(19);
person1.methodTwo("Brian Berry", "Ireland");
System.out.println("Age is " + methodThree()); // line a. syntax error? Yes / No
System.out.println(person1.methodFour()); // line b. syntax error? Yes / No
System.out.println(person1.methodFive()); // line c. syntax error? Yes / No
}
}
