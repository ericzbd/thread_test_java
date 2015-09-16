public class MyThread extends Thread {

   public MyThread(int inputtedInt){
   
      for (int i=0; i < inputtedInt; i++){
         
      System.out.println("Thread Running..." + inputtedInt);
      
      }//end for
   
      
   
      }//end constructor
      
      public static void main(String[] args){
      
  //       MyThread mt = new MyThread(200); //Mr. Enz's code
         
        Thread t1 = new Thread(new MyThread(250)); //code I found somewhere
        
        Thread t2 = new Thread(new MyThread(300));
         
   //      run();
      
         }//end main      

}//end class