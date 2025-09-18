class Forloop{
	public static void main(String args[]){
		
		
		for(int x=1;x<=5;x++){
			for (int y=1; y<=x; y++){
				System.out.print(y);
			}
			System.out.println();
		}
		
		System.out.println("*************\n");
		
		for(int j=1; j<=5; j++){
			for(int k=1; k<=j; k++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}