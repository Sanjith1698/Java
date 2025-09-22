class Student{
	String fname;
	String lname;
	
	Student(String fname, String lname){
		this.fname = fname;
		this.lname = lname;
	}
	
	String getStudent(){
		return this.fname+" "+this.lname;
	}
}