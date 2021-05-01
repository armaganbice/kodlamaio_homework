public class main {

	public static void main(String[] args) {
			
		User user1=new User(1,"Armağan Bice","armaganbice@acme.com","password");
		UserManager userManager=new UserManager();
		
		userManager.add(user1);
		user1.setPassword("yenipassword");
		userManager.update(user1);
		userManager.deleted(user1);
		userManager.getById(1);
		userManager.getAll();
		
		Instructor instructor1=new Instructor(1,"Engin Demiroğ","engindemirog@kodlama.io","password","images/engindemirog.jpg");
		InstructorManager instructorManager=new InstructorManager();
	    instructorManager.add(instructor1);
	    instructor1.setPassword("yenipassword");
	    instructorManager.update(instructor1);
	    instructorManager.deleted(instructor1);
	    instructorManager.getById(1);
		instructorManager.getAll();
		
		Student student1=new Student(1,"Derin Demiroğ","derindemirog@kodlama.io","password");
		StudentManager studentManager=new StudentManager();
		studentManager.add(student1);
		student1.setPassword("yenipassword");
		studentManager.update(student1);
		studentManager.delete(student1);
		studentManager.getById(1);
		studentManager.getAll();

	}
}
