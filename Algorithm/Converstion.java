package DataStructures;

public class Converstion {
	private String n;
	
	public static void main(String [] arg){
		
		System.out.print(Converstion.convertStringToInt("123"));
		
		
	}
	
	
	
	
	public static int convertStringToInt(String input){
		
		
		
		int num =0;
		for(int i=0;i<input.length();i++){
			
			if((int)(input.charAt(i)) >= 48 &&  (int)(input.charAt(i)) <= 59){
				
				num = num*10+ (int)(input.charAt(i))-48;
				
			}
			else{
				
				throw new NumberFormatException();
			}
			
			
		}
		return num;
		
		
		
	}

}
