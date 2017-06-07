import java.util.Scanner;

public class TruthTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in  = new Scanner(System.in);
		
		System.out.println("Input first number: ");  
	    byte num1 = in.nextByte();
	    		
	    System.out.println("Input first number: ");
	    byte  num2= in.nextByte();
	    
	    int a=num1,b=num2;
	    System.out.println(a&b); 
	    System.out.println(a==1 && b==1);
	 
	    in.close();
	    }

}
