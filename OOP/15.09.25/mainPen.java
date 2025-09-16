class mainPen{
	
	public static void main(String args[]){
		Pen P;
		
		P = new Pen();
		
		P.brand = "Atlas";
		P.color = "Blue";
		P.madeIn = "Srilanka";
		P.height = 15d;
		P.weight = 58.6d;
		
		P.write();
		
		System.out.println(P.brand);
		System.out.println(P.color);
		System.out.println(P.madeIn);
		System.out.println(P.height);
		System.out.println(P.weight);
	}
}