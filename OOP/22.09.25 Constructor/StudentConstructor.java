class StudentConstructor{
	int id;
	String name;
		StudentConstructor(int id,String name){
		this.id = id;
		this.name = name;
	} 
	
	void StudentConstructor(int id,String name){
		this.id = id;
		this.name = name;
	} 
	
	void getStudentConstructor(){
		System.out.println("Id : "+this.id);
		System.out.println("Name : "+this.name);
	}
}