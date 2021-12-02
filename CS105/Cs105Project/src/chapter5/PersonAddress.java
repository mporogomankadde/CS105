package chapter5;

public class PersonAddress { 
	private String firstName;
	private String lastName;
    private String email;
    private String tel;
    
    // the default constructor.
    PersonAddress(){
    	firstName= null;
    	lastName= null;
    	email="test@miu.edu";
    	tel="6414727000";
       
        }
    //peremeterized constructor.
    PersonAddress(String firstName,String lastName,String email,String tel){
    	this.firstName= firstName;
    	this.lastName= lastName;
        this.email=( (email.contains("@")&& email.contains("."))? email:"test@miu.edu");
       this.tel=(tel.length()==10)? tel:"6414727000";	
        }
    public String getFirstName() {
    	return firstName;
    	
    }
    public String getLastName() {
    	return lastName;
    	
    }
    public String getEmail() {
    	return email;
    	
    }
    public void setEmail(String email) {
    	 this.email=( (email.contains("@")&& email.contains("."))? email:"Invalid email");
    	
    }
    public String getTel() {
    	return tel;
    	
    }
    public void setTel(String tel) {
    	 this.tel=(tel.length()==10)? tel:"Invalid tel";
   }
   
    @Override
    public String toString() {
    	return ("firstName: "+firstName+"\nLastName: "+lastName+"\nEmail: "+email+"\nTel: "+tel);
    }
    	
    }
    

