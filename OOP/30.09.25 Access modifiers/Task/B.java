package PackB;
import PackA.A;
public class B extends A{
	int y;
	
	public B(){
		this.y = 20;
	}
	
	public void gety(){
		System.out.println("AX : "+ this.x);
		System.out.println("BY : "+this.y);
	}
}