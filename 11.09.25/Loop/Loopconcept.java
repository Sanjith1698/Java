import java.util.Scanner;
class Loopconcept{
	public static void main(String args[]){
		
		Scanner scan = new Scanner(System.in);
		

		double product =0;
		double tax = 0;
		double total = 0;
		

		while(true){
			System.out.print("Please enter the price amount : ");
			if(scan.hasNextDouble()){
				product=scan.nextDouble();
					if(product>0.0){
						break;
					}
					else{
						System.out.println("Product price must be greater than 0 : ");
					}
			}
				else{
					System.out.println("The amount must be a number");
					scan.next();
				}
			}

			
			if(product <= 100000 && product > 0){
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