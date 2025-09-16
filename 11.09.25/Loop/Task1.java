class Task1{
	public static void main(String args[]){
		int x = 1;
		
		/*
		while(x<=20){
			System.out.println(x); // print 1 to 20
			x++;
		}
		*/
		
		while(x<=5){
			if((x%2) == 1){
				System.out.print(x);
			}
			else{
				System.out.print("*");
			}
		x++;
		}
	}
}