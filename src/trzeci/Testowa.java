package trzeci;

public class Testowa {

	public static void main(String[] args) {
		System.out.println("Welcome!");
		
		User user = new User();
		user.setName("Tomasz");
		user.setAge(19);
		user.setDescription("blah blah blah");
		
		System.out.println(user.getName() +" is "+ user.getAge() + " old" );
		

	}

}
