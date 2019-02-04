/* import static org.junit.Assert.*;

import java.io.PrintStream;
import java.util.Scanner;

import org.junit.Test;

public class HelloWorld {
	public static void main(String[] args) {
	System.out.println("Hello World");
	}
} */

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HelloWorld {
	
   String message = "My Hello World";	
   MessageUtil messageUtil = new MessageUtil(message);

   @Test
   public void testPrintMessage() {
      assertEquals(message,messageUtil.printMessage());
   }
}