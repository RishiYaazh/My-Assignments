package week1.day2;

public class FindPalindromeNumber {

	public static void main(String[] args) {
		int r,sum=0,temp;    
		  int n=121;
		  
		  temp=n;   
		  //for() {}
		  for (int i = 0; n > 0; i++) {
			  r=n%10;  
			   sum=(sum*10)+r;    
			   n=n/10; 
		}
		  
		  
		  
		  
		  
	  
		  if(temp==sum)    
		   System.out.println("palindrome number "); 
		  
		  
		  else    
		   System.out.println("not palindrome");    
		
	}

}
