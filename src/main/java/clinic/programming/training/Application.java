package clinic.programming.training;

import java.util.ArrayList;
import java.util.List;

public class Application {
	
	public void greet() {
		List<String> greets = new ArrayList<>();
		greets.add("Hello");
		
		for (String  greeting: greets) {
			System.out.println("Greeting: " + greeting);
		}
	}
	
    public Application() {
        System.out.println ("Inside Application");
    }

    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
		System.out.println ("Starting Application");
		Application app = new Application();
		
		app.greet();
    }
}