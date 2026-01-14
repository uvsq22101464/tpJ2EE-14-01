package composant;

public class HelloWorld {

	public String message;
	
	public String getMessage() {
		return this.message;
	}
	
	public void setMessage(String msg) {
		this.message = msg;
	}
	
	public void display() {
		System.out.print(message);
	}
}
