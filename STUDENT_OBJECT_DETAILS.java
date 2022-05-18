
class Student {
	
	int roll;
	String name;
	int marks;
	
	public static void main(String[] args) {
		
		Student st = new Student();
		
		st.roll=2;
		st.name="Protyush";
		st.marks=80;
		st.displayStudentDetails(st.roll,st.name,st.marks);
		st=null;
		
		Student st2 = new Student();
		
		st2.roll=1;
		st2.name="Sayak";
		st2.marks=70;
		
		st2.displayStudentDetails(st2.roll, st2.name, st2.marks);
		System.out.println(st2);
		st2=null;
		System.out.println(st2);
	}
	
	void displayStudentDetails(int roll, String name, int marks) {
		System.out.println("Roll is : "+roll);
		System.out.println("Name is : "+name);
		System.out.println("Marks is : "+marks);
	}
}
