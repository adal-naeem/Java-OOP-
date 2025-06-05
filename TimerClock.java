/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Adil Naeem
 */
public class TimerClock {
  private static int count=0;//to count how many objects created and can be used in same class
  private int Hours;//0-24
  private int Minutes;//0-60
  private int Seconds;//0-60
    public TimerClock(){
        this(12,0,0);
    }
    public TimerClock(int h, int m, int s ){
        this.Hours = h;
        this.Minutes = m;
        this.Seconds = s;
        count ++;
    }
    public void setTime(int Hours, int Minutes, int Seconds){
        if((Hours<0||Hours>24)||(Minutes<0||Minutes>59)||(Seconds<0||Seconds>59))
        throw new IllegalArgumentException();
        this.Hours=Hours;
        this.Minutes=Minutes;
        this.Seconds=Seconds;
          }
   
   public String toUniversalString(){
       return String.format("%02d:%02d:%02d",Hours,Minutes,Seconds);
       
   }
  public int getcount(){
      return count;
       
   }
   }
