class A{
	int x;
	int y;
	protected A(){
		this.x = 20;
	}
	
	A(int y){
		this();
		this.y = y;
	}
	
	void getx(){
		System.out.println("AX : "+this.x);
		System.out.println("AY : "+this.y);
	}
}