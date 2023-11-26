package abstractTest1Pack;
import java.util.Scanner;

public class TestMain {
	public static void main(String[] args) {
		System.out.println("Enter greeting: ");
		Scanner myScanner = new Scanner(System.in);
		String greetInput = myScanner.next();
		XYZ xyz = new XYZ();
		xyz.FOO();
		String greetings = xyz.DAY(greetInput);
		System.out.print(greetings);
		
		myScanner.close();
	}
	

}
