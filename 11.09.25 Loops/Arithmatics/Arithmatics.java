class Arithmatics{
	public static void main(String args[]){
		/*
		int x = 10;
		
		System.out.println(x++);//10 postfix
		System.out.println(x);//11
		System.out.println(++x);//12 prefix
		*/
		
		int a = 10;
		int b = 5;
		int c = 3;
		
		a=b++ + c++;
		
		System.out.println("a : " + a);//8
		System.out.println("b : " + b);//6
		System.out.println("c : " + c + "\n");//4
		
		b=a-- + --b - c++;
		
		System.out.println("a : " + a);//7
		System.out.println("b : " + b);//9
		System.out.println("c : " + c + "\n");//5
		
		c=--c - ++a - ++c + --b;
		
		System.out.println("a : " + a);//8
		System.out.println("b : " + b);//8
		System.out.println("c : " + c);//-1
	}
}