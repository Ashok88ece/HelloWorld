package HW;

import org.testng.annotations.Test;

@Test
public class HelloWorldClass {
	
	public void method1() {
		System.out.println("Method 1 Executed");
	}
	
	public void method2() {
		System.out.println("Method 2 Executed");
	}
	
	public static void method3() {
		System.out.println("No need to create object bcs am static method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloWorldClass obj =new HelloWorldClass();
		obj.method1();
		obj.method2();
		method3();

	}

}
