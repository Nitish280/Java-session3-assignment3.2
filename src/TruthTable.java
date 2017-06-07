import java.util.Scanner;

public class TruthTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in  = new Scanner(System.in);
		//we take the input from the user in byte form
		System.out.println("Input first number: ");  
	    byte num1 = in.nextByte();
	    	//we take another input in byte form	
	    System.out.println("Input Second number: ");
	    byte  num2= in.nextByte();
	    
	    int a=num1,b=num2;
		//we initialise here bitwise for this condition
	    System.out.println(a&b); 
		//we initialise here logical 
	    System.out.println(a==1 && b==1);
	 
	    in.close();
	    }

}
