/*import java.util.Scanner;
public class input {
    public static void main( String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter age :");
        int age =sc.nextInt();
        System.out.println(age);       
    }
}*/
import java.util.Scanner;
public class input{
   public static void main(String args[]){
       Scanner input = new Scanner(System.in);
       System.out.println("enter first number");
       int num1 = input.nextInt();
System.out.println("enter second number");
       int num2 = input.nextInt();
       int sum=num1 + num2;
  System.out.println("sum of given numbers is :"+sum);
       System.out.println("sum of given numbers is :"+(num2+num1));
      //for character input.next().charAt(0);
      //for one word string input.next();
      //for line of string input.nextline();
      //for other data types just use next i:e nextInt,nextlong,nextboolean
       System.out.println("enter firts name:");
       String name=input.next();
       input.nextLine();
        System.out.println("enter address:");
        String address = input.nextLine();
       System.out.println("enter grade:");
        char grade=input.next().charAt(0);
        
    
   }
}
 