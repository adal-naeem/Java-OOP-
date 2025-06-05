class messagesender {
void messagesend(){
    System.out.println("general message send");
}    
}
class emailmessagesender extends messagesender {
   
void messagesend(){
    System.out.println("email message send");
}    
}


public class methodoverriding {
    public static void main(String[] args) {
        messagesender m1 = new messagesender();
       emailmessagesender m2 = new  emailmessagesender();
       m1.messagesend();
       m2.messagesend();
    }
   
}
