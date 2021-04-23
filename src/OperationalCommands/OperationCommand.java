package OperationalCommands;

import org.testng.annotations.Test;

public class OperationCommand {

		int a = 33;
		int b = 51;
		int C;
		@Test
		public void add()
		{
			
		C = a + b;
		
		System.out.println("Add Result ; "+C);
	}
		@Test
		public void sub()
		{
			C = a - b;
			
			System.out.println( "Sub Result : "+C);
		}
		@Test
		public void div()
		{
			C = a / b;
			
			System.out.println("div Results : "+C);
		}
		@Test
		public void mul()
		{
			C = a * b;
			
			System.out.println("mul Results : "+C);
		}
		
		

}
