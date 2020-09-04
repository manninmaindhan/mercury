package reflection;
//A simple java program used to represent reflection
 import java.lang.reflect.*;
//class whose object is to  be created
 class Test{
	//creating a private field
		private String s;
		
		//creating public constructor
		
		
		public Test() {s="GeeksforGeeks";}
		
		//creating public method with no arguments
		public void method1() {
			System.out.println("The string is "+s);
		}
		
		//creating public method with int as an argument
		public void method2(int n) {
			System.out.println("The num is "+n);
		}
		
		//creating a private method
		private void method3() {
			System.out.println("private method  invoked ");
		}
		
		

		

 }
 
public class Reflection_Demo {
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
//creating object whose property is to be checked
		Test obj=new Test();
		
	//creating class obj from the object using getclass method	
		Class cls=obj.getClass();
		System.out.println("The name of the class is "+cls.getName());
		
		//getting the constructor of the class through the object of the class
		
		Constructor constructor=cls.getConstructor();
		System.out.println("The name of the constructor is "+constructor.getName());
		System.out.println("The public methods of class are :");
		
		//getting methods of a class throught the object of the class by using getMethod
		
		Method[] methods=cls.getMethods();
		
		//getting name of the methods
		
		for(Method method:methods)
			System.out.println(method.getName());
		
		// creates object of desired method by providing the method name
		// and parameter class as the arguments to the getDeclaredMethod
		
		Method methodcall1=cls.getDeclaredMethod("method2", int.class);
		
		//invokes the method at runtime
		methodcall1.invoke(obj, 19);
		
		//creates object of the desired field by providing the name of 
		//the field as the arguments to the getDeclaredField method
		
		Field field=cls.getDeclaredField("s");
		
		//allows the object to access the field irrespective
		//of the access specifiers used with the field
		field.setAccessible(true);
		
		//takes object and the new value to be assigned
		//to the field as argument
		field.set(obj, "JAVA");
		
		//creates object of desired method by providing the method
		//name as argument to the getDeclaredMethod
		Method methodcall2=cls.getDeclaredMethod("method1");
		
		//invokes the method at runtime
		methodcall2.invoke(obj);
		
		//creates object of desired method by providing the method
				//name as argument to the getDeclaredMethod
		
		Method methodcall3=cls.getDeclaredMethod("method3");
		
		//allows the object ot access the method irrespective
		//of the access specifier used with the method
		
		methodcall3.setAccessible(true);
		//invokes the method at runtime
		methodcall3.invoke(obj);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
