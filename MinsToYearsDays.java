import java.util.Scanner;

public class MinsToYearsDays {

	public static void main(String[] args) {
		Scanner conversion = new Scanner (System.in);
		System.out.print("Enter the number of minutes: " );
		int time = conversion.nextInt();
		int minutesInYear = 365*24*60;
		int years = time / minutesInYear ;
		int days = ( time % minsInYear) / (24*60) ;
		System.out.println(""+time+" minutes is approximately "+years+" years and "+days+" days ");
		

	}

}
