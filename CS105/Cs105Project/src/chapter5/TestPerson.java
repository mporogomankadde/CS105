package chapter5;

public class TestPerson {

	public static void main(String[] args) {
		PersonAddress pers1= new PersonAddress(); 
		
		System.out.println(pers1.getFirstName());
		System.out.println(pers1.getLastName());
		System.out.println(pers1.getEmail());
		System.out.println((pers1.getTel()));
		pers1.setEmail("tuhairwe@gmail.com");
		pers1.setTel("2588744632");
		System.out.println(pers1.toString());
		
		PersonAddress pers2= new PersonAddress("ronnie","Tuhairwe","ronnietuhar@gmail.com","3236754019");
		
		System.out.println(pers2.getFirstName());
		System.out.println(pers2.getLastName());
		System.out.println(pers2.getEmail());
		System.out.println((pers2.getTel()));
		pers2.setEmail("wowowwo@gmail.com");
		pers2.setTel("01010101");
		System.out.println(pers2.toString());
	
	}

}
