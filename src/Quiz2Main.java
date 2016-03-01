import java.util.Scanner;

import org.apache.poi.formula.functions.FinanceLib;

public class Quiz2Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double t;
		System.out.print("Enter Tuition: ");
		t = (scanner.nextDouble());
				
		double b;
		System.out.print("Enter increase in percent: ");
		b = (scanner.nextDouble())/100;
		
		double t2, t3, t4;
		t2 = t * b;
		t3 = t * b;
		t4 = t3 * b;
		
		double A;
		A = t + t4 +t3 + t2;
		
		int c;
		System.out.print("Enter repayment term: ");
		c = (scanner.nextInt())*12;
		
		int APR;
		System.out.print("Enter APR: ");
		APR = (scanner.nextInt())/100;
		
		
		double z = 0;
		boolean f = false;
		double PMT;
		
		PMT = FinanceLib.pmt(APR, c, A, z, f);
		System.out.println("Amount to pay each month: " + (PMT/12)*-1);
		

	}

}
