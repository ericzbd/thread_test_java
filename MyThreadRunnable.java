public class MyThreadRunnable /*implements Runnable */{ 

 
             public void run(int inputtedInt){      
    
                 for (int i=0; i < inputtedInt; i++){   
                          
                   System.out.println("Thread Running..." + inputtedInt);
      
         

      
      }//end for

  }//end run  
 

   
      
      public static void main(String[] args){
      
         
      
              Thread t1 = new Thread(new MyThread(250)); 
                      
              Thread t2 = new Thread(new MyThread(300));
              
              Thread t3 = new Thread(new MyThread(350));              
             
              Thread t4 = new Thread(new MyThread(400));


        
              t1.start();
        
              t2.start();
 
              t3.start();
               
              t4.start();

       
        }//end main
      
}//end class