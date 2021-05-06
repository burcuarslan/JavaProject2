package homeWork2;

public class Main {

	public static void main(String[] args) {
		Instructor instructor=new Instructor();
		instructor.setId(1);
		instructor.setFirstName("Engin");
		instructor.setLastName("DEMÝROÐ");
		instructor.setEmail("engindemirog@demirog.com");
		instructor.setAddHomework("Odev1");
		
		Student student=new Student();
		student.setId(2);
		student.setFirstName("Burcu");
		student.setLastName("ARSLAN");
		student.setEmail("burcuarslan@arslan.com");
		student.setComplatedHomework("Odev1");
			
		InstructorManager instructorManager=new InstructorManager();
		instructorManager.addHomework(instructor);
		StudentManager studentManager=new StudentManager();
		studentManager.complatedHomework(student);
	
	}
}
