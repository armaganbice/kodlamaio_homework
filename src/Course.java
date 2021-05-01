

public class Course {
	private int id;
	private int categoryId;
	
	private String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Course()
	{
		
	}
	
	public Course(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	

}
