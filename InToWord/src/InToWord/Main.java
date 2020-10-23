package InToWord;

import java.util.Scanner;

public class Main {
   public static String DigitToWord(int digitIn) { 
      
	   String [] words = {"zero", "one", "two", "three","four","five","six"
			   ,"seven","eight","nine"}; 
       if (digitIn<=0 && digitIn >10) {
    	   return "error" ;
       }
       else {
    	   return words[digitIn];
       }
      //FINISH 
      
   } 
   
   public static String TensDigitToWord(int digitIn) { 
      
	   String [] words = { "twenty", "thirty","fourty","fifty","sixty"
			   ,"seventy","eighty","ninty"}; 
       if (digitIn<2 && digitIn >10) {
    	   return "error" ;
       }
       else {
    	   return words[digitIn-2];
       }
	   // FINISH
      
   } 
   
   public static String TwoDigitNumToWords(int numIn) { 
      
	   int onesDigit = numIn % 10;
	   int tensDigit = numIn / 10; 
	   return (TensDigitToWord(tensDigit) +" "+ DigitToWord(onesDigit)) ;
      //FINISH
      
   } 
   
   public static void main(String[] args) {
      
	   Scanner s = new Scanner(System.in); 
	      int input = s.nextInt();
	      System.out.println(TwoDigitNumToWords(input));
	   // FINISH 
      
   }
}
