package ATMWorking;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		AtmOperationInterface op = new AtmOperationImpl();
		
		int atmnumber = 12345;
		int atmpin = 12345;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to ATM Machine");
		System.out.println();
		System.out.println("Enter the ATM Number");
		int atmNumber = sc.nextInt();
		System.out.println("Enter the ATM PIN");
		int atmPin = sc.nextInt();
		
		if((atmnumber == atmNumber) && (atmpin == atmPin)){
			while(true) {
				System.out.println("1. View Avalible Balance\n2. Withdraw Amount\n3. Deposit Amount\n4. View Ministatement\n5. Exit");
				System.out.println("Enter the Choice");
				int ch = sc.nextInt();
				
				if(ch==1) {
					op.viewBalance();
					
				}else if(ch==2) {
					System.out.println("Enter amount to Withdraw");
					Double withdrawAmount = sc.nextDouble();
					op.withdrawAmount(withdrawAmount);
					
				}else if(ch==3) {
					System.out.println("Enter Amount to Deposit");
					double depositAmount = sc.nextDouble();
					op.depositAmount(depositAmount);
					
				}else if(ch==4) {
					op.viewMiniStatement();
					
				}else if(ch==5){
					
					System.out.println("Collect your ATM Card\n Thank you for using ATM Machine!!");
				}else {
					System.out.println("Enter the Right Choice");
				}
		    }
	  }else {
		System.out.println("Incorrect ATM Number or Pin ");
		System.exit(0);
	   }

    }
}
