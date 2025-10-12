public class Student1 {
	private int id;
	private String name;
	private int mark1;
	private int mark2;
	private int mark3;
	
	public Student1(int id,String name){
		this.id = id;
		this.name = name;
	}
	
	public void setMarks(int mark1,int mark2, int mark3){
		this.mark1 = mark1;
		this.mark2 = mark2;
		this.mark3 = mark3;
	}
	
	private int calTotal(){
		int total = 0;
		total = this.mark1 + this.mark2 + this.mark3;
		return total;
	}
	
	private double calAvg(int total){
		double average = 0.0;
		average = total/3;
		return average;
	}
	
	private char getResult(double average){
		char result;
		if (average>0 && average<30){
			result = 'F';
		}
		else if (average>30 && average<50){
			result = 'S';
		}
		else if (average>50 && average<60){
			result = 'c';
		}
		else if (average>60 && average<75){
			result = 'B';
		}
		else{
			result = 'A';
		}
		
		return result;
	}

	
	public void display(){
		System.out.println("Id : "+id);
		System.out.println("Name : "+name);
		
		System.out.println("Mark 1 : "+mark1);
		System.out.println("Mark 2 : "+mark2);
		System.out.println("Mark 3 : "+mark3);
		
		int total = this.calTotal();
		double average = this.calAvg(total);
		char result = this.getResult(average);
		
		System.out.println("Total : "+total);
		System.out.println("Average : "+average);
		
		System.out.println("Result : "+result);
		
	}
}