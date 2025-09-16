class Relational{
	public static void main(String args[]){
		int x = 10;
		int y = 5;
		
		System.out.println("x==y " + (x==y));//false
		System.out.println("x!=y " + (x!=y));//true
		System.out.println("x>y " + (x>y));//true
		System.out.println("x<y " + (x<y));//false
		System.out.println("x>=y " + (x >= y));//true it means either x is bigger than y OR x equals y.
		System.out.println("x=<y " +(x <= y)+"\n\n");//false it means either x is not bigger than y and x not equals y.
		
		System.out.println(x);//10
		//x = x+5; 
		x+=5;
		System.out.println(x);//15
		x-=2;
		System.out.println(x);//13
		x*=3;
		System.out.println(x);//39
		x/=4;
		System.out.println(x);//9
		x%=2;
		System.out.println(x);//1
		}
}