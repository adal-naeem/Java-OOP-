import java.util.Scanner;
public class switchstatemnt {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("enter ist num : ");
        int num1=input.nextInt();
        System.out.print("enter second num : ");
        int num2=input.nextInt();
        System.out.print("enter operator : ");
        char optr=input.next().charAt(0);
        double c;   
        switch(optr){

        case '+':
        c =num1+num2;System.out.println("addition is : "+c);
            
          case '-':
        c =num1-num2;System.out.println("substraction is : "+c);
        
         case '*':
        c =num1*num2;System.out.println("multiplicationtion is : "+c);
         case '%':
        c =num1%num2;System.out.println("remainder is : "+c);
        }
    }
}
//char optr=input.next().charAt(0);