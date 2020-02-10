import java.util.*;

public class UserPresentation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose a for integer maniplutation\n       b for float manipulation");
		String sel = sc.next();
		if(sel.equals("a")) {
			System.out.println("Integer Operations : ");
			System.out.println("Choose 1 for addition\n       2 for subtraction\n       3 for multiplication\n       4 for division");
			int choice = sc.nextInt();
			Calculator cal;
			switch(choice) {
			case 1: {
				System.out.println("Enter integers to add : ");
				int a = sc.nextInt();
				int b = sc.nextInt();
				cal = new Add(a,b);
				((Add) cal).add(a,b);
			}
			break;
			case 2: {
				System.out.println("Enter integers to subtract : ");
				int a = sc.nextInt();
				int b = sc.nextInt();
				cal = new Subtract(a,b);
				((Subtract) cal).sub(a,b);
			}
			break;
			case 3: {
				System.out.println("Enter integers to multiply : ");
				int a = sc.nextInt();
				int b = sc.nextInt();
				cal = new Multiply(a,b);
				((Multiply) cal).mul(a,b);
			}
			break;
			case 4: {
				System.out.println("Enter integers to divide : ");
				int a = sc.nextInt();
				int b = sc.nextInt();
				cal = new Divide(a,b);
				((Divide) cal).div(a,b);
			}
			break;
			default: System.out.println("Invalid Option");
			}
		}
		else if(sel.equals("b")) {
			System.out.println("Float Operations : ");
			System.out.println("Choose 1 for addition\n       2 for subtraction\n       3 for multiplication\n       4 for division");
			int choice = sc.nextInt();
			Calculator cal;
			switch(choice) {
			case 1: {
				System.out.println("Enter floats to add : ");
				float a = sc.nextInt();
				float b = sc.nextInt();
				cal = new Add(a,b);
				((Add) cal).add(a,b);
			}
			break;
			case 2: {
				System.out.println("Enter float to subtract : ");
				float a = sc.nextInt();
				float b = sc.nextInt();
				cal = new Subtract(a,b);
				((Subtract) cal).sub(a,b);
			}
			break;
			case 3: {
				System.out.println("Enter float to multiply : ");
				float a = sc.nextInt();
				float b = sc.nextInt();
				cal = new Multiply(a,b);
				((Multiply) cal).mul(a,b);
			}
			break;
			case 4: {
				System.out.println("Enter float to divide : ");
				float a = sc.nextInt();
				float b = sc.nextInt();
				cal = new Divide(a,b);
				((Divide) cal).div(a,b);
			}
			break;
			default: System.out.println("Invalid Option");
			}
		}
		else {
			System.out.println("Invalid Option");
			
		}
	}
}
