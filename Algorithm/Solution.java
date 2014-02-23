package DataStructures;



class Solution {
  
	public static void main(String [] arg) {
	    int month[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	    String day[] = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};   
	    int d=10, m=2, y=2014, i; 

	   
	    // correction for leap year
	    if (y % 4 == 0 && (y % 100 != 0 || y % 400 == 0))
	        month[1] = 29;

	    if (y < 1900 || m < 1 || m > 12 || d < 1 || d > month[m - 1]) {
	      
	        
	    }

	    for (i = 1900; i < y; i++)
	        if (i % 4 == 0 && (i % 100 != 0 || i % 400 == 0))
	            d += 366;
	        else
	            d += 365;

	    for (i = 0; i < m - 1; i++) 
	        d += month[i];

	    System.out.print("This is a %s.\n"+day[d % 7]);
	    
	}
  
   
  
  
  
  
}
