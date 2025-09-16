import java.util.Scanner;
class UserInput{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter product price : ");
		int product=scan.nextInt();
		
		float tax = 0;
		float total = 0;
		
		
		if(product < 0){
			System.out.print("Enter a valid amount : ");
			product=scan.nextInt();
		}
		
		else if(product <= 100000 && product > 0){
			tax=(product*5)/100;
			total = product + tax;
			
		}
		else if(product <= 300000 && product > 499000 ){
			tax=(product*8)/100;
			total = product + tax;
			
		}
		else if(product <= 500000){
			tax=(product*12)/100;
			total = product + tax;
		}
		else{
			tax=(product*20)/100;
			total = product + tax;
		}
		
		System.out.println("Tax amount :" + tax);
		System.out.println("Your total amount is:" + total);
 }
 
}