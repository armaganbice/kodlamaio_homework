

public class UserManager {
	
	public void add(User user)
	{
		System.out.println("User "+user.getName()+Messages.added);
	}

	public void update(User user)
	{
		System.out.println("User "+user.getName()+Messages.updated);
	}
	
	public void deleted(User user)
	{
		System.out.println("User "+user.getName()+Messages.deleted);
	}
	
	public User getById(int id)
	{
		System.out.println("User "+id+Messages.found);
		User user=new User();
		return user;
	}

	public User[] getAll()
	{
		System.out.println("Users "+Messages.listed);
		User user=new User();
		User[] users= {user};
		return users;
	}

}
