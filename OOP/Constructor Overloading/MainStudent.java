class MainStudent{
	public static void main(String args[]){
		Student stu1 = new Student();
		stu1.getStudent();
		
		Student stu2 = new Student(1000);
		stu2.getStudent();
		
		Student stu3 = new Student("Sanjith");
		stu3.getStudent();
		
		Student stu4 = new Student("Sanjith",1000);
		stu4.getStudent();
		
		Student stu5 = new Student(1000,"Sanjith");
		stu5.getStudent();
		
	}
} 