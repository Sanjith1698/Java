class Student{
	int id;
	String name;
	
	void setStudent(){
		this.id = 1000;
		this.name = "Sanjith";
	}
	
	void setStudent(int id){
		this.id = id;
		this.name = "Sanjith";
	}
	
	void setStudent(String name){
		this.id = 3000;
		this.name = name;
	}
		
	void setStudent(String name,int id){
		this.id = id;
		this.name = name;
	}
	
	void setStudent(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	void getStudent(){
		System.out.println("Id : " +this.id);
		System.out.println("Name : " +this.name+"\n");
	}
}