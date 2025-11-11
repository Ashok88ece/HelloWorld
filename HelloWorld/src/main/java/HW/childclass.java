package HW;

import org.testng.annotations.Test;

@Test
public class childclass extends HelloWorldClass {
	
	public void childmethod1() {
		
		System.out.println("Child Method 1");
	}
	
	public void childmethod2() {
		System.out.println("Child Method 2");
	}
	
	public static void main(String[] args) {
		
		childclass cobj = new childclass();
		cobj.childmethod1();
		cobj.childmethod2();
		cobj.method1();
		cobj.method2();
		cobj.method3();
	} 

}
