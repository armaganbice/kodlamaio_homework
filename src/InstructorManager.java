

public class InstructorManager {
	
	public void add(Instructor instructor)
	{
		System.out.println("Instructor "+instructor.getName()+Messages.added);
	}

	public void update(Instructor instructor)
	{
		System.out.println("Instructor "+instructor.getName()+Messages.updated);
	}
	
	public void deleted(Instructor instructor)
	{
		System.out.println("Instructor "+instructor.getName()+Messages.deleted);
	}
	
	public Instructor getById(int id)
	{
		System.out.println("Instructor "+id+Messages.found);
		Instructor instructor=new Instructor();
		return instructor;
	}

	public Instructor[] getAll()
	{
		System.out.println("Instructors "+Messages.listed);
		Instructor instructor=new Instructor();
		Instructor[] instructors= {instructor};
		return instructors;
	}

}
