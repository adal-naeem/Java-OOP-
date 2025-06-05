public class TestTimer {
    public static void main(String[] args) {
        TimerClock obj1 = new TimerClock(12,6,0);
        System.out.println(obj1.getcount());
        TimerClock obj2 = new TimerClock();
        System.out.println(obj2.getcount());
        try{
        obj1.setTime(21,59,44);
        //displayTime("after clock is set",obj1);
        
           }catch(IllegalArgumentException e){
              System.out.println(e.getMessage());   
           }
       //public static void displayTime(String s,TimerClock t1){

        
       // System.out.println(s + t1.toUniversalString());
    }
}
