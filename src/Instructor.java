

public class Instructor extends User {
	
	private String imageLink;
	private Course[] courses;
	
	public String getImageLink() {
		return imageLink;
	}
	public void setImageLink(String imageLink) {
		this.imageLink = imageLink;
	}
	public Course[] getCourses() {
		return courses;
	}
	public void setCourses(Course[] courses) {
		this.courses = courses;
	}

	public Instructor() {
		super();
	}
	
	public Instructor(int id, String name, String email, String password,String imageLink) {
		super(id, name, email, password);
		// TODO Auto-generated constructor stub
	}

}
