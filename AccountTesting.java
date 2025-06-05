public class AccountTesting {
    public static void main(String[] args) {
        Account obj = new Account();
        Account obj1 = new Account(" Adil Naeem");
        obj.setname("Anwar");
        obj1.setname("Ali");
        String p=obj.getname();
        System.out.println(p);
        String q=obj.getname();
        System.out.println(q);
//        Account obj = new Account();//constructor called
//        Account obj1 = new Account("adil");//passs an argument here
//        obj.setname("adil");
//        System.out.println(obj1.getname());
    }
}
