class Main{
	public static void main(String args[]){
		A obj1 = new A();
		
		obj1.getx();
		obj1.x = 30;
		obj1.getx();
		
		A obj2 = new A();
		obj2.getx();
		obj2.x = 50;
		obj2.getx();
		
		A.getx();
	
	}
}