import java.util.Scanner;

public class TheNextDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int Day = 0;
		int Month = 0;
		int Year = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Year : ");
		Year = input.nextInt();
		
		while(1867 <= Year && Year >= 2017){
			System.out.print("Error, try to enter Year again : ");
			Year = input.nextInt();
		}
		
		System.out.print("Enter Month : ");
		Month = input.nextInt();
		
		while(1 <= Month && Month >= 12){
			System.out.print("Error, try to enter Year again : ");
			Month = input.nextInt();
		}
		
		if(Month == 2){
			if(Year % 4 != 0){
				System.out.print("Error, try to enter Year again : ");
			}
		}
		
	}

}
