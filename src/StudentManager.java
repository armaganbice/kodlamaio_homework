

public class StudentManager {
	
	public void add(Student student)
	{
		System.out.println("Student "+student.getName()+Messages.added);
	}

	public void update(Student student)
	{
		System.out.println("Student "+student.getName()+Messages.updated);
	}
	
	public void delete(Student student)
	{
		System.out.println("Student "+student.getName()+Messages.deleted);
	}
	
	public Student getById(int id)
	{
		System.out.println("Student"+id+Messages.found);
		Student student=new Student();
		return student;
	}

	public Student[] getAll()
	{
		System.out.println("Students "+Messages.listed);
		Student student=new Student();
		Student[] students= {student};
		return students;
	}

}
