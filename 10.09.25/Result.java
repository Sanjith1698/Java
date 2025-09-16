import java.util.Scanner;
class Result{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Your Marks ");
		int mark = scan.nextInt();
		
		String result = "null";
		
		if(mark >= 75){
			result = "A";
		}
		else if( mark < 75 && mark >= 60){
			result = "B";
		}
		else if (mark < 60 && mark >= 50){
			result = "C";
		}
		else if(mark < 50 && mark >= 35){
			result = "S";
		}
		else{
			result = "Fail";
		}
		
		System.out.println("Result is " + result);
	}
}