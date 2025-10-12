class B extends A{
	int y;
	
	B(){
		this.y = 30;
	}
	
	void gety(){
		System.out.println("BX :"+y);
	}
	
	void getx(int x){
		System.out.println("AX :"+x);
		System.out.println("BX :"+x);
	}
}