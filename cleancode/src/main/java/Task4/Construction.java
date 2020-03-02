package Task4;
import java.io.*;
import java.util.*;
public class Construction {
		public static void costPrediction() {
			Scanner sc = new Scanner(System.in);
			PrintStream ps = new PrintStream(new FileOutputStream(FileDescriptor.out));
			ps.println();
			ps.println("CONSTRUCTION COST ESTIMATION");
			ps.println();
			ps.println("Variants Available");
			ps.println("1. Construction with standard materials");
			ps.println("2. Construction with above standard materials");
			ps.println("3. Construction with high standard materials");
			ps.println("4. Construction with high standard materials and fully automated");
			ps.println("Your Choice");
			try {
			int n = sc.nextInt();
			ps.println("Enter Area of the house: ");
			switch(n) {
			case 1:
				ps.println("Cost ="+sc.nextDouble()*1200 );
				break;
			case 2:
				ps.println("Cost ="+sc.nextDouble()*1500 );
				break;
			case 3:
				ps.println("Cost ="+sc.nextDouble()*1800 );
				break;
			case 4:
				ps.println("Cost ="+sc.nextDouble()*2500 );
				break;
			default:
				ps.println("You Entered Invalid input");
			}
			} catch(Exception e) {
				ps.println("You Entered Invalid input");
			}
	}
}