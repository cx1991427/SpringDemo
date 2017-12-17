package tutorialspoint;

public class HelloWorld {
	private String message;
	
	public void setMessage(String message){
		this.message = message;
	}
	
	public String getMessage(){
		return this.message;
	}
	
	public void displayInfo(){
		System.out.println("Your Message is: "+getMessage());
	}
}
