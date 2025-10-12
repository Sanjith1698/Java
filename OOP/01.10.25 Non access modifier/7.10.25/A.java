class A{
	static final int X;
	
	A(){
		X=20;
	}
	
	void getX(){
		final int z = 10;
		System.out.println("Ax : "+z);
	}
}