public class exceptionhandelling {
    public static void main(String[] args) {
     int arr[]={1,2,3,4,5,6,7,8,9};
        System.out.println(arr[1]);
        try{
            System.out.println(arr[-1]);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println(arr[2]);
            System.out.println(arr[3]);
            System.out.println(arr[4]);
        }     
        /*   int arr[]={1,2,3,4,5,6,7,8,9};
        System.out.println(arr[1]);
 
        try {                                          // exceptional bna dena 
           System.out.println(arr[-1]);                 //try na ho to error dy ga mistake wala portion
       }catch(Exception e){                            //handling krna 
           
           System.out.println(e.getMessage());
       } finally{                                      //to execute remaining program
        System.out.println(arr[2]);                   
        System.out.println(arr[3]);
        System.out.println(arr[4]);
        }*/
     
     
    }
}
