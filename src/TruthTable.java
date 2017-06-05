import java.util.Scanner;

public class TruthTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in  = new Scanner(System.in);
		
		System.out.println("Input first number: ");  
	    byte num1 = in.nextByte();
	    		
	    System.out.println("Input first number: ");
	    byte num2 = in.nextByte();
	    
	    byte x=num1,y=num2;
	    int u;
		byte v;
	    u=x&y;
//	    v=x&&y;
	   
	    System.out.println(u);
	    
	    
	    }

}
