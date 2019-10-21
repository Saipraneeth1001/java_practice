/*this program shows a small demo of exception handling in java*/
import java.util.Scanner;
class ExceptionDemo {

	public static void main(String[] args){

		int balance = 10000;
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		while(flag == true){

			System.out.println("enter withdraw amount ");
			int amount = sc.nextInt();
			try{

				if(balance-amount>=500){

					balance = balance - amount;
					System.out.println("your current balance is "+balance);
				}
				else{
					throw new UserDefinedException(amount,balance);
				}
			}catch(UserDefinedException e){
					flag = false;
					System.out.println(e.toString(amount,balance));
				}
				
		}
	}
}
