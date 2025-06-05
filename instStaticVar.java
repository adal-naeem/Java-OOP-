public class instStaticVar {
    int a=8;//instance variable,no initialization means zero value (default),it can be accessed for objects 
    public static void main(String[] args) {
        instStaticVar obj = new instStaticVar();
        System.out.println(obj.a);
//static should be used in class , it cann be accesse by classname.staticvariable or method, static is for shared/common attribute for which no need of object 
    }
    
}
