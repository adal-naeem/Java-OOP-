import java.util.Scanner;
public class nestingcontrolstructure {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int failed=0;
        int passed=0;
        int studentcounter =0;
        while(studentcounter<=10){
            System.out.println("enter result (1 for pass , 2 for fail)");
                        int result=input.nextInt();
            if (result==1){
                System.out.println("passed");
            passed = passed + 1;}
            else{
            System.out.println("failed");
            failed=failed+1;
                    }
            studentcounter = studentcounter +1;
        }
        System.out.println(passed);
        System.out.println(failed);
    }
    
    
}
