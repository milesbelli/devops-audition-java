# Devops Challenge 3
This Java application will print "Hello World!" to the command line. To better demo breaks in Eclipse, it first stores the string inside a variable, `message`, which can then be output to the command line.

Putting a break on the assignment line will show that the variable is not yet in memory.

Putting a break on the line where it calls `System.out.println` will show that the variable is now in memory, but we have not yet printed the line.

A runtime exception will be thrown if the if-statement on line 19 evaluates to `true`.

In that case, the stack trace will appear:

```
Exception in thread "main" java.lang.RuntimeException
	at com.louismitas.hello.world.HelloWorld.main(HelloWorld.java:20)
```

This is telling us the exception occurred on line 20 in the `main` function in the `HelloWorld` class in the package `com.louismitas.hello.world`.
