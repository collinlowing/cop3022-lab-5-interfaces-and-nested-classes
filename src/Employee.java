
public class Employee 
{
	int salary;
	private Name name;
	
	Employee(String firstName, String lastName, int salary)
	{
		this.name = new Name(firstName, lastName);
		this.salary = salary;
	}
	
	public String toString()
	{
		return name.getName() + "\n" + "$" + this.salary + " annually";
	}
	
	private class Name
	{
		String firstName;
		String lastName;
		
		Name(String firstName, String lastName)
		{
			this.firstName = firstName;
			this.lastName = lastName;
		}
		
		public String getName()
		{
			return this.firstName + " " + this.lastName;
		}
		
	}
	
}
