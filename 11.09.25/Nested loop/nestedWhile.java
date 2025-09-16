class nestedWhile{
	public static void main(String args[]){
		int x = 1;
		
		while(x<=5){
			int y = 1;
			while(y<=5){
				System.out.print(x);
				y++;
			}
			System.out.println(); // this will move to next line
			x++;
		}
		
		int j = 1;
		
		while(j <= 5){
			int k = 1;
			while(k <= j){
				System.out.print("*");
				k++;
			}
		System.out.println();
		j++;
		}
	}
}