import java.util.Scanner;
class SwitchExample{
	public static void main(String args[]){
 
                System.out.println("Enter a number:");
		Scanner s= new Scanner(System.in);
		while(!s.hasNextInt()){
			System.out.println("Invalid Input, Please Enter a Number:");
			s.next();
		}
	        int n = s.nextInt();

 		System.out.println("Entered number is:"+n);
		switch(n){
			case 0: System.out.println("case 0 executed:");
			break;
			case 10: System.out.println("case 10 executed:");
			break;
			case 20: System.out.println("case 20 executed:");
			break;
			case 30: System.out.println("case 30 executed:");
			break;
			default: System.out.println("default executed:");
			System.out.println("Testing");
			System.out.println("Testing1");	
		        break;

		}
 		
	}
}

