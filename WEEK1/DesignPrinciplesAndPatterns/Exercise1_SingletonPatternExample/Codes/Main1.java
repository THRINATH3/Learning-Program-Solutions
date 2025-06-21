package WEEK1.DesignPrinciplesAndPatterns.Exercise1_SingletonPatternExample.Codes;

public class Main1 {

    public static void main(String[] args) {
         Logger log1 = Logger.getInst();
         Logger log2 = Logger.getInst();  
         
         log1.msg("Message from Log1");
         log2.msg("Message from log2");

         if(log1 == log2){
            System.out.println("Having same instance");
         } else {
            System.out.println("Having different instances");
         }
    }
}
