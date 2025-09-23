class B extends A {
	int y;
	
	B(int y){
		super(20);
		this.y = y;
	}
	
	void getY(){
		System.out.println("BY : "+this.y);
	}
}