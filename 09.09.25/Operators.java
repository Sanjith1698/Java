class Operators{
	public static void main(String argue[]){
		int x = 10;
		int y = 3;
	
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x*y);
		System.out.println(x%y);
		System.out.println(x/y + "\n\n");
		
		System.out.println("x+y");
		System.out.println("x+y" + x+y);//x+y103
		System.out.println(x+y+"x+y");//13x+y
		System.out.println("x+y"+(x+y)+"\n\n");//x+y13
		
		System.out.println(x-y);//7
		//System.out.println("x-y" + x-y); //this will not work
		System.out.println(x-y+"x-y");//7x-y
		System.out.println("x-y"+(x-y));//x-y7
		System.out.println(x-y+(x-y) + "\n\n");//14
		
		System.out.println(x*y);//30
		System.out.println("x*y"+x*y);//x*y30
		System.out.println(x*y + "x*y");//x*y30
		System.out.println("x*y"+x*y);//x*y30
	}
}