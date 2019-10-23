import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EmployeeTest 
{
	@Test
	void test() 
	{
		Employee e = new Employee("John", "Doe", 13333);
		assertEquals("John Doe\n$13333 annually", e.toString());
	}

}
