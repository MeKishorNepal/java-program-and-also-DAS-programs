package StringS;
//class have final so it can not be subclassed further
 final class Employee{
	//instance variable of the class if final so we can not change
	//the value of it after creating object
	final String pancardNumber;
	
	public Employee(String pancardNumber) {
		this.pancardNumber=pancardNumber;
	}
	public String getPancardNumber() {
		return pancardNumber;
		
		// there is no  setter methods i.e
		//we have no option to change the value of the 
		//instance variable.
	}
	
}

public class ImmutableClass {

	public static void main(String[] args) {
		Employee e=new Employee("ABC123");
		String s1=e.getPancardNumber();
		System.out.println("PancardNumber:"+s1);

	}

}
