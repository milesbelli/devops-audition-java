package com.louismitas.hello.world;

public class HelloWorld {

	public static void main(String[] args) {
		
		String message = "Hello World!";	// We can put a break on this line and see 'message' hasn't been set up yet
		
		System.out.println(message);		// We can put a break here to see 'message' is set up but has not yet been printed
		
		/*	When the exception below is thrown, the stack trace will appear as:
		 * 
		 * 		Exception in thread "main" java.lang.RuntimeException
		 * 			at com.louismitas.hello.world.HelloWorld.main(HelloWorld.java:20)
		 * 
		 * 	This is telling us the exception occurred on line 20 in the main function
		 *  in the HelloWorld class in the package com.louismitas.hello.world */
		
		if (true) {
			throw new RuntimeException();
		}
	
	}
	
}
