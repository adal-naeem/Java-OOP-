public class Account {
    String title;
    public Account(){
        this.title=("default value");
        System.out.println("constructor with no arguments \\ default value");
    }
    public Account( String s){
        this.title=s;
        System.out.println("constructor with argument i:e "+ s);
        
        
    }
//    public Account()
//    { 
//        this.title=("default value");//as constructors are used to initialize(give value) object
//        System.out.println("constructor with no arguments");
//    }
//    
//    public Account(String s)
//    { 
//        this.title=s;//as constructors are used to initialize(give value) object
//        System.out.println("constructor with arguments");
//    }
    String getname(){
       return title;
    }
    void setname(String s){
        this.title=s;
    }
}
