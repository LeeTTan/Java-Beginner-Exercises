package Summer;
import java.util.Scanner;
public class Summer{
	static void Lesson153() {
		Scanner in = new Scanner(System.in);
		System.out.println("Input first number:");
		double firstnum = in.nextDouble();
		System.out.println("Input second number:");
		double secnum = in.nextDouble();
		if(firstnum>0&&firstnum<1&&secnum>0&&secnum<1) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	}
	static void Lesson163() {
		Scanner in = new Scanner(System.in);
		System.out.print("Input first number:");
		int num = in.nextInt();
		System.out.println("Binary representation of this number is: "+Integer.toBinaryString(num));
		}
	static void Lesson165() {
		int[] intArr = new int[] { -2,3,4-1,-3,1,2,-4,0} ;
		for(int i = 0;i<intArr.length;i++) {
			System.out.print(intArr[i]);
		}
	}
	static void blockStatement() {
		double students = 30;
		double rooms = 4;
		if(rooms>0) {
			System.out.println(students);
			System.out.println(rooms);
			double avg = students/rooms;
			System.out.println(avg); 
		}
	}
	static void whileLoop() {
		int x = 10;
		while(x<20) {
			System.out.print("value of x : "+x);
			x++;
			System.out.print("\n");
		}
	}
	static void doWhileLoop() {
		int x = 10;
		do {
			System.out.print("value of x: "+x);
			x++;
			System.out.print("\n");
		}while(x<20);{
			
		}
		}
	static void forLoop() {
		for(int x=10;x<20;x++) {
			System.out.print("value of x: "+x);
			System.out.print("\n");
		}
	}
	static void forEachLoop() {
		int[] numbers = {10,20,30,40,50};
		for(int x : numbers) {
			System.out.print(x);
			System.out.print(",");
		}
		System.out.print("\n");
		String [] names = {"James","Larry","Tom","Lacy"};
		for(String name: names) {
			System.out.print(name+ ",");
			
		}
		}
	static void whileLoop() {
		int x = 10;
		while(x=10) {
			System.out.println("FOREVER");
		}
	}
	
public static void main (String[]Args) {
	//Scanner in = new Scanner(System.in);
	//System.out.println("Input first number:");
	//double value1 = in.nextDouble();
	//System.out.println("Input second number:");
	//double value2 = in.nextDouble();
	//System.out.println("Enter character, a for addition, s for subtraction, d for division");
	//String opCode = in.nextLine();
	//if(opCode == "a") {
		//result = value1 + value2;
	//}
	//else if(opCode == "s") {
		//result = value1 - value2;
	//}
	//else if (opCode == "d") {
		//if(value2!=0)
		//result = value1 / value2;
	//}
    //else {
		//result = 0.0d;
    //}
	//System.out.println(result);
	//Lesson165();
	//Lesson163();
	//Lesson153();
	//blockStatement();
	//whileLoop();
	//forLoop();
	forEachLoop();
	}
	
} 
